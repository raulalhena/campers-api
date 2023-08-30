package com.campers.campers.DTO;

import jakarta.validation.constraints.*;
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
    @Min(value = 1, message = "Age should be at least 1 year.")
    @Max(value = 120, message = "Age should be lower than 120 years.")
    private Integer age;
}
