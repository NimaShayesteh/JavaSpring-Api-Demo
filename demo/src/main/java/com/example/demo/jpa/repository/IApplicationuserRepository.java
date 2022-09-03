package com.example.demo.jpa.repository;

import com.example.demo.domain.user.applicationuser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IApplicationuserRepository extends JpaRepository<applicationuser, Long> {
}
