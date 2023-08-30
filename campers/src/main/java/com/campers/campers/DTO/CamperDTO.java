package com.campers.campers.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CamperDTO {
    private Integer id;
    @NotEmpty
    @Size(min = 3, message = "Name should have at least 3 characters.")
    private String name;
    @NotEmpty
    @Email (message = "Email should have a valid format.")
    private String userName;
    @NotEmpty
    @Size (min = 4, message = "Password should have at least 4 characters.")
    private String password;
    @NotEmpty
    private Integer age;
}
