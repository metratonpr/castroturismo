package br.com.juliano.domain.equipamento;

import java.util.List;

import br.com.juliano.domain.viagem.Rota;

/**
 * Classe contem os dados sobre veiculos
 * 
 * @author mtr
 *
 */
public class Veiculo {

	private long id;

	private String placa;

	private String marca;

	private String modelo;

	private Integer totalPoltronas;

	private List<Rota> rotas;

	/**
	 * 
	 */
	public Veiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}

	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the totalPoltronas
	 */
	public Integer getTotalPoltronas() {
		return totalPoltronas;
	}

	/**
	 * @param totalPoltronas the totalPoltronas to set
	 */
	public void setTotalPoltronas(Integer totalPoltronas) {
		this.totalPoltronas = totalPoltronas;
	}

	/**
	 * @return the rotas
	 */
	public List<Rota> getRotas() {
		return rotas;
	}

	/**
	 * @param rotas the rotas to set
	 */
	public void setRotas(List<Rota> rotas) {
		this.rotas = rotas;
	}

	@Override
	public String toString() {
		return String.format("Veiculo [id=%s, placa=%s, marca=%s, modelo=%s, totalPoltronas=%s]", id, placa, marca,
				modelo, totalPoltronas);
	}

}
