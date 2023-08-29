package com.campers.campers.service;

import com.campers.campers.model.Camper;
import com.campers.campers.repository.CamperRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CamperService {

    private CamperRepository camperRepository;

    public CamperService(CamperRepository camperRepository) {
        this.camperRepository = camperRepository;
    }

    public List<Camper> getCampers() {
        return this.camperRepository.findAll();
    }

}
