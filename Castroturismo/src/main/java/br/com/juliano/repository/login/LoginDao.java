package br.com.juliano.repository.login;

import br.com.juliano.domain.security.Login;

public interface LoginDao {

	/**
	 * Busca um Login por ID
	 * 
	 * @param id - Identificador Unico a ser procurado
	 * @return - Objeto do tipo Login
	 */
	Login get(Long id);

	/**
	 * Adcionar um Novo Login no Sistema
	 * 
	 * @param login - Objeto utilizado para entrar no sistema.
	 */
	void add(Login login);

	/**
	 * Atualiza um Login no sistema *
	 * 
	 * @param login - Objeto utilizado para entrar no sistema.
	 */
	void update(Login login);

	/**
	 * Remove um Login do Sistema
	 * 
	 * @param login
	 */
	void remove(Login login);

}
