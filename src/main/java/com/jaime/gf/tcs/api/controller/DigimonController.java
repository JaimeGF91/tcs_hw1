package com.jaime.gf.tcs.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaime.gf.tcs.api.models.Digimon;
import com.jaime.gf.tcs.api.repositories.DigimonRepository;
import com.jaime.gf.tcs.api.request.DigimonRegisterRequest;
import com.jaime.gf.tcs.api.request.DigimonUpdateRequest;
import com.jaime.gf.tcs.api.request.mappers.DigimonRegisterRequestMapper;
import com.jaime.gf.tcs.api.request.mappers.DigimonUpdateRequestMapper;


@RestController
@RequestMapping("/api-digimon")
public class DigimonController {
	
	
	@Autowired
	private DigimonRepository digimonRepository;
	
	
	/**
	 * List all books
	 * @return 
	 */
	@GetMapping
	public ResponseEntity<List<Digimon>> listAll(){
		
		return  ResponseEntity.ok(
					
				digimonRepository.findAll()
				);	
	}
	
	public ResponseEntity<Digimon> findById(
			@PathVariable(name = "id") String id
			){
		Optional<Digimon> optionalBook = digimonRepository.findById(id);
		if(optionalBook.isPresent()) {
			return ResponseEntity.ok(
					optionalBook.get());
		}else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	
	@PostMapping
	public ResponseEntity<Digimon> register(@RequestBody DigimonRegisterRequest request){
		
		return ResponseEntity.ok(

				digimonRepository.save(
							new DigimonRegisterRequestMapper().mapIn(request)
							)
							);
					
	}
	@PutMapping
	public ResponseEntity<Digimon> update(@RequestBody DigimonUpdateRequest request){
		return ResponseEntity.ok(

				digimonRepository.save(
						new DigimonUpdateRequestMapper().mapIn(request)
						)
						);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(
			@PathVariable(name="id") String id
			)
	{
		digimonRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		
	}

}
