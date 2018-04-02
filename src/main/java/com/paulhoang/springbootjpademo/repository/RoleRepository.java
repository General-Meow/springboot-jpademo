package com.paulhoang.springbootjpademo.repository;

import com.paulhoang.springbootjpademo.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
