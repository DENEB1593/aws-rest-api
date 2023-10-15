package io.dev.deneb.jpa;

import io.dev.deneb.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
