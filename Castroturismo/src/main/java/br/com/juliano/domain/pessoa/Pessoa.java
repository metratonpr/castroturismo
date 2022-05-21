package br.com.juliano.domain.pessoa;

/**
 * Super classe Pessoa
 * 
 * @author Juliano Roque Vieira
 *
 */
public class Pessoa {

	private Integer id;

	private String nome;

	private String endereco;

	private String bairro;

	private String cidade;

	private String estado;

	private String pais;

	/**
	 * Construtor sem argumentos da super classe Pessoa
	 */
	public Pessoa() {

	}

	/**
	 * Construtor com argumentos da super classe Pessoa
	 * 
	 * @param id     - ID do registro
	 * @param nome   - Nome da pessoa
	 * @param bairro - Bairro ou Localidade onde a pessoa mora
	 * @param cidade - Municipio atual da pessoa
	 * @param estado - Estado
	 * @param pais   - Pais
	 */
	public Pessoa(Integer id, String nome, String endereco, String bairro, String cidade, String estado, String pais) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
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
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return the bairro
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * @param bairro the bairro to set
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
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

}
