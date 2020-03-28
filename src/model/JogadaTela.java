package model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Semaphore;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import view.TelaPrincipal;

public class JogadaTela extends Thread {

	private String nome;
	private int pontos = 0;
	private Semaphore controle;
	private static int posicao = 0;
	private static boolean fimJogo;
	private ArrayList<String> dados;
	private JLabel labelJoga1_1;
	private JLabel labelJoga1_2;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textFieldPontos;
	private JButton btnInicio;
	private JCheckBox chckbxFimJogo;

	Random numAleatorio = new Random();

	public JogadaTela(String nome, Semaphore controle, ArrayList<String> dados, JLabel labelJoga1_1,
			JLabel labelJoga1_2, JTextField textField1, JTextField textField2, JTextField textField3,
			JButton btnInicio, JTextField textFieldPontos, JCheckBox chckbxFimJogo) {
		super();
		posicao = 0;
		pontos = 0;
		textField1.setText("");
		textField2.setText("");
		textField3.setText("");
		this.nome = nome;
		this.controle = controle;
		this.dados = dados;
		this.labelJoga1_1 = labelJoga1_1;
		this.labelJoga1_2 = labelJoga1_2;
		this.textField1 = textField1;
		this.textField2 = textField2;
		this.textField3 = textField3;
		this.btnInicio = btnInicio;
		this.textFieldPontos = textFieldPontos;
		this.chckbxFimJogo = chckbxFimJogo;
		textFieldPontos.setText("0");
		
		fimJogo = true;
		
	}

	@Override
	public void run() {
		jogo();

	}

	private void jogo() {
		btnInicio.setEnabled(false);
		chckbxFimJogo.setEnabled(false);

		int dado1;
		int dado2;
		
	

		while (pontos <= 5 && fimJogo) {
		
			

			dado1 = numAleatorio.nextInt(6) + 1;
			dado2 = numAleatorio.nextInt(6) + 1;

			try {
				
				
					labelJoga1_1.setIcon(new ImageIcon(TelaPrincipal.class.getResource(dados.get(numAleatorio.nextInt(dados.size())))));
					labelJoga1_2.setIcon(new ImageIcon(TelaPrincipal.class.getResource(dados.get(numAleatorio.nextInt(dados.size())))));
					sleep(250);
				
			
				labelJoga1_1.setIcon(new ImageIcon(TelaPrincipal.class.getResource(dados.get(dado1-1))));
				labelJoga1_2.setIcon(new ImageIcon(TelaPrincipal.class.getResource(dados.get(dado2-1))));
				
				
				
			

			if ((dado1 + dado2) == 7 || (dado1 + dado2) == 11) {

				pontos++;
				textFieldPontos.setText(String.valueOf(pontos));
				textFieldPontos.setBackground(Color.BLACK);
				sleep(150);
			}
			
			textFieldPontos.setBackground(Color.white);
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		try {
			controle.acquire();
			imprimeVencedor();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			controle.release();
		}

	}

	public void imprimeVencedor() {

		posicao++;

		switch (posicao) {
		case 1:
		 textField1.setText(nome);
		 textField1.setBackground(Color.RED);
		 textFieldPontos.setBackground(Color.RED);
		 
			break;
		case 2:
			 textField2.setText(nome);
			 textField2.setBackground(Color.gray);
			 textFieldPontos.setBackground(Color.gray);
			break;
		case 3:
			 textField3.setText(nome);
			 textField3.setBackground(Color.blue);
			 textFieldPontos.setBackground(Color.blue);
			if(chckbxFimJogo.isSelected()) {
			 fimJogo = false;
			}
			break;
		case 12:
			btnInicio.setEnabled(true);
			chckbxFimJogo.setEnabled(true);
			break;

		default:
			
			break;
		}

		

	}

}
