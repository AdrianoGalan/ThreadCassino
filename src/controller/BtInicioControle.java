package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import model.JogadaTela;

public class BtInicioControle implements ActionListener {
	
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
	Semaphore controle = new Semaphore(1);
	
	public BtInicioControle(ArrayList<String> dados, JLabel labelJoga1_1, JLabel labelJoga1_2, JLabel labelJoga2_2,
			JLabel labelJoga2_1, JLabel labelJoga3_2, JLabel labelJoga3_1, JLabel labelJoga4_2, JLabel labelJoga4_1,
			JLabel labelJoga5_2, JLabel labelJoga5_1, JLabel labelJoga6_1, JLabel labelJoga6_2, JLabel labelJoga7_1,
			JLabel labelJoga7_2, JLabel labelJoga8_2, JLabel labelJoga8_1, JLabel labelJoga9_1, JLabel labelJoga9_2,
			JLabel labelJoga10_1, JLabel labelJoga10_2, JLabel labelJoga11_1, JLabel labelJoga11_2,
			JLabel labelJoga12_1, JLabel labelJoga12_2, JTextField textField1, JTextField textField2,
			JTextField textField3,JTextField textFieldPontos1, JTextField textFieldPontos2, JTextField textFieldPontos3,
			JTextField textFieldPontos4, JTextField textFieldPontos5, JTextField textFieldPontos6,
			JTextField textFieldPontos7, JTextField textFieldPontos8, JTextField textFieldPontos9,
			JTextField textFieldPontos10, JTextField textFieldPontos11, JTextField textFieldPontos12, JButton btnInicio) {
		super();
		this.dados = dados;
		this.labelJoga1_1 = labelJoga1_1;
		this.labelJoga1_2 = labelJoga1_2;
		this.labelJoga2_2 = labelJoga2_2;
		this.labelJoga2_1 = labelJoga2_1;
		this.labelJoga3_2 = labelJoga3_2;
		this.labelJoga3_1 = labelJoga3_1;
		this.labelJoga4_2 = labelJoga4_2;
		this.labelJoga4_1 = labelJoga4_1;
		this.labelJoga5_2 = labelJoga5_2;
		this.labelJoga5_1 = labelJoga5_1;
		this.labelJoga6_1 = labelJoga6_1;
		this.labelJoga6_2 = labelJoga6_2;
		this.labelJoga7_1 = labelJoga7_1;
		this.labelJoga7_2 = labelJoga7_2;
		this.labelJoga8_2 = labelJoga8_2;
		this.labelJoga8_1 = labelJoga8_1;
		this.labelJoga9_1 = labelJoga9_1;
		this.labelJoga9_2 = labelJoga9_2;
		this.labelJoga10_1 = labelJoga10_1;
		this.labelJoga10_2 = labelJoga10_2;
		this.labelJoga11_1 = labelJoga11_1;
		this.labelJoga11_2 = labelJoga11_2;
		this.labelJoga12_1 = labelJoga12_1;
		this.labelJoga12_2 = labelJoga12_2;
		this.textField1 = textField1;
		this.textField2 = textField2;
		this.textField3 = textField3;
		this.textFieldPontos1 = textFieldPontos1;
		this.textFieldPontos2 = textFieldPontos2;
		this.textFieldPontos3 = textFieldPontos3;
		this.textFieldPontos4 = textFieldPontos4;
		this.textFieldPontos5 = textFieldPontos5;
		this.textFieldPontos6 = textFieldPontos6;
		this.textFieldPontos7 = textFieldPontos7;
		this.textFieldPontos8 = textFieldPontos8;
		this.textFieldPontos9 = textFieldPontos9;
		this.textFieldPontos10 = textFieldPontos10;
		this.textFieldPontos11 = textFieldPontos11;
		this.textFieldPontos12 = textFieldPontos12;
		this.btnInicio = btnInicio;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		iniciaThread();

	}
	
	private void iniciaThread() {
		
		Thread j1 = new JogadaTela("JOGADOR 1", controle, dados, labelJoga1_1, labelJoga1_2, textField1, textField2, textField3, btnInicio, textFieldPontos1);
		j1.start();
	//	textFieldPontos1.setText("11");
		Thread j2 = new JogadaTela("JOGADOR 2", controle, dados, labelJoga2_1, labelJoga2_2, textField1, textField2, textField3, btnInicio, textFieldPontos2);
		j2.start();
		Thread j3 = new JogadaTela("JOGADOR 3", controle, dados, labelJoga3_1, labelJoga3_2, textField1, textField2, textField3, btnInicio, textFieldPontos3);
		j3.start();
		Thread j4 = new JogadaTela("JOGADOR 4", controle, dados, labelJoga4_1, labelJoga4_2, textField1, textField2, textField3, btnInicio, textFieldPontos4);
		j4.start();
		Thread j5 = new JogadaTela("JOGADOR 5", controle, dados, labelJoga5_1, labelJoga5_2, textField1, textField2, textField3, btnInicio, textFieldPontos5);
		j5.start();
		Thread j6 = new JogadaTela("JOGADOR 6", controle, dados, labelJoga6_1, labelJoga6_2, textField1, textField2, textField3, btnInicio, textFieldPontos6);
		j6.start();
		Thread j7 = new JogadaTela("JOGADOR 7", controle, dados, labelJoga7_1, labelJoga7_2, textField1, textField2, textField3, btnInicio, textFieldPontos7);
		j7.start();
		Thread j8 = new JogadaTela("JOGADOR 8", controle, dados, labelJoga8_1, labelJoga8_2, textField1, textField2, textField3, btnInicio, textFieldPontos8);
		j8.start();
		Thread j9 = new JogadaTela("JOGADOR 9", controle, dados, labelJoga9_1, labelJoga9_2, textField1, textField2, textField3, btnInicio, textFieldPontos9);
		j9.start();
		Thread j10 = new JogadaTela("JOGADOR 10", controle, dados, labelJoga10_1, labelJoga10_2, textField1, textField2, textField3, btnInicio, textFieldPontos10);
		j10.start();
		Thread j11 = new JogadaTela("JOGADOR 11", controle, dados, labelJoga11_1, labelJoga11_2, textField1, textField2, textField3, btnInicio, textFieldPontos11);
		j11.start();
		Thread j12 = new JogadaTela("JOGADOR 12", controle, dados, labelJoga12_1, labelJoga12_2, textField1, textField2, textField3, btnInicio, textFieldPontos12);
		j12.start();
		
	
	}

}
