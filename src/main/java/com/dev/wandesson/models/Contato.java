package com.dev.wandesson.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="CONTATO")
@Table(name="CONTATO")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
@NoArgsConstructor
@AllArgsConstructor
public class Contato implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Getter @Setter
	private long id;
	
	@NotNull
	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private String categoria;
	
	@OneToMany(mappedBy="contato", targetEntity=Telefone.class, fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@Getter @Setter
	private List<Telefone> telefones;
}
