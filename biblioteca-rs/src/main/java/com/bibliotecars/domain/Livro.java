package com.bibliotecars.domain;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.bibliotecars.domain.enums.Pedido;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Através do loongbook podes ter getters and setters, e constructor apenas com
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Livro {
	
	private Long id;
	private String titulo;
	private String descricao;
	private Date dataDeEmprestimo;
	private Pedido pedido;
	private User user;
	private List<Pedido> pedidos = new ArrayList<Pedido>();

}
