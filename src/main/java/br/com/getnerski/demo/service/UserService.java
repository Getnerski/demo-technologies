package br.com.getnerski.demo.service;

import br.com.getnerski.demo.enums.Constants;
import br.com.getnerski.demo.model.auth.dto.UserDTO;
import br.com.getnerski.demo.model.auth.entity.UserEntity;
import br.com.getnerski.demo.model.auth.mapper.UserMapper;
import br.com.getnerski.demo.model.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<UserDTO> findAll() {
        return UserMapper.INSTANCE.entityListToDtoList(userRepository.findAll());
    }

    public UserDTO findById(Long id) {
        return UserMapper.INSTANCE.entityToDto(userRepository.findById(id).orElseThrow(() -> new RuntimeException(Constants.NOT_FOUND.getMessage())));
    }

    public UserDTO save(UserEntity user) {
        return UserMapper.INSTANCE.entityToDto(userRepository.save(user));
    }

    public UserDTO update(Long id, UserEntity user) {
        user.setId(id);
        return UserMapper.INSTANCE.entityToDto(userRepository.save(user));
    }

    public String delete(Long id) {
        Optional<UserEntity> user = userRepository.findById(id);
        if(user.isPresent()) {
            userRepository.deleteById(id);
            return Constants.DELETED_SUCCESS.getMessage();
        } else {
            return Constants.DELETED_ERROR.getMessage();
        }
    }

    public String disabled(Long id) {
        Optional<UserEntity> userOptional = userRepository.findById(id);
        if(userOptional.isPresent()) {
            UserEntity user = userOptional.get();
            user.setActive(false);
            userRepository.save(user);
            return Constants.DISABLED_SUCCESS.getMessage();
        } else {
            return Constants.DISABLED_ERROR.getMessage();
        }
    }

}
