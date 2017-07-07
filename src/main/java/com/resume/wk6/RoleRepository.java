package com.resume.wk6;

import org.springframework.data.repository.CrudRepository;

import com.resume.wk6.Role;

public interface RoleRepository extends CrudRepository<Role, Long>{
    Role findByRole(String role);
}
