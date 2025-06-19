package org.microservices.sops.user_authentication.Service;


import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.microservices.sops.user_authentication.Repository.UserRepository;
import org.springframework.stereotype.Service;
import org.microservices.sops.user_authentication.DTO.UserRequestDto;
import org.microservices.sops.user_authentication.Model.User;
@Service
@Builder
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public User registerUser(UserRequestDto user) {
        if(userRepository.existsByFirstNameAndLastNameAndDob
                (user.getFirstName(),user.getLastName(),user.getDob())) {
            throw new IllegalArgumentException("User Already Present");
        }
        User userRegistration = User.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                . age(user.getAge())
                .dob(user.getDob())
                .address(user.getAddress())
                .zip(user.getZip())
                .country(user.getCountry())
                .email(user.getEmail())
                .contactNo(user.getContactNo())
                .build();
        return userRepository.save(userRegistration);

    }
}
