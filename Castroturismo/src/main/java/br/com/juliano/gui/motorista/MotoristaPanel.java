package br.com.juliano.gui.motorista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.juliano.application.pessoa.MotoristaController;

public class MotoristaPanel extends JPanel {
	private JTextField tfID;
	private JTextField tfNome;
	private JTextField tfEndereco;
	private JTextField tfBairro;
	private JTextField tfCidade;
	private JTextField tfUF;
	private JTextField tfPais;
	private JTextField tfRg;
	private JTextField tfEmissor;
	private JTextField tfCPF;
	private JTextField tfTelefone;
	private JTextField tfEmail;
	private JTextField tfCnh;
	private JTextField tfCategoria;
	private JCheckBox chckbxSeguro;
	private JComboBox cbxStatus;
	private MotoristaListaPanel listaPanel;
	private MotoristaController controller;

	/**
	 * Create the panel.
	 */
	public MotoristaPanel(MotoristaListaPanel listaPanel) {

		this.listaPanel = listaPanel;
		setLayout(null);

		JLabel lbID = new JLabel("ID:");
		lbID.setBounds(22, 9, 80, 15);
		add(lbID);

		tfID = new JTextField();
		tfID.setEditable(false);
		tfID.setBounds(120, 8, 80, 17);
		add(tfID);
		tfID.setColumns(10);

		JLabel lbNome = new JLabel("Nome:");
		lbNome.setBounds(22, 37, 70, 15);
		add(lbNome);

		tfNome = new JTextField();
		tfNome.setBounds(120, 35, 300, 19);
		add(tfNome);
		tfNome.setColumns(10);

		JLabel lbEndereco = new JLabel("Endereço:");
		lbEndereco.setBounds(22, 66, 70, 15);
		add(lbEndereco);

		tfEndereco = new JTextField();
		tfEndereco.setBounds(120, 64, 300, 19);
		add(tfEndereco);
		tfEndereco.setColumns(10);

		JLabel lbBairro = new JLabel("Bairro:");
		lbBairro.setBounds(22, 95, 70, 15);
		add(lbBairro);

		tfBairro = new JTextField();
		tfBairro.setBounds(120, 93, 300, 19);
		add(tfBairro);
		tfBairro.setColumns(10);

		JLabel lbCidade = new JLabel("Cidade:");
		lbCidade.setBounds(22, 124, 70, 15);
		add(lbCidade);

		tfCidade = new JTextField();
		tfCidade.setColumns(10);
		tfCidade.setBounds(120, 122, 300, 19);
		add(tfCidade);

		JLabel lblUf = new JLabel("UF:");
		lblUf.setBounds(22, 153, 70, 15);
		add(lblUf);

		tfUF = new JTextField();
		tfUF.setColumns(10);
		tfUF.setBounds(120, 151, 60, 19);
		add(tfUF);

		JLabel lblPais = new JLabel("Pais:");
		lblPais.setBounds(188, 151, 40, 15);
		add(lblPais);

		tfPais = new JTextField();
		tfPais.setColumns(10);
		tfPais.setBounds(225, 149, 195, 19);
		add(tfPais);

		JLabel lbRg = new JLabel("R.G.:");
		lbRg.setBounds(22, 182, 70, 15);
		add(lbRg);

		tfRg = new JTextField();
		tfRg.setColumns(10);
		tfRg.setBounds(120, 180, 114, 19);
		add(tfRg);

		JLabel lblEmissor = new JLabel("Emissor:");
		lblEmissor.setBounds(245, 180, 70, 15);
		add(lblEmissor);

		tfEmissor = new JTextField();
		tfEmissor.setColumns(10);
		tfEmissor.setBounds(320, 178, 100, 19);
		add(tfEmissor);

		JLabel lbCpf = new JLabel("CPF:");
		lbCpf.setBounds(22, 208, 70, 15);
		add(lbCpf);

		tfCPF = new JTextField();
		tfCPF.setColumns(10);
		tfCPF.setBounds(120, 206, 114, 19);
		add(tfCPF);

		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(245, 207, 70, 15);
		add(lblTelefone);

		tfTelefone = new JTextField();
		tfTelefone.setColumns(10);
		tfTelefone.setBounds(320, 206, 100, 19);
		add(tfTelefone);

		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(22, 237, 70, 15);
		add(lblEmail);

		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(120, 235, 300, 19);
		add(tfEmail);

		JLabel lbCnh = new JLabel("CNH:");
		lbCnh.setBounds(22, 266, 70, 15);
		add(lbCnh);

		tfCnh = new JTextField();
		tfCnh.setColumns(10);
		tfCnh.setBounds(120, 264, 141, 19);
		add(tfCnh);

		JLabel lbCategoria = new JLabel("Cat:");
		lbCategoria.setBounds(266, 266, 70, 15);
		add(lbCategoria);

		tfCategoria = new JTextField();
		tfCategoria.setColumns(10);
		tfCategoria.setBounds(340, 266, 80, 19);
		add(tfCategoria);

		JLabel lbSeguro = new JLabel("Seguro:");
		lbSeguro.setBounds(22, 302, 70, 15);
		add(lbSeguro);

		chckbxSeguro = new JCheckBox("Sim");
		chckbxSeguro.setBounds(120, 298, 70, 23);
		add(chckbxSeguro);

		String items[] = { "PLATINUM", "DIAMOND", "GOLD", "SILVER", "BRONZE", "NÃO SEGURADO" };
		cbxStatus = new JComboBox(items);
		cbxStatus.setBounds(266, 297, 154, 24);

		add(cbxStatus);

		JLabel lbStatus = new JLabel("Status:");
		lbStatus.setBounds(198, 302, 60, 15);
		add(lbStatus);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				limparCampos();
			}
		});
		btnLimpar.setBounds(303, 333, 117, 25);
		add(btnLimpar);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gravar();
			}
		});
		btnSalvar.setBounds(174, 333, 117, 25);
		add(btnSalvar);

		limparCampos();

	}

	protected void gravar() {

		controller = new MotoristaController();

		String dados[] = new String[15];
		dados[0] = tfNome.getText();
		dados[1] = tfEndereco.getText();
		dados[2] = tfBairro.getText();
		dados[3] = tfUF.getText();
		dados[4] = tfCidade.getText();
		dados[5] = tfPais.getText();
		dados[6] = tfRg.getText();
		dados[7] = tfEmissor.getText();
		dados[8] = tfCPF.getText();
		dados[9] = tfTelefone.getText();
		dados[10] = tfEmail.getText();
		dados[11] = tfCnh.getText();
		dados[12] = tfCategoria.getText();
		dados[13] = String.valueOf(chckbxSeguro.isSelected());
		dados[14] = String.valueOf(cbxStatus.getSelectedIndex());

		try {
			controller.gravar(dados);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERRO", e.getMessage(), JOptionPane.ERROR_MESSAGE);
		}

		// Alterar para lista
		dados[13] = chckbxSeguro.isSelected() ? "Sim" : "Não";
		dados[14] = cbxStatus.getSelectedItem().toString();

		listaPanel.addNewRow(dados);
		limparCampos();
	}

	protected void limparCampos() {
		tfNome.getText();
		tfEndereco.setText("");
		tfBairro.setText("");
		tfUF.setText("");
		tfCidade.setText("");
		tfPais.setText("");
		tfRg.setText("");
		tfEmissor.setText("");
		tfCPF.setText("");
		tfTelefone.setText("");
		tfEmail.setText("");
		tfCnh.setText("");
		tfCategoria.setText("");
		chckbxSeguro.setSelected(false);
		cbxStatus.setSelectedIndex(5);

	}
}
