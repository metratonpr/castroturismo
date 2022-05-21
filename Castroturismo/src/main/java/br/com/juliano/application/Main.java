package br.com.juliano.application;

import br.com.juliano.domain.security.Login;
import br.com.juliano.repository.login.LoginRepositoryImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Castroturismo");
		Login l = new Login();

		l.setUser("root2");

		l.setPassword("123456");

		LoginRepositoryImpl lImpl = new LoginRepositoryImpl();

		// lImpl.add(l);

		long id = 1;

		l = lImpl.get(id);

		System.out.println(l.getUser());

		System.exit(0);

	}

}
