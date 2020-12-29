package org.mrb.authservice.sec.repo;

import org.mrb.authservice.sec.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface AppUserRepository  extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String username);
}
