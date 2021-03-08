package com.Sq006.JWT.repositiories;

import com.Sq006.JWT.models.ERole;
import com.Sq006.JWT.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(ERole name);
}
