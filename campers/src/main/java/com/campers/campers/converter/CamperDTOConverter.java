package com.campers.campers.converter;

import com.campers.campers.DTO.PostCamperDTO;
import com.campers.campers.DTO.GetCamperDTO;
import com.campers.campers.model.Camper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CamperDTOConverter {
    @Autowired
    private ModelMapper modelMapper;

    public GetCamperDTO convertCamperToGetCamperDTO(Optional<Camper> camper) {
        GetCamperDTO getCamperDTO = modelMapper.map(camper, GetCamperDTO.class);

        return getCamperDTO;
    }
    public GetCamperDTO convertCamperToGetCamperDTO(Camper camper) {
        GetCamperDTO getCamperDTO = modelMapper.map(camper, GetCamperDTO.class);

        return getCamperDTO;
    }
    public PostCamperDTO convertCamperToCamperDTO(Camper camper) {
        PostCamperDTO postCamperDTO = modelMapper.map(camper, PostCamperDTO.class);

        return postCamperDTO;
    }

    public Camper convertGetCamperDTOToCamper(GetCamperDTO getCamperDTO) {
        Camper camper = modelMapper.map(getCamperDTO, Camper.class);

        return camper;
    }

    public Camper convertCamperDTOToCamper(PostCamperDTO postCamperDTO) {
        Camper camper = modelMapper.map(postCamperDTO, Camper.class);

        return camper;
    }
}
