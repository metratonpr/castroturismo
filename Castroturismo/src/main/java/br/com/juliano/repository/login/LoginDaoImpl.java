package br.com.juliano.repository.login;

import javax.persistence.EntityManager;

import br.com.juliano.domain.security.Login;
import br.com.juliano.infraestructure.persistence.EntityManagerProvider;

public class LoginDaoImpl implements LoginDao {

	EntityManager em = EntityManagerProvider.getInstance().createManager();

	@Override
	public Login get(Long id) {
		return em.find(Login.class, id);
	}

	@Override
	public void add(Login login) {
		em.getTransaction().begin();
		em.persist(login);
		em.getTransaction().commit();

	}

	@Override
	public void update(Login login) {
		em.getTransaction().begin();
		em.merge(login);
		em.getTransaction().commit();

	}

	@Override
	public void remove(Login login) {
		em.remove(login);

	}

}
