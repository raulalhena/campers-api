package com.campers.campers.controller;

import com.campers.campers.model.Camper;
import com.campers.campers.service.CamperService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller("/api/campers")
public class CamperController {
    private CamperService camperService;

    public CamperController(CamperService camperService) {
        this.camperService = camperService;
    }

    @GetMapping
    public List<Camper> getCampers() {
        return this.camperService.getCampers();
    }
}
