package com.bibliotecars.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bibliotecars.domain.Pedido;

@Repository
public interface PedidoRepositorio extends JpaRepository<Pedido, Long> {

	/*
	 * Método para retorna todos os livros dentro do pedido.
	 */
	public List<Pedido> findAllByLivro(Long id);
}
