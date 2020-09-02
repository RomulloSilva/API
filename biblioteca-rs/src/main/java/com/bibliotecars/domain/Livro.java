package com.bibliotecars.domain;
import java.io.Serializable;
/**************************************************/
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
/**************************************************/
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**************************************************/
import com.bibliotecars.domain.enums.Status;
/**************************************************/
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//Através do lombok pode ter getters and setters, e constructor apenas com
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity (name = " livro")
public class Livro implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column (length = 75, nullable = false)
	private String titulo;
	
	@Column (columnDefinition = "text")
	private String descricao;
	
	@Column (name = "data_De_Emprestimo", nullable = false)
	@Temporal (TemporalType.TIMESTAMP) // Armazena data e horário
	private Date dataDeEmprestimo;
	
	@Column (length = 20, nullable = false)
	@Enumerated (EnumType.STRING)
	private Status status;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@OneToMany (mappedBy = "livro")
	private List<Pedido> pedido = new ArrayList<Pedido> ();
	
	

}
