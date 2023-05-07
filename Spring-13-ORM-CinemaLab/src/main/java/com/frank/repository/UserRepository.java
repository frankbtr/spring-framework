package com.frank.repository;

import com.frank.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    // ------------------- DERIVED QUERIES ------------------- //



    // ------------------- JPQL QUERIES ------------------- //



    // ------------------- NATIVE QUERIES ------------------- //

}
