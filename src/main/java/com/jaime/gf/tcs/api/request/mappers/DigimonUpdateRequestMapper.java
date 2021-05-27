package com.jaime.gf.tcs.api.request.mappers;

import com.jaime.gf.tcs.api.models.Digimon;
import com.jaime.gf.tcs.api.request.DigimonUpdateRequest;

public class DigimonUpdateRequestMapper {
	
	public Digimon mapIn(DigimonUpdateRequest request) {
		
		Digimon digi = new Digimon();
		digi.setId(request.getId());
		digi.setName(request.getName());
		digi.setMaster(request.getMaster());
		digi.setAtributo(request.getAtributo());
		digi.setTipo(request.getTipo());		
		return digi;
		
	}

}
