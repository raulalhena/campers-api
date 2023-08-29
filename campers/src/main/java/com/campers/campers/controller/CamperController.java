package com.campers.campers.controller;

import com.campers.campers.DTO.GetCamperDTO;
import com.campers.campers.model.Camper;
import com.campers.campers.service.CamperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/campers")
public class CamperController {
    @Autowired
    private CamperService camperService;

    @GetMapping
    public List<GetCamperDTO> getCampers() {
        return this.camperService.getCampers();
    }

//    @GetMapping
//    public String getCampers() {
////        return this.camperService.getCampers();
//        return "hola";
//    }
}
