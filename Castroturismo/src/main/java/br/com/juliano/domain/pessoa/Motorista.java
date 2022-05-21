package br.com.juliano.domain.pessoa;

import java.util.List;

import br.com.juliano.domain.enumeradores.StatusSeguradoraENUM;
import br.com.juliano.domain.viagem.Rota;

/**
 * Classe que contem os dados relacionados aos Motoristas. Herda da superclasse
 * Pessoa Fisica.
 * 
 * @author mtr
 *
 */
public class Motorista extends PessoaFisica {

	private Long numeroCNH;

	private String categoriaCNH;

	private Boolean possuiSeguro;

	private StatusSeguradoraENUM statusSeguradora;

	List<Rota> rotas;

	/**
	 * Construtor da Classe Motorista
	 */
	public Motorista() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the numeroCNH
	 */
	public Long getNumeroCNH() {
		return numeroCNH;
	}

	/**
	 * @param numeroCNH the numeroCNH to set
	 */
	public void setNumeroCNH(Long numeroCNH) {
		this.numeroCNH = numeroCNH;
	}

	/**
	 * @return the categoriaCNH
	 */
	public String getCategoriaCNH() {
		return categoriaCNH;
	}

	/**
	 * @param categoriaCNH the categoriaCNH to set
	 */
	public void setCategoriaCNH(String categoriaCNH) {
		this.categoriaCNH = categoriaCNH;
	}

	/**
	 * @return the possuiSeguro
	 */
	public Boolean getPossuiSeguro() {
		return possuiSeguro;
	}

	/**
	 * @param possuiSeguro the possuiSeguro to set
	 */
	public void setPossuiSeguro(Boolean possuiSeguro) {
		this.possuiSeguro = possuiSeguro;
	}

	/**
	 * @return the statusSeguradora
	 */
	public StatusSeguradoraENUM getStatusSeguradora() {
		return statusSeguradora;
	}

	/**
	 * @param statusSeguradora the statusSeguradora to set
	 */
	public void setStatusSeguradora(StatusSeguradoraENUM statusSeguradora) {
		this.statusSeguradora = statusSeguradora;
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
		return String.format(
				"Motorista [ nome = %s, numeroCNH = %s, categoriaCNH = %s, possuiPamcary = %s, statusSeguradora = %s]",
				getNome(), numeroCNH, categoriaCNH, possuiSeguro, statusSeguradora);
	}

}
