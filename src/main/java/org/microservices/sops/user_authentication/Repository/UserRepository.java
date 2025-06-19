package org.microservices.sops.user_authentication.Repository;

import org.microservices.sops.user_authentication.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface UserRepository extends JpaRepository<User,Long> {
    Boolean existsByFirstNameAndLastNameAndDob(String firstName, String lastName, Date dob);
}
