package com.campers.campers.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class GetCamperDTO {

    @NotNull
    private Integer id;
    @NotEmpty
    private String name;
    @NotEmpty
    @Email
    private String userName;
    @NotEmpty
    private Integer age;
}