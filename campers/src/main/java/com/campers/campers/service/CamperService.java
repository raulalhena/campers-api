package com.campers.campers.service;

import com.campers.campers.converter.CamperDTOConverter;
import com.campers.campers.model.Camper;
import com.campers.campers.repository.CamperRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class CamperService {
    @Autowired
    private CamperRepository camperRepository;

    @Autowired
    private CamperDTOConverter camperDTOConverter;

    public List<Camper> getCampers() {

        List<Camper> campers = this.camperRepository.findAll();

        return campers;
    }

    public Camper createCamper(Camper camper) {
        return this.camperRepository.save(camper);
    }

    public Optional<Camper> getCamper(Integer camperId) {
        Optional<Camper> camper = this.camperRepository.findById(camperId);
        return camper;
    }

}
