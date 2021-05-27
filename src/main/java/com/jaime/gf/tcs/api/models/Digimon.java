package com.jaime.gf.tcs.api.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
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
@Table(name = "TBL_DIGIMON")
public class Digimon {
	
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
