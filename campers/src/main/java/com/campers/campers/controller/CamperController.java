package com.campers.campers.controller;

import com.campers.campers.DTO.CamperDTO;
import com.campers.campers.DTO.GetCamperDTO;
import com.campers.campers.model.Camper;
import com.campers.campers.service.CamperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public GetCamperDTO createCamper(@RequestBody CamperDTO camperDTO) {
        return this.camperService.createCamper(camperDTO);
    }
}
