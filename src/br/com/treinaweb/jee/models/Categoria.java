package br.com.treinaweb.jee.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CAT_CATEGORIAS")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CAT_ID")
	private int id;
	@Column(name = "CAT_NOME", length = 50, nullable = false)
	private String nome;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
