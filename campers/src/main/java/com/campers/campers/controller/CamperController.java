package com.campers.campers.controller;

import com.campers.campers.DTO.CamperDTO;
import com.campers.campers.DTO.GetCamperDTO;
import com.campers.campers.converter.CamperDTOConverter;
import com.campers.campers.model.Camper;
import com.campers.campers.service.CamperService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/campers")
public class CamperController {
    @Autowired
    private CamperService camperService;

    @Autowired
    CamperDTOConverter camperDTOConverter;

    @GetMapping
    public List<GetCamperDTO> getCampers() {
        List<Camper> campers = this.camperService.getCampers();
        List<GetCamperDTO> getCampersDTO = new ArrayList<GetCamperDTO>();
        campers.forEach(camper -> {
            getCampersDTO.add(camperDTOConverter.convertCamperToGetCamperDTO(camper));
        });
        return getCampersDTO;
    }

    @PostMapping
    public GetCamperDTO createCamper(@Valid @RequestBody CamperDTO camperDTO) {
        Camper camper = camperDTOConverter.convertCamperDTOToCamper(camperDTO);
        camper = this.camperService.createCamper(camper);

        return camperDTOConverter.convertCamperToGetCamperDTO(camper);
    }

    @GetMapping("/{id}")
    public GetCamperDTO getCamper(@PathVariable Integer id) {
        Optional<Camper> camper = this.camperService.getCamper(id);
        return camperDTOConverter.convertCamperToGetCamperDTO(camper);
    }
}
