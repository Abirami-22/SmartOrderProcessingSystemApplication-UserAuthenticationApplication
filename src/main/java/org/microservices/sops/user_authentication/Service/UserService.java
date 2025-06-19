package org.microservices.sops.user_authentication.Service;


import org.microservices.sops.user_authentication.DTO.UserRequestDto;
import org.microservices.sops.user_authentication.Model.User;

public interface UserService {
    User registerUser(UserRequestDto user) ;


}
