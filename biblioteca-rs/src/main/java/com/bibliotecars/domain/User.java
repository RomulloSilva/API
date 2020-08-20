package com.bibliotecars.domain;

//imports para o uso do List e ArrayList.
import java.util.ArrayList;
import java.util.List;
import com.bibliotecars.domain.enums.Pedido;

public class User {
	
	private long id;
	private String nome;
	private String email;
	private String senha;
	//Como o usuário pode ter varios livros adicionamos ele aqui.//
	private List<Livro> livro = new ArrayList<Livro> ();
	private List<Pedido> pedido = new ArrayList<Pedido>();
	
	//Constructor sem argumentos.
	public User() {
		
	}
	
	//construtor com todos os atributos da classe.
	public User(long id, String nome, String email, String senha, List<Livro> livro, List<Pedido> pedido) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
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
