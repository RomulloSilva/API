package com.bibliotecars.repositorio;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bibliotecars.domain.User;
import com.bibliotecars.domain.enums.Funcao;


@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING) //Executa os testes em ordem alfabética.
@SpringBootTest
public class UserRepositorioTest {
	@Autowired private UserRepositorio userRepositorio;
	
	
	@Test
	public void AsaveTest() {
		
		User user = new User(1L, "Romulo Conceição", "Romulo.Concei@livro.com", "123", Funcao.Administrador, null, null);
		User createdUser = userRepositorio.save(user);
		
		assertThat(createdUser.getId()).isEqualTo(1L);
	}
	
	@Test
	public void updateTest() {
		
		User user = new User(1L, "Romulo Conceição", "Romulo.Concei@livro.com", "123", Funcao.Administrador, null, null);
		User updateUser = userRepositorio.save(user);
		assertThat(updateUser.getNome()).isEqualTo("Romulo Conceição");
	
	}
	
	@Test
	public void getByIdTest() {
		
		Optional<User> result = userRepositorio.findById(1L);
		User user = result.get();
		
		assertThat(user.getSenha()).isEqualTo("123");
		
	}
	
	@Test
	public void listTest() {
		
		
		List<User> users = userRepositorio.findAll();
		
		assertThat(users.size()).isEqualTo(1);
		
	}
	
	@Test
	public void loginTest() {
		
		Optional<User> result = userRepositorio.login("Romulo.Concei@livro.com", "123");
		User loggedUser = result.get();
		
		assertThat(loggedUser.getId()).isEqualTo(1L);
	}

}
