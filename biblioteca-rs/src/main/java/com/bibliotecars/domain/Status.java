package com.bibliotecars.domain;

import java.util.Date;

import com.bibliotecars.domain.enums.Pedido;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Status {
	
	private Long id;
	private Number status;
	private String descricao;
	private Date realizacao;
	private Pedido pedido;
	private Livro livro;
	private User user;
	
	

}
