package com.jaime.gf.tcs.api.request;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
@Entity
public class DigimonUpdateRequest {
	
	@Id
	@Column(name = "DIGIMON_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	@Column(name = "NAME")
	@NotNull(message = "Name cannot be null")
	private String name;

	@Column(name = "MASTER")
	private String master;
	
	@Column(name = "ATRIBUTO")
	private String atributo;
	
	@Column(name = "TIPO")
	private String tipo;

}
