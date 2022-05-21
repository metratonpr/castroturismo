package br.com.juliano.application.pessoa;

import br.com.juliano.domain.enumeradores.StatusSeguradoraENUM;
import br.com.juliano.domain.pessoa.Motorista;

/**
 * Classe responsavel por fazer a gestão dos Motoristas
 * 
 * @author Juliano Roque Vieira
 *
 */
public class MotoristaController {

	private Motorista motorista;

	public MotoristaController() {

	}

	public void gravar(String dados[]) {

		motorista = construirNovoMotorista(dados);

	}

	private Motorista construirNovoMotorista(String dados[]) {

		// Setar e tratar os atributos
		String nome = dados[0];
		String endereco = dados[1];
		String bairro = dados[2];
		String cidade = dados[3];
		String estado = dados[4];
		String pais = dados[5];
		String rg = dados[6];
		String orgaoEmissor = dados[7];
		String cpf = dados[8];
		String email = dados[9];
		Long cnh = Long.parseLong(dados[10]);
		String categoria = dados[11];
		Boolean possuiSeguro = dados[12] == "true" ? true : false;

		StatusSeguradoraENUM statusSeguradora;

		switch (Integer.parseInt(dados[13])) {
		case 1:
			statusSeguradora = StatusSeguradoraENUM.PLATINUM;
			break;
		case 2:
			statusSeguradora = StatusSeguradoraENUM.DIAMOND;
			break;
		case 3:
			statusSeguradora = StatusSeguradoraENUM.GOLD;
			break;
		case 4:
			statusSeguradora = StatusSeguradoraENUM.SILVER;
			break;
		case 5:
			statusSeguradora = StatusSeguradoraENUM.BRONZE;
			break;

		default:
			statusSeguradora = StatusSeguradoraENUM.NAO_SEGURADO;
			break;
		}

		// Construir Classe
		motorista = new Motorista();
		motorista.setNome(nome);
		motorista.setEndereco(endereco);
		motorista.setBairro(bairro);
		motorista.setCidade(cidade);
		motorista.setEstado(estado);
		motorista.setPais(pais);
		motorista.setRg(rg);
		motorista.setOrgaoEmissao(orgaoEmissor);
		motorista.setCpf(cpf);
		motorista.setEmail(email);
		motorista.setNumeroCNH(cnh);
		motorista.setCategoriaCNH(categoria);
		motorista.setPossuiSeguro(possuiSeguro);
		motorista.setStatusSeguradora(statusSeguradora);

		return motorista;

	}
}
