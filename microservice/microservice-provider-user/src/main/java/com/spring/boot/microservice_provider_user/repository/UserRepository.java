package com.spring.boot.microservice_provider_user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.boot.microservice_provider_user.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
