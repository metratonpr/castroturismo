package br.com.juliano.application;

import br.com.juliano.application.pessoa.MotoristaController;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Castroturismo");
		MotoristaController motoristaController = new MotoristaController();

		String[] dados = new String[14];

		dados[0] = "Joao Da Silva";
		dados[1] = "Rua das Couves";
		dados[2] = "Vila da Horta";
		dados[3] = "Castro";
		dados[4] = "Parana";
		dados[5] = "Brasil";
		dados[6] = "12345678";
		dados[7] = "SSPR";
		dados[8] = "1234567890123";
		dados[9] = "jsilva@provedor.com.br";
		dados[10] = "12345678901234567";
		dados[11] = "AE";
		dados[12] = "true";
		dados[13] = "1";
		motoristaController.gravar(dados);

	}

}
