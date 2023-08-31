package com.campers.campers.DTO;

import com.campers.campers.model.Activity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class GetCamperDTO {
    @NotNull
    private Integer id;
    @NotEmpty
    private String name;
    @NotEmpty
    private Integer age;

    @NotEmpty
    private List<Activity> activities;
}