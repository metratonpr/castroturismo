package br.com.juliano.infraestructure.io.pessoa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import br.com.juliano.domain.enumeradores.StatusSeguradoraENUM;
import br.com.juliano.domain.pessoa.Motorista;

/**
 * Classe responsavel por gravar dados dos motoristas em arquivo txt
 * 
 * @author Juliano Roque Vieira
 *
 */
public class MotoristaIO {

	private static final String DIRETORIO = ".";

	private static final String NOME_ARQUIVO = "motoristas.txt";

	public void gravar(Motorista motorista) throws Exception {
		// Abre um arquivo
		File file;
		FileWriter fileWriter;
		BufferedWriter bufferedWriter;

		try {
			// Instanciando
			file = new File(DIRETORIO, NOME_ARQUIVO);
			fileWriter = new FileWriter(file, true);
			bufferedWriter = new BufferedWriter(fileWriter);

			// Escrevendo o arquivo
			bufferedWriter.write(motorista.toCsv(), 0, motorista.toCsv().length());
			bufferedWriter.newLine();
			bufferedWriter.close();

		} catch (FileNotFoundException fnfe) {
			throw new Exception("Arquivo não encontrado!");

		} catch (Exception e) {
			throw new Exception("Problemas na gravacao do arquivo!");
		}

	}

	public List<Motorista> ler() throws Exception {

		// Criar variaveis
		List<Motorista> motoristas = null;
		Motorista motorista;
		// Abre um arquivo
		File file;
		FileReader fileReader;
		BufferedReader bufferedReader;
		// Ler o arquivo
		try {
			motoristas = new ArrayList<Motorista>();
			file = new File(DIRETORIO, NOME_ARQUIVO);
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String linha = bufferedReader.readLine();
			while (linha != null) {

				String[] tokens = linha.split(";");

				// Setar e tratar os atributos
				String nome = tokens[0];
				String endereco = tokens[1];
				String bairro = tokens[2];
				String cidade = tokens[3];
				String estado = tokens[4];
				String pais = tokens[5];
				String rg = tokens[6];
				String orgaoEmissor = tokens[7];
				String cpf = tokens[8];
				String telefoneCelular = tokens[9];
				String email = tokens[10];
				Long cnh = Long.parseLong(tokens[11]);
				String categoria = tokens[12];
				Boolean possuiSeguro = tokens[13] == "true" ? true : false;

				StatusSeguradoraENUM statusSeguradora;

				switch (tokens[14]) {
				case "PLATINUM":
					statusSeguradora = StatusSeguradoraENUM.PLATINUM;
					break;
				case "DIAMOND":
					statusSeguradora = StatusSeguradoraENUM.DIAMOND;
					break;
				case "GOLD":
					statusSeguradora = StatusSeguradoraENUM.GOLD;
					break;
				case "SILVER":
					statusSeguradora = StatusSeguradoraENUM.SILVER;
					break;
				case "BRONZE":
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

				// Adcionar a lista
				motoristas.add(motorista);

				// Ler proxima Linha
				linha = bufferedReader.readLine();
			}

			bufferedReader.close();
		} catch (FileNotFoundException fnfe) {
			throw new Exception("Arquivo não encontrado");
		} catch (Exception e) {
			throw new Exception("Problemas de leitura no arquivo de motoristas");
		}

		return motoristas;

	}

}
