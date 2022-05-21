package br.com.juliano.domain.pessoa;

import java.util.List;

import br.com.juliano.domain.viagem.Passagem;

/**
 * Especialização da Classe Pessoa Fisica Contem os dados de Viagens dos
 * passageiros
 * 
 * @author Juliano Roque Vieira
 *
 */
public class Passageiro extends PessoaFisica {

	private String numeroCartaoDeCredito;

	private List<Passagem> passagem;

	public Passageiro() {
		super();
	}

	/**
	 * @return the numeroCartaoDeCredito
	 */
	public String getNumeroCartaoDeCredito() {
		return numeroCartaoDeCredito;
	}

	/**
	 * @param numeroCartaoDeCredito the numeroCartaoDeCredito to set
	 */
	public void setNumeroCartaoDeCredito(String numeroCartaoDeCredito) {
		this.numeroCartaoDeCredito = numeroCartaoDeCredito;
	}

	/**
	 * @return the passagem
	 */
	public List<Passagem> getPassagem() {
		return passagem;
	}

	/**
	 * @param passagem the passagem to set
	 */
	public void setPassagem(List<Passagem> passagem) {
		this.passagem = passagem;
	}

	@Override
	public String toString() {
		return String.format("Passageiro [numeroCartaoDeCredito = %s, passagem = %s,  Nome() = %s]",
				numeroCartaoDeCredito, passagem, getNome());
	}

}
