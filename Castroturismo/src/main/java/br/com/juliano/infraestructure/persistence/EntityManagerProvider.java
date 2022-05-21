package br.com.juliano.infraestructure.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe responsavel por criar o EntityManager e o EntityManagerFactory
 * 
 * @author mtr
 *
 */

public class EntityManagerProvider {

	private static final EntityManagerProvider INSTANCE = new EntityManagerProvider();

	private static final String BD_PU = "castroturismo";

	private final EntityManagerFactory factory;

	/**
	 * Singleton
	 */
	private EntityManagerProvider() {
		this.factory = Persistence.createEntityManagerFactory(BD_PU);
	}

	/*
	 * Retorna uma instancia da Classe para todo o sistema.
	 */
	public static EntityManagerProvider getInstance() {
		return INSTANCE;
	}

	/**
	 * Retorna um EntityManagerFactory
	 * 
	 * @return EntityManagerFactory
	 */
	public EntityManagerFactory getFactory() {
		return factory;
	}

	/**
	 * Retorna um EntityManager baseado no EntityManagerFactory
	 * 
	 * @return EntityManager
	 */
	public EntityManager createManager() {
		return factory.createEntityManager();
	}

}
