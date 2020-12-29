package org.mrb.authservice.sec.repo;

import org.mrb.authservice.sec.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface AppRoleRepository extends JpaRepository<AppRole,Long> {
    AppRole findByRoleName(String rolName);
}
