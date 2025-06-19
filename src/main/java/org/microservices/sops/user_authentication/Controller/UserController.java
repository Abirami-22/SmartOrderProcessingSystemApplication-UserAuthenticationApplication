package org.microservices.sops.user_authentication.Controller;

import lombok.Builder;
import org.microservices.sops.user_authentication.DTO.UserRequestDto;
import org.microservices.sops.user_authentication.Model.User;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.microservices.sops.user_authentication.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app/v1/sops")
@RequiredArgsConstructor
@Validated
@Builder
public class UserController {


    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> userRegistration(@Valid @RequestBody UserRequestDto userdto){
        User userResponse = userService.registerUser(userdto);
        return ResponseEntity.ok(userdto.getFirstName() +" has been registered Successfully");
    }

    @GetMapping("/userauth")
    public ResponseEntity<String> testUserAuth(){
        return ResponseEntity.ok("Hello Welcome");
    }
}
