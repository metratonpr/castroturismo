package br.com.juliano.domain.viagem;

import br.com.juliano.domain.equipamento.Veiculo;
import br.com.juliano.domain.localizacao.Cidade;
import br.com.juliano.domain.pessoa.Motorista;

/**
 * Classe que contem os dados sobre Rotas
 * 
 * @author Juliano Roque Vieira
 *
 */
public class Rota {

	private Integer id;

	private Motorista motorista;

	private Veiculo veiculo;

	private Double precoKmRodado;

	private Double precoPassagem;

	private Integer numeroDaRota;

	private Double quilometragem;

	private Cidade origem;

	private Cidade destino;

	/**
	 * Metodo Construtor da Classe Rota
	 */
	public Rota() {
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
	 * @return the motorista
	 */
	public Motorista getMotorista() {
		return motorista;
	}

	/**
	 * @param motorista the motorista to set
	 */
	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	/**
	 * @return the veiculo
	 */
	public Veiculo getVeiculo() {
		return veiculo;
	}

	/**
	 * @param veiculo the veiculo to set
	 */
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	/**
	 * @return the precoKmRodado
	 */
	public Double getPrecoKmRodado() {
		return precoKmRodado;
	}

	/**
	 * @param precoKmRodado the precoKmRodado to set
	 */
	public void setPrecoKmRodado(Double precoKmRodado) {
		this.precoKmRodado = precoKmRodado;
	}

	/**
	 * @return the precoPassagem
	 */
	public Double getPrecoPassagem() {
		return precoPassagem;
	}

	/**
	 * @param precoPassagem the precoPassagem to set
	 */
	public void setPrecoPassagem(Double precoPassagem) {
		this.precoPassagem = precoPassagem;
	}

	/**
	 * @return the numeroDaRota
	 */
	public Integer getNumeroDaRota() {
		return numeroDaRota;
	}

	/**
	 * @param numeroDaRota the numeroDaRota to set
	 */
	public void setNumeroDaRota(Integer numeroDaRota) {
		this.numeroDaRota = numeroDaRota;
	}

	/**
	 * @return the quilometragem
	 */
	public Double getQuilometragem() {
		return quilometragem;
	}

	/**
	 * @param quilometragem the quilometragem to set
	 */
	public void setQuilometragem(Double quilometragem) {
		this.quilometragem = quilometragem;
	}

	/**
	 * @return the origem
	 */
	public Cidade getOrigem() {
		return origem;
	}

	/**
	 * @param origem the origem to set
	 */
	public void setOrigem(Cidade origem) {
		this.origem = origem;
	}

	/**
	 * @return the destino
	 */
	public Cidade getDestino() {
		return destino;
	}

	/**
	 * @param destino the destino to set
	 */
	public void setDestino(Cidade destino) {
		this.destino = destino;
	}

	@Override
	public String toString() {
		return String.format(
				"Rota [id = %s, motorista = %s, veiculo = %s, precoKmRodado = %s, precoPassagem = %s, numeroDaRota = %s, quilometragem = %s, origem = %s, destino = %s]",
				id, motorista.getNome(), veiculo.getPlaca(), precoKmRodado, precoPassagem, numeroDaRota, quilometragem,
				origem.getNome(), destino.getNome());
	}

}
