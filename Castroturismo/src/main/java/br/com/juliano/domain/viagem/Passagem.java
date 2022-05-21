package br.com.juliano.domain.viagem;

import java.util.Date;

import br.com.juliano.domain.pessoa.Atendente;
import br.com.juliano.domain.pessoa.Passageiro;

public class Passagem {

	private Integer id;

	private Passageiro passageiro;

	private Atendente atendente;

	private Rota rota;

	private Double preco;

	private Integer poltrona;

	private boolean foiBaixado;

	private Date dataEmissão;

	/**
	 * Metodo Construtor da Classe Passagem
	 */
	public Passagem() {
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
	 * @return the passageiro
	 */
	public Passageiro getPassageiro() {
		return passageiro;
	}

	/**
	 * @param passageiro the passageiro to set
	 */
	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

	/**
	 * @return the atendente
	 */
	public Atendente getAtendente() {
		return atendente;
	}

	/**
	 * @param atendente the atendente to set
	 */
	public void setAtendente(Atendente atendente) {
		this.atendente = atendente;
	}

	/**
	 * @return the rota
	 */
	public Rota getRota() {
		return rota;
	}

	/**
	 * @param rota the rota to set
	 */
	public void setRota(Rota rota) {
		this.rota = rota;
	}

	/**
	 * @return the preco
	 */
	public Double getPreco() {
		return preco;
	}

	/**
	 * @param preco the preco to set
	 */
	public void setPreco(Double preco) {
		this.preco = preco;
	}

	/**
	 * @return the poltrona
	 */
	public Integer getPoltrona() {
		return poltrona;
	}

	/**
	 * @param poltrona the poltrona to set
	 */
	public void setPoltrona(Integer poltrona) {
		this.poltrona = poltrona;
	}

	/**
	 * @return the foiBaixado
	 */
	public boolean isFoiBaixado() {
		return foiBaixado;
	}

	/**
	 * @param foiBaixado the foiBaixado to set
	 */
	public void setFoiBaixado(boolean foiBaixado) {
		this.foiBaixado = foiBaixado;
	}

	/**
	 * @return the dataEmissão
	 */
	public Date getDataEmissão() {
		return dataEmissão;
	}

	/**
	 * @param dataEmissão the dataEmissão to set
	 */
	public void setDataEmissão(Date dataEmissão) {
		this.dataEmissão = dataEmissão;
	}

	@Override
	public String toString() {
		return String.format(
				"Passagem [id=%s, passageiro=%s, atendente=%s, rota=%s, preco=%s, poltrona=%s, foiBaixado=%s, dataEmissão=%s]",
				id, passageiro.getNome(), atendente.getNome(), rota.getNumeroDaRota(), preco, poltrona, foiBaixado,
				dataEmissão);
	}

}
