package br.com.getnerski.demo.model.auth.repository;

import br.com.getnerski.demo.model.auth.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
