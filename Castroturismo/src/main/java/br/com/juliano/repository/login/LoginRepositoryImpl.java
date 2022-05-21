package br.com.juliano.repository.login;

import br.com.juliano.domain.security.Login;

public class LoginRepositoryImpl implements LoginRepository {

	private LoginDaoImpl dao = new LoginDaoImpl();

	@Override
	public Login get(Long id) {
		if (id > 0) {
			return dao.get(id);
		} else {
			return null;
		}
	}

	@Override
	public void add(Login login) {
		dao.add(login);

	}

	@Override
	public void update(Login login) {

		dao.update(login);

	}

	@Override
	public void remove(Login login) {
		// TODO Auto-generated method stub
		dao.remove(login);

	}

	@Override
	public boolean validateLogin(Login login) throws LoginException {
		if (login.getUser() == "" || login.getPassword() == "") {
			throw new LoginException("Usuario ou Senha Invalidos");
		}

		return true;
	}

}
