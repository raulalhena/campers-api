package com.campers.campers.service;

import com.campers.campers.DTO.CamperDTO;
import com.campers.campers.DTO.GetCamperDTO;
import com.campers.campers.converter.CamperDTOConverter;
import com.campers.campers.model.Camper;
import com.campers.campers.repository.CamperRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class CamperService {
    @Autowired
    private CamperRepository camperRepository;

    @Autowired
    CamperDTOConverter camperDTOConverter;

    public List<GetCamperDTO> getCampers() {

        List<Camper> campers = this.camperRepository.findAll();
        List<GetCamperDTO> getCampersDTO = new ArrayList<GetCamperDTO>();

        campers.forEach(camper -> {
            getCampersDTO.add(camperDTOConverter.convertCamperToGetCamperDTO(camper));
        });

        return getCampersDTO;
    }

    public GetCamperDTO createCamper(CamperDTO camperDTO) {
        Camper camper = this.camperRepository.save(camperDTOConverter.convertCamperDTOToCamper(camperDTO));
        return camperDTOConverter.convertCamperToGetCamperDTO(camper);
    }

}
