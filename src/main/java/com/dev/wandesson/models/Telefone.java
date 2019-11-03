package com.dev.wandesson.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="TELEFONE")
@Table(name="TELEFONE")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
@NoArgsConstructor
@AllArgsConstructor
public class Telefone implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Getter @Setter
	private long id;
	
	@Getter @Setter
	private String numeroDDD;
	
	@Getter @Setter
	private String numeroTelefone;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="contato_id")
	@Getter @Setter
	private Contato contato;	
}
