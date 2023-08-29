package com.campers.campers.repository;

import com.campers.campers.model.Camper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CamperRepository extends JpaRepository<Camper, Integer> {
}
