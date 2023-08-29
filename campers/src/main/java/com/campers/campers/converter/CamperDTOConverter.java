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

    public Camper converGetCamperDTOToCamper(GetCamperDTO getCamperDTO) {
        Camper camper = modelMapper.map(getCamperDTO, Camper.class);

        return camper;
    }
}
