package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.BtInicioControle;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JCheckBox;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	private ArrayList<String> dados;
	private JLabel labelJoga1_1;
	private JLabel labelJoga1_2;
	private JLabel labelJoga2_2;
	private JLabel labelJoga2_1;
	private JLabel labelJoga3_2;
	private JLabel labelJoga3_1;
	private JLabel labelJoga4_2;
	private JLabel labelJoga4_1;
	private JLabel labelJoga5_2;
	private JLabel labelJoga5_1;
	private JLabel labelJoga6_1;
	private JLabel labelJoga6_2;
	private JLabel labelJoga7_1;
	private JLabel labelJoga7_2;
	private JLabel labelJoga8_2;
	private JLabel labelJoga8_1;
	private JLabel labelJoga9_1;
	private JLabel labelJoga9_2;
	private JLabel labelJoga10_1;
	private JLabel labelJoga10_2;
	private JLabel labelJoga11_1;
	private JLabel labelJoga11_2;
	private JLabel labelJoga12_1;
	private JLabel labelJoga12_2;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textFieldPontos1;
	private JTextField textFieldPontos2;
	private JTextField textFieldPontos3;
	private JTextField textFieldPontos4;
	private JTextField textFieldPontos5;
	private JTextField textFieldPontos6;
	private JTextField textFieldPontos7;
	private JTextField textFieldPontos8;
	private JTextField textFieldPontos9;
	private JTextField textFieldPontos10;
	private JTextField textFieldPontos11;
	private JTextField textFieldPontos12;
	private JButton btnInicio;
	private JCheckBox chckbxFimJogo;

	private JLabel lblNewLabel;
	private JLabel lblJogador;
	private JLabel lblJogador_2;
	private JLabel lblJogador_1;
	private JLabel lblJogador_4;
	private JLabel lblJogador_3;
	private JLabel lblJogador_6;
	private JLabel lblJogador_5;
	private JLabel lblJogador_7;
	private JLabel lblJogador_8;
	private JLabel lblJogador_9;
	private JLabel lblJogador_10;
	private JLabel lblNewLabel_1;
	private JLabel lblSegundo;
	private JLabel lblTerceiro;
	

	private JLabel lblPontos;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 953, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		dados = new ArrayList<String>();

		dados.add("/imagem/dado1.jpg");
		dados.add("/imagem/dado2.jpg");
		dados.add("/imagem/dado3.jpg");
		dados.add("/imagem/dado4.jpg");
		dados.add("/imagem/dado5.jpg");
		dados.add("/imagem/dado6.jpg");

		labelJoga1_1 = new JLabel("");
		labelJoga1_1.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagem/dado1.jpg")));
		labelJoga1_1.setBounds(10, 49, 63, 63);
		contentPane.add(labelJoga1_1);

		labelJoga1_2 = new JLabel("");
		labelJoga1_2.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagem/dado1.jpg")));
		labelJoga1_2.setBounds(82, 49, 63, 63);
		contentPane.add(labelJoga1_2);

		labelJoga2_2 = new JLabel("");
		labelJoga2_2.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagem/dado1.jpg")));
		labelJoga2_2.setBounds(234, 49, 63, 63);
		contentPane.add(labelJoga2_2);

		labelJoga2_1 = new JLabel("");
		labelJoga2_1.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagem/dado1.jpg")));
		labelJoga2_1.setBounds(162, 49, 63, 63);
		contentPane.add(labelJoga2_1);

		labelJoga3_2 = new JLabel("");
		labelJoga3_2.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagem/dado1.jpg")));
		labelJoga3_2.setBounds(390, 49, 63, 63);
		contentPane.add(labelJoga3_2);

		labelJoga3_1 = new JLabel("");
		labelJoga3_1.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagem/dado1.jpg")));
		labelJoga3_1.setBounds(318, 49, 63, 63);
		contentPane.add(labelJoga3_1);

		labelJoga9_2 = new JLabel("");
		labelJoga9_2.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagem/dado1.jpg")));
		labelJoga9_2.setBounds(390, 215, 63, 63);
		contentPane.add(labelJoga9_2);

		labelJoga9_1 = new JLabel("");
		labelJoga9_1.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagem/dado1.jpg")));
		labelJoga9_1.setBounds(318, 215, 63, 63);
		contentPane.add(labelJoga9_1);

		labelJoga8_2 = new JLabel("");
		labelJoga8_2.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagem/dado1.jpg")));
		labelJoga8_2.setBounds(234, 215, 63, 63);
		contentPane.add(labelJoga8_2);

		labelJoga7_2 = new JLabel("");
		labelJoga7_2.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagem/dado1.jpg")));
		labelJoga7_2.setBounds(82, 215, 63, 63);
		contentPane.add(labelJoga7_2);

		labelJoga8_1 = new JLabel("");
		labelJoga8_1.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagem/dado1.jpg")));
		labelJoga8_1.setBounds(162, 215, 63, 63);
		contentPane.add(labelJoga8_1);

		labelJoga7_1 = new JLabel("");
		labelJoga7_1.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagem/dado1.jpg")));
		labelJoga7_1.setBounds(10, 215, 63, 63);
		contentPane.add(labelJoga7_1);

		labelJoga10_1 = new JLabel("");
		labelJoga10_1.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagem/dado1.jpg")));
		labelJoga10_1.setBounds(463, 215, 63, 63);
		contentPane.add(labelJoga10_1);

		labelJoga10_2 = new JLabel("");
		labelJoga10_2.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagem/dado1.jpg")));
		labelJoga10_2.setBounds(535, 215, 63, 63);
		contentPane.add(labelJoga10_2);

		labelJoga11_1 = new JLabel("");
		labelJoga11_1.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagem/dado1.jpg")));
		labelJoga11_1.setBounds(619, 215, 63, 63);
		contentPane.add(labelJoga11_1);

		labelJoga11_2 = new JLabel("");
		labelJoga11_2.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagem/dado1.jpg")));
		labelJoga11_2.setBounds(691, 215, 63, 63);
		contentPane.add(labelJoga11_2);

		labelJoga5_2 = new JLabel("");
		labelJoga5_2.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagem/dado1.jpg")));
		labelJoga5_2.setBounds(691, 49, 63, 63);
		contentPane.add(labelJoga5_2);

		labelJoga5_1 = new JLabel("");
		labelJoga5_1.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagem/dado1.jpg")));
		labelJoga5_1.setBounds(619, 49, 63, 63);
		contentPane.add(labelJoga5_1);

		labelJoga4_2 = new JLabel("");
		labelJoga4_2.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagem/dado1.jpg")));
		labelJoga4_2.setBounds(535, 49, 63, 63);
		contentPane.add(labelJoga4_2);

		labelJoga4_1 = new JLabel("");
		labelJoga4_1.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagem/dado1.jpg")));
		labelJoga4_1.setBounds(463, 49, 63, 63);
		contentPane.add(labelJoga4_1);

		labelJoga6_1 = new JLabel("");
		labelJoga6_1.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagem/dado1.jpg")));
		labelJoga6_1.setBounds(764, 49, 63, 63);
		contentPane.add(labelJoga6_1);

		labelJoga6_2 = new JLabel("");
		labelJoga6_2.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagem/dado1.jpg")));
		labelJoga6_2.setBounds(836, 49, 63, 63);
		contentPane.add(labelJoga6_2);

		labelJoga12_1 = new JLabel("");
		labelJoga12_1.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagem/dado1.jpg")));
		labelJoga12_1.setBounds(764, 215, 63, 63);
		contentPane.add(labelJoga12_1);

		labelJoga12_2 = new JLabel("");
		labelJoga12_2.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagem/dado1.jpg")));
		labelJoga12_2.setBounds(836, 215, 63, 63);
		contentPane.add(labelJoga12_2);

		lblNewLabel = new JLabel("JOGADOR 1");
		lblNewLabel.setFont(new Font("Verdana", Font.ITALIC, 14));
		lblNewLabel.setBounds(24, 11, 96, 27);
		contentPane.add(lblNewLabel);

		lblJogador = new JLabel("JOGADOR 2");
		lblJogador.setFont(new Font("Verdana", Font.ITALIC, 14));
		lblJogador.setBounds(182, 11, 96, 27);
		contentPane.add(lblJogador);

		lblJogador_2 = new JLabel("JOGADOR 4");
		lblJogador_2.setFont(new Font("Verdana", Font.ITALIC, 14));
		lblJogador_2.setBounds(500, 11, 96, 27);
		contentPane.add(lblJogador_2);

		lblJogador_1 = new JLabel("JOGADOR 3");
		lblJogador_1.setFont(new Font("Verdana", Font.ITALIC, 14));
		lblJogador_1.setBounds(342, 11, 96, 27);
		contentPane.add(lblJogador_1);

		lblJogador_4 = new JLabel("JOGADOR 6");
		lblJogador_4.setFont(new Font("Verdana", Font.ITALIC, 14));
		lblJogador_4.setBounds(789, 11, 96, 27);
		contentPane.add(lblJogador_4);

		lblJogador_3 = new JLabel("JOGADOR 5");
		lblJogador_3.setFont(new Font("Verdana", Font.ITALIC, 14));
		lblJogador_3.setBounds(631, 11, 96, 27);
		contentPane.add(lblJogador_3);

		lblJogador_6 = new JLabel("JOGADOR 11");
		lblJogador_6.setFont(new Font("Verdana", Font.ITALIC, 14));
		lblJogador_6.setBounds(631, 177, 96, 27);
		contentPane.add(lblJogador_6);

		lblJogador_5 = new JLabel("JOGADOR 12");
		lblJogador_5.setFont(new Font("Verdana", Font.ITALIC, 14));
		lblJogador_5.setBounds(789, 177, 96, 27);
		contentPane.add(lblJogador_5);

		lblJogador_7 = new JLabel("JOGADOR 10");
		lblJogador_7.setFont(new Font("Verdana", Font.ITALIC, 14));
		lblJogador_7.setBounds(500, 177, 96, 27);
		contentPane.add(lblJogador_7);

		lblJogador_8 = new JLabel("JOGADOR 9");
		lblJogador_8.setFont(new Font("Verdana", Font.ITALIC, 14));
		lblJogador_8.setBounds(342, 177, 96, 27);
		contentPane.add(lblJogador_8);

		lblJogador_9 = new JLabel("JOGADOR 8");
		lblJogador_9.setFont(new Font("Verdana", Font.ITALIC, 14));
		lblJogador_9.setBounds(182, 177, 96, 27);
		contentPane.add(lblJogador_9);

		lblJogador_10 = new JLabel("JOGADOR 7");
		lblJogador_10.setFont(new Font("Verdana", Font.ITALIC, 14));
		lblJogador_10.setBounds(24, 177, 96, 27);
		contentPane.add(lblJogador_10);

		btnInicio = new JButton("INICIO");
		btnInicio.setBounds(619, 383, 89, 23);
		contentPane.add(btnInicio);

		textField1 = new JTextField();
		textField1.setEditable(false);
		textField1.setBounds(318, 356, 140, 23);
		contentPane.add(textField1);
		textField1.setColumns(10);

		textField2 = new JTextField();
		textField2.setEditable(false);
		textField2.setColumns(10);
		textField2.setBounds(318, 390, 140, 23);
		contentPane.add(textField2);

		textField3 = new JTextField();
		textField3.setEditable(false);
		textField3.setColumns(10);
		textField3.setBounds(318, 424, 140, 23);
		contentPane.add(textField3);

		lblNewLabel_1 = new JLabel("primeiro");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(234, 360, 63, 14);
		contentPane.add(lblNewLabel_1);

		lblSegundo = new JLabel("segundo");
		lblSegundo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSegundo.setBounds(234, 394, 63, 14);
		contentPane.add(lblSegundo);

		lblTerceiro = new JLabel("terceiro");
		lblTerceiro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTerceiro.setBounds(234, 428, 63, 14);
		contentPane.add(lblTerceiro);

	

		
		textFieldPontos1 = new JTextField();
		//textFieldPontos1.setBackground(Color.WHITE);
		textFieldPontos1.setEditable(false);
		textFieldPontos1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldPontos1.setBounds(73, 123, 22, 27);
		contentPane.add(textFieldPontos1);
		textFieldPontos1.setColumns(10);

		lblPontos = new JLabel("Pontos");
		lblPontos.setFont(new Font("Verdana", Font.ITALIC, 14));
		lblPontos.setBounds(20, 123, 54, 27);
		contentPane.add(lblPontos);

		label = new JLabel("Pontos");
		label.setFont(new Font("Verdana", Font.ITALIC, 14));
		label.setBounds(172, 123, 54, 27);
		contentPane.add(label);

		textFieldPontos2 = new JTextField();
		textFieldPontos2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldPontos2.setEditable(false);
		textFieldPontos2.setColumns(10);
		textFieldPontos2.setBounds(225, 123, 22, 27);
		contentPane.add(textFieldPontos2);

		label_1 = new JLabel("Pontos");
		label_1.setFont(new Font("Verdana", Font.ITALIC, 14));
		label_1.setBounds(328, 123, 54, 27);
		contentPane.add(label_1);

		textFieldPontos3 = new JTextField();
		textFieldPontos3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldPontos3.setEditable(false);
		textFieldPontos3.setColumns(10);
		textFieldPontos3.setBounds(381, 123, 22, 27);
		contentPane.add(textFieldPontos3);

		label_2 = new JLabel("Pontos");
		label_2.setFont(new Font("Verdana", Font.ITALIC, 14));
		label_2.setBounds(473, 123, 54, 27);
		contentPane.add(label_2);

		textFieldPontos4 = new JTextField();
		textFieldPontos4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldPontos4.setEditable(false);
		textFieldPontos4.setColumns(10);
		textFieldPontos4.setBounds(526, 123, 22, 27);
		contentPane.add(textFieldPontos4);

		label_3 = new JLabel("Pontos");
		label_3.setFont(new Font("Verdana", Font.ITALIC, 14));
		label_3.setBounds(629, 123, 54, 27);
		contentPane.add(label_3);

		textFieldPontos5 = new JTextField();
		textFieldPontos5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldPontos5.setEditable(false);
		textFieldPontos5.setColumns(10);
		textFieldPontos5.setBounds(682, 123, 22, 27);
		contentPane.add(textFieldPontos5);

		label_4 = new JLabel("Pontos");
		label_4.setFont(new Font("Verdana", Font.ITALIC, 14));
		label_4.setBounds(774, 123, 54, 27);
		contentPane.add(label_4);

		textFieldPontos6 = new JTextField();
		textFieldPontos6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldPontos6.setEditable(false);
		textFieldPontos6.setColumns(10);
		textFieldPontos6.setBounds(827, 123, 22, 27);
		contentPane.add(textFieldPontos6);

		label_5 = new JLabel("Pontos");
		label_5.setFont(new Font("Verdana", Font.ITALIC, 14));
		label_5.setBounds(20, 289, 54, 27);
		contentPane.add(label_5);

		textFieldPontos7 = new JTextField();
		textFieldPontos7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldPontos7.setEditable(false);
		textFieldPontos7.setColumns(10);
		textFieldPontos7.setBounds(73, 289, 22, 27);
		contentPane.add(textFieldPontos7);

		label_6 = new JLabel("Pontos");
		label_6.setFont(new Font("Verdana", Font.ITALIC, 14));
		label_6.setBounds(172, 289, 54, 27);
		contentPane.add(label_6);

		textFieldPontos8 = new JTextField();
		textFieldPontos8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldPontos8.setEditable(false);
		textFieldPontos8.setColumns(10);
		textFieldPontos8.setBounds(225, 289, 22, 27);
		contentPane.add(textFieldPontos8);

		label_7 = new JLabel("Pontos");
		label_7.setFont(new Font("Verdana", Font.ITALIC, 14));
		label_7.setBounds(328, 289, 54, 27);
		contentPane.add(label_7);

		textFieldPontos9 = new JTextField();
		textFieldPontos9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldPontos9.setEditable(false);
		textFieldPontos9.setColumns(10);
		textFieldPontos9.setBounds(381, 289, 22, 27);
		contentPane.add(textFieldPontos9);

		label_8 = new JLabel("Pontos");
		label_8.setFont(new Font("Verdana", Font.ITALIC, 14));
		label_8.setBounds(473, 289, 54, 27);
		contentPane.add(label_8);

		textFieldPontos10 = new JTextField();
		textFieldPontos10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldPontos10.setEditable(false);
		textFieldPontos10.setColumns(10);
		textFieldPontos10.setBounds(526, 289, 22, 27);
		contentPane.add(textFieldPontos10);

		label_9 = new JLabel("Pontos");
		label_9.setFont(new Font("Verdana", Font.ITALIC, 14));
		label_9.setBounds(629, 289, 54, 27);
		contentPane.add(label_9);

		textFieldPontos11 = new JTextField();
		textFieldPontos11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldPontos11.setEditable(false);
		textFieldPontos11.setColumns(10);
		textFieldPontos11.setBounds(682, 289, 22, 27);
		contentPane.add(textFieldPontos11);

		label_10 = new JLabel("Pontos");
		label_10.setFont(new Font("Verdana", Font.ITALIC, 14));
		label_10.setBounds(774, 289, 54, 27);
		contentPane.add(label_10);

		textFieldPontos12 = new JTextField();
		textFieldPontos12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldPontos12.setEditable(false);
		textFieldPontos12.setColumns(10);
		textFieldPontos12.setBounds(827, 289, 22, 27);
		contentPane.add(textFieldPontos12);
		
		chckbxFimJogo = new JCheckBox("jogar at\u00E9 3 ganhadores");
		chckbxFimJogo.setBounds(619, 424, 175, 41);
		contentPane.add(chckbxFimJogo);
		
		BtInicioControle btInicio = new BtInicioControle(dados, labelJoga1_1, labelJoga1_2, labelJoga2_2, labelJoga2_1,
				labelJoga3_2, labelJoga3_1, labelJoga4_2, labelJoga4_1, labelJoga5_2, labelJoga5_1, labelJoga6_1,
				labelJoga6_2, labelJoga7_1, labelJoga7_2, labelJoga8_2, labelJoga8_1, labelJoga9_1, labelJoga9_2,
				labelJoga10_1, labelJoga10_2, labelJoga11_1, labelJoga11_2, labelJoga12_1, labelJoga12_2, textField1,
				textField2, textField3, textFieldPontos1, textFieldPontos2, textFieldPontos3, textFieldPontos4, textFieldPontos5,
				textFieldPontos6, textFieldPontos7, textFieldPontos8, textFieldPontos9, textFieldPontos10,
				textFieldPontos11, textFieldPontos12, btnInicio, chckbxFimJogo);
		
	


		btnInicio.addActionListener(btInicio);
	}
}
