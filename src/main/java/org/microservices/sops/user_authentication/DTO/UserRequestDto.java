package org.microservices.sops.user_authentication.DTO;

import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
@Data
@Builder
public class UserRequestDto {
    private long id;
    @NotNull(message = "FirstName can not be blank")
    @Size(min = 3,max = 20,message = "FirstName must be between 3-20 characters")
    private String firstName;
    @NotNull(message = "LastName can not be blank")
    @Size(min = 3,max = 20,message = "LastName must be between 3-20 characters")
    private String lastName;
    private int age;
    private Date dob;
    @NotBlank(message = "Address can not be blank")
    @Size(min = 3,max = 20,message = "Address must be between 3-40 characters")
    private String address;
    @NotBlank(message = "Zipcode can not be blank")
    @Pattern(regexp = "^\\+?[0-9]{5,6}$",message = "Zipcode must be between 5-6 digits")
    private String zip;
    @NotBlank(message = "Country can not be blank")
    private String country;
    @NotBlank(message = "Email can not be blank")
    @Email(message = "Email should be valid")
    private String email;
    @NotBlank(message = "PhoneNo can not be blank")
    @Pattern(regexp = "^\\+?[0-9]{10,11}$",message = "PhoneNo must be between 10-11 digits")
    private String contactNo;
}
