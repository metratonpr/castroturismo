package br.com.juliano.application.pessoa;

import java.util.List;
import java.util.Vector;

import br.com.juliano.domain.enumeradores.StatusSeguradoraENUM;
import br.com.juliano.domain.pessoa.Motorista;
import br.com.juliano.infraestructure.io.pessoa.MotoristaIO;

/**
 * Classe responsavel por fazer a gestão dos Motoristas
 * 
 * @author Juliano Roque Vieira
 *
 */
public class MotoristaController {

	private Motorista motorista;

	private MotoristaIO io;

	private List<Motorista> motoristas;

	public MotoristaController() {

	}

	public void gravar(String dados[]) throws Exception {

		motorista = construirNovoMotorista(dados);

		if (motorista != null) {
			try {
				io = new MotoristaIO();
				io.gravar(motorista);
			} catch (Exception e) {
				throw new Exception("Erro ao gravar arquivo");
			}
		}

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
		String telefoneCelular = dados[9];
		String email = dados[10];
		Long cnh = Long.parseLong(dados[11]);
		String categoria = dados[12];
		Boolean possuiSeguro = dados[13] == "true" ? true : false;

		StatusSeguradoraENUM statusSeguradora;

		switch (Integer.parseInt(dados[14])) {
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
		motorista.setTelefoneCelular(telefoneCelular);
		motorista.setEmail(email);
		motorista.setNumeroCNH(cnh);
		motorista.setCategoriaCNH(categoria);
		motorista.setPossuiSeguro(possuiSeguro);
		motorista.setStatusSeguradora(statusSeguradora);

		// System.out.println(motorista);

		return motorista;

	}

	public void lerArquivo() throws Exception {

		try {
			io = new MotoristaIO();
			motoristas = io.ler();
		} catch (Exception e) {
			throw new Exception("Erro ao ler arquivo");
		}
	}

	/**
	 * @return the motoristas
	 */
	public List<Motorista> getMotoristas() {
		return motoristas;
	}

	public Vector<Vector<Object>> getVectorMotoristas() {
		Vector<Vector<Object>> lista = new Vector<Vector<Object>>();
		for (Motorista motorista : motoristas) {
			Vector<Object> eventoVector = new Vector<Object>();
			eventoVector.add(motorista.getNome());
			eventoVector.add(motorista.getEndereco());
			eventoVector.add(motorista.getBairro());
			eventoVector.add(motorista.getCidade());
			eventoVector.add(motorista.getEstado());
			eventoVector.add(motorista.getPais());
			eventoVector.add(motorista.getRg());
			eventoVector.add(motorista.getOrgaoEmissao());
			eventoVector.add(motorista.getCpf());
			eventoVector.add(motorista.getTelefoneCelular());
			eventoVector.add(motorista.getEmail());
			eventoVector.add(motorista.getNumeroCNH());
			eventoVector.add(motorista.getCategoriaCNH());
			eventoVector.add(motorista.getPossuiSeguro() ? "Sim" : "Não");
			eventoVector.add(motorista.getStatusSeguradora());
			lista.add(eventoVector);
		}

		return lista;
	}

}
