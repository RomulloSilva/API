package com.bibliotecars.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bibliotecars.domain.Livro;
import com.bibliotecars.domain.enums.Status;

@Repository
public interface LivroRepositorio extends JpaRepository<Livro, Long>{
	
	/*
	 * Retorna todos os livros que o usuário ja fez o empréstimo.
	 */
	public List<Livro> findAllByUserId(Long id);
	
	/*
	 * |Método para alterar o status do livro.
	 */
	@Query("UPDATE Livro SET status = ?2 WHERE id = ?1")
	public Livro updateStatus(long id, Status status);
}
