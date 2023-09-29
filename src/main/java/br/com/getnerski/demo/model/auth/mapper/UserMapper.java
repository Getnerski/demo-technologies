package br.com.getnerski.demo.model.auth.mapper;

import br.com.getnerski.demo.model.auth.dto.UserDTO;
import br.com.getnerski.demo.model.auth.entity.UserEntity;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @Builder(disableBuilder = true))
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO entityToDto(UserEntity entity);

    UserEntity dtoToEntity(UserDTO dto);

    List<UserDTO> entityListToDtoList(List<UserEntity> entity);

    List<UserEntity> dtoListToEntityList(List<UserDTO> dto);

}
