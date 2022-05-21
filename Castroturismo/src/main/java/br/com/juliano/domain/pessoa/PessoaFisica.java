package br.com.juliano.domain.pessoa;

/**
 * Classe contem os dados para trabalhar com uma pessoa fisica Herda da super
 * classe Pessoa
 * 
 * @author Juliano Roque Vieira
 *
 */
public class PessoaFisica extends Pessoa {

	private String telefoneCelular;
	private String email;
	private String rg;
	private String orgaoEmissao;
	private String cpf;

	/**
	 * Classe construtora da Pessoa Fisica. Herda da superclasse Pessoa
	 */
	public PessoaFisica() {
		super();

	}

	/**
	 * @return the telefoneCelular
	 */
	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	/**
	 * @param telefoneCelular the telefoneCelular to set
	 */
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}

	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}

	/**
	 * @return the orgaoEmissao
	 */
	public String getOrgaoEmissao() {
		return orgaoEmissao;
	}

	/**
	 * @param orgaoEmissao the orgaoEmissao to set
	 */
	public void setOrgaoEmissao(String orgaoEmissao) {
		this.orgaoEmissao = orgaoEmissao;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return String.format(
				"PessoaFisica [Id = %s, Nome = %s, getBairro = %s, Cidade = %s, Estado = %s, Pais = %s, telefoneCelular = %s, email = %s, rg = %s, orgaoEmissao = %s, cpf = %s]",
				getId(), getNome(), getBairro(), getCidade(), getEstado(), getPais(), telefoneCelular, email, rg,
				orgaoEmissao, cpf);
	}

}
