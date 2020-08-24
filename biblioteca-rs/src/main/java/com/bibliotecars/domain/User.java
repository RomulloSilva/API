package com.bibliotecars.domain;
/*************************************************/
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
/*************************************************/
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/*************************************************/
import com.bibliotecars.domain.enums.Funcao;

@Entity (name = "user")
public class User {
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) //Gera automaticamente o id)
	private long id;
	
	@Column (length = 75, nullable = false)
	private String nome;
	
	@Column (length = 75, nullable = false, unique = true)
	private String email;
	
	@Column (length = 100, nullable = false)
	private String senha;
	
	@Column (length = 20, nullable = false)
	@Enumerated (EnumType.STRING)
	private Funcao funcao;
	
	//Como o usuário pode ter varios livros adicionamos ele aqui.//
	@OneToMany (mappedBy = "user")
	private List<Livro> livro = new ArrayList<Livro> ();
	
	@OneToMany (mappedBy = "user")
	private List<Pedido> pedido = new ArrayList<Pedido> ();

	
	//Constructor sem argumentos
	public User() {
		
	}
	
	//Constructor com todos os atributos da classe
	public User(long id, String nome, String email, String senha, Funcao funcao, List<Livro> livro, List<Pedido> pedido) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.funcao = funcao;
		this.livro = livro;
		this.pedido = pedido;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	public List<Livro> getLivro() {
		return livro;
	}

	public void setLivro(List<Livro> livro) {
		this.livro = livro;
	}

	public List<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}
	
	
	
	

}
