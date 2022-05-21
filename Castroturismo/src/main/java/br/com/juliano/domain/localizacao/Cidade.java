package br.com.juliano.domain.localizacao;

import java.util.List;

import br.com.juliano.domain.viagem.Rota;

/**
 * Classe contendo os dados das Cidades de Origem e Destino
 * 
 * @author Juliano
 *
 */
public class Cidade {

	private Integer id;

	private String nome;

	private String uf;

	private String pais;

	private List<Rota> origens;

	private List<Rota> destinos;

	/**
	 * Metodo Construtor da Classe Cidade
	 */
	public Cidade() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the uf
	 */
	public String getUf() {
		return uf;
	}

	/**
	 * @param uf the uf to set
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * @return the origens
	 */
	public List<Rota> getOrigens() {
		return origens;
	}

	/**
	 * @param origens the origens to set
	 */
	public void setOrigens(List<Rota> origens) {
		this.origens = origens;
	}

	/**
	 * @return the destinos
	 */
	public List<Rota> getDestinos() {
		return destinos;
	}

	/**
	 * @param destinos the destinos to set
	 */
	public void setDestinos(List<Rota> destinos) {
		this.destinos = destinos;
	}

	@Override
	public String toString() {
		return String.format("Cidade [id=%s, nome=%s, uf=%s, pais=%s]", id, nome, uf, pais);
	}

}
