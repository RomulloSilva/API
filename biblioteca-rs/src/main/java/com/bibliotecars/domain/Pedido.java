package com.bibliotecars.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*****************************************************/
import com.bibliotecars.domain.enums.Status;

import lombok.AllArgsConstructor;
/*****************************************************/
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity (name = "pedido")
public class Pedido {
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (columnDefinition = "text")
	private String descricao;
	
	@Column (name = "data_De_Realizacao", nullable = false)
	@Temporal (TemporalType.TIMESTAMP) //Armazena data e horário
	private Date realizacao;
	
	@Column (length = 20, nullable = false)
	@Enumerated (EnumType.STRING)
	private Status status;
	
	@ManyToOne
	@JoinColumn (name = "livro_id", nullable = false)
	private Livro livro;
	
	@ManyToOne
	@JoinColumn (name = "user_id", nullable = false)
	private User user;

}
