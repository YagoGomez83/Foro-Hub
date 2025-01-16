package com.desafioAlura.restApiForoHubChallenge.repository;


import com.desafioAlura.restApiForoHubChallenge.entity.UserEntity;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserDetails findByUserName(String userName);
    UserEntity getReferenceByEmail(String email);
}
