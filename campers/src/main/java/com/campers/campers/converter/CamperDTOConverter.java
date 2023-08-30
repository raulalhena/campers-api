package com.campers.campers.converter;

import com.campers.campers.DTO.CamperDTO;
import com.campers.campers.DTO.GetCamperDTO;
import com.campers.campers.model.Camper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CamperDTOConverter {
    @Autowired
    private ModelMapper modelMapper;

    public GetCamperDTO convertCamperToGetCamperDTO(Camper camper) {
        GetCamperDTO getCamperDTO = modelMapper.map(camper, GetCamperDTO.class);

        return getCamperDTO;
    }

    public CamperDTO convertCamperToCamperDTO(Camper camper) {
        CamperDTO camperDTO = modelMapper.map(camper, CamperDTO.class);

        return camperDTO;
    }

    public Camper convertGetCamperDTOToCamper(GetCamperDTO getCamperDTO) {
        Camper camper = modelMapper.map(getCamperDTO, Camper.class);

        return camper;
    }

    public Camper convertCamperDTOToCamper(CamperDTO camperDTO) {
        Camper camper = modelMapper.map(camperDTO, Camper.class);

        return camper;
    }
}
