package com.bibliotecars.repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bibliotecars.domain.User;

@Repository
public interface UserRepositorio extends JpaRepository<User, Long> {
	
	/*
	 * Criando métodos de acessos a dados utilizando o getBY, assim o nome
	 * da seu nome ou email.
	 * public User getByNome(String nome);
	 * public User getByEmail(String email);
	 * Esse método pode ser utilizado como login.
	 * public User getByNomeAndSenha(String email, String senha);
	*/
	
	/*Aqui estamos criando um método de acesso onde deve ser buscado o usuário
	 * que tenha seus valores iguais aos digitados na busca ?1 e ?2 são a ordem 
	 * onde pode ser encontrados os valores de emial e senha.
	 * O "Optional" é para fazer um tratemento caso valores nulos sejam inseridos.
	*/
	@Query("SELECT u FROM user u WHERE email= ?1 And senha = ?2")
	public Optional<User> login(String email, String senha);
	

}
