package com.dev.wandesson.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="GRUPO")
@Table(name="GRUPO")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
@NoArgsConstructor
@AllArgsConstructor
public class Grupo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Getter @Setter
	private long id;
	
	@NotNull
	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private String descricao;
	
	@ManyToMany
	@JoinTable(name="grupos_contatos", joinColumns = {@JoinColumn(name="grupo_id")}, inverseJoinColumns = {@JoinColumn(name="contato_id")})
	@Getter @Setter
	private List<Contato> contatos;
}
