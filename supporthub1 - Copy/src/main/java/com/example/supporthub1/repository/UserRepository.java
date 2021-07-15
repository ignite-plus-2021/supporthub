package com.example.supporthub1.repository;

import com.example.supporthub1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface UserRepository extends CrudRepository<User,Long> {





}
