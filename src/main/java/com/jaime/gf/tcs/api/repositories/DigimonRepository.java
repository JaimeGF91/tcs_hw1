package com.jaime.gf.tcs.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaime.gf.tcs.api.models.Digimon;



public interface DigimonRepository   extends JpaRepository<Digimon, String>{

}
