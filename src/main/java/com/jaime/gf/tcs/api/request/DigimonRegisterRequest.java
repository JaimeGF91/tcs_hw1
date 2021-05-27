package com.jaime.gf.tcs.api.request;

import javax.persistence.Column;
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
public class DigimonRegisterRequest {
	
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
