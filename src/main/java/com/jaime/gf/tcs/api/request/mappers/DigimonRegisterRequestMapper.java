package com.jaime.gf.tcs.api.request.mappers;

import com.jaime.gf.tcs.api.models.Digimon;
import com.jaime.gf.tcs.api.request.DigimonRegisterRequest;


public class DigimonRegisterRequestMapper {
	
	public Digimon mapIn(DigimonRegisterRequest request) {
		Digimon digi = new Digimon();
		digi.setName(request.getName());
		digi.setMaster(request.getMaster());
		digi.setAtributo(request.getAtributo());
		digi.setTipo(request.getTipo());		
		return digi;
		
	}

}
