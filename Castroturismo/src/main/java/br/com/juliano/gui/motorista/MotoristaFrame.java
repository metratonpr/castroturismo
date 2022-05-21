package br.com.juliano.gui.motorista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

public class MotoristaFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					MotoristaFrame frame = new MotoristaFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MotoristaFrame() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setTitle("Cadastro de Motorista");

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

		MotoristaListaPanel listaPanel = new MotoristaListaPanel();

		tabbedPane.add("Cadastro", new MotoristaPanel(listaPanel));
		tabbedPane.add("Lista", listaPanel);

		contentPane.add(tabbedPane, BorderLayout.CENTER);

	}

}
