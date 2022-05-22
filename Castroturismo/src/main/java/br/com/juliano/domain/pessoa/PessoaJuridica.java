package br.com.juliano.domain.pessoa;

/**
 * Classe com dados das pessoas Juridicas. Herda da classe Pessoa.
 * 
 * @author mtr
 *
 */
public class PessoaJuridica extends Pessoa {

	private String cnpj;

	private String inscricaoEstadual;

	/**
	 * Metodo Construtor da Pessoa Juridica
	 */
	public PessoaJuridica() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * @return the inscricaoEstadual
	 */
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	/**
	 * @param inscricaoEstadual the inscricaoEstadual to set
	 */
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

}
