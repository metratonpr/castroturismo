package br.com.juliano.domain.pessoa;

import java.util.List;

import br.com.juliano.domain.viagem.Passagem;

/**
 * Classe que contem os dados sobre o atendente
 * 
 * @author Juliano
 *
 */
public class Atendente extends PessoaFisica {

	private Integer numeroAgencia;

	private String telefoneAgencia;

	private List<Passagem> passagens;

	/**
	 * 
	 */
	public Atendente() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the numeroAgencia
	 */
	public Integer getNumeroAgencia() {
		return numeroAgencia;
	}

	/**
	 * @param numeroAgencia the numeroAgencia to set
	 */
	public void setNumeroAgencia(Integer numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	/**
	 * @return the telefoneAgencia
	 */
	public String getTelefoneAgencia() {
		return telefoneAgencia;
	}

	/**
	 * @param telefoneAgencia the telefoneAgencia to set
	 */
	public void setTelefoneAgencia(String telefoneAgencia) {
		this.telefoneAgencia = telefoneAgencia;
	}

	@Override
	public String toString() {
		return String.format("Atendente [ nome = %s, numeroAgencia = %s, telefoneAgencia = %s]", getNome(),
				numeroAgencia, telefoneAgencia);
	}

}
