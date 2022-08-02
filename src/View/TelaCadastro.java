package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Endere\u00E7o");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel.setForeground(SystemColor.activeCaption);
		lblNewLabel.setBounds(26, 71, 77, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tela de cadastro");
		lblNewLabel_1.setForeground(SystemColor.activeCaption);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(121, 11, 205, 22);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(121, 71, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setForeground(SystemColor.activeCaption);
		lblNumero.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNumero.setBounds(230, 71, 58, 22);
		contentPane.add(lblNumero);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(312, 71, 86, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Pizza");
		lblNewLabel_2_1.setForeground(SystemColor.activeCaption);
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(26, 99, 70, 22);
		contentPane.add(lblNewLabel_2_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"...", "Calabresa.", "Portuguesa.", "Marguerita.", "Frango com catupiry.", "Mu\u00E7arela.", "Napolitana.", "Brigadeiro", "Romeu e Julieta", "Creme de avel\u00E3 com frutas", "Calif\u00F3rnia"}));
		comboBox.setBounds(121, 100, 277, 22);
		contentPane.add(comboBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Com borda");
		rdbtnNewRadioButton.setBounds(26, 128, 108, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnSemBorda = new JRadioButton("Sem borda");
		rdbtnSemBorda.setBounds(226, 128, 120, 23);
		contentPane.add(rdbtnSemBorda);
		
		JLabel lblMensagem = new JLabel("Mensagem");
		lblMensagem.setForeground(SystemColor.activeCaption);
		lblMensagem.setFont(new Font("Arial", Font.PLAIN, 15));
		lblMensagem.setBounds(26, 228, 86, 22);
		contentPane.add(lblMensagem);
		
		JLabel lblNome = new JLabel("Nome\r\n");
		lblNome.setForeground(SystemColor.activeCaption);
		lblNome.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNome.setBounds(26, 44, 77, 22);
		contentPane.add(lblNome);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(121, 44, 277, 20);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("Fazer pedido");
		btnNewButton.setForeground(SystemColor.activeCaption);
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(156, 296, 120, 23);
		contentPane.add(btnNewButton);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(121, 226, 277, 59);
		contentPane.add(textPane);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"...", "Coca-cola", "Antartica", "Sprite", "Fanta-uva", "Fanta-guaran\u00E1", "Fanta-laranja"}));
		comboBox_1.setBounds(121, 161, 277, 22);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Bebida");
		lblNewLabel_2_1_1.setForeground(SystemColor.activeCaption);
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_2_1_1.setBounds(26, 161, 85, 22);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Sobremesa");
		lblNewLabel_2_1_1_1.setForeground(SystemColor.activeCaption);
		lblNewLabel_2_1_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_2_1_1_1.setBounds(26, 193, 85, 22);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"...", "Pizza doce (Chocolate com morango)"}));
		comboBox_1_1.setBounds(121, 194, 277, 22);
		contentPane.add(comboBox_1_1);
	}
}
