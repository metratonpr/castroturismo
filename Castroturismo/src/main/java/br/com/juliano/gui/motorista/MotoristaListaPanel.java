package br.com.juliano.gui.motorista;

import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

import br.com.juliano.application.pessoa.MotoristaController;

public class MotoristaListaPanel extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public MotoristaListaPanel() {
		setLayout(null);

		setBounds(100, 100, 920, 440);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 10, 910, 390);
		add(scrollPane);

		table = new JTable(getDataColumns(), getNameColumns());
		table.setBounds(5, 5, 890, 380);

		scrollPane.setViewportView(table);

	}

	private Vector<String> getNameColumns() {
		Vector<String> nameColumns = new Vector<String>();
		nameColumns.add("Nome");
		nameColumns.add("Endereco");
		nameColumns.add("Bairro");
		nameColumns.add("Cidade");
		nameColumns.add("Estado");
		nameColumns.add("Pais");
		nameColumns.add("RG");
		nameColumns.add("Emissor");
		nameColumns.add("CPF");
		nameColumns.add("telefoneCelular");
		nameColumns.add("E-mail");
		nameColumns.add("CNH");
		nameColumns.add("Categoria");
		nameColumns.add("Seguro?");
		nameColumns.add("Status");
		return nameColumns;
	}

	private Vector<? extends Vector> getDataColumns() {
		// TODO Auto-generated method stub
		MotoristaController controller;
		Vector<Vector<Object>> dataColumns = null;

		try {
			controller = new MotoristaController();
			controller.lerArquivo();

			dataColumns = controller.getVectorMotoristas();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return dataColumns;
	}

	public void addNewRow(Object[] valores) {
		((DefaultTableModel) table.getModel()).addRow(valores);
	}

}
