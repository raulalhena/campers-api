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
    @Min(value = 8, message = "Age should be at least 8 years.")
    @Max(value = 18, message = "Age shouldn't be higher than 18 years.")
    private Integer age;
}
