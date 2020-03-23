package view;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

import model.Jogada;



public class TesteCassino {

	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("DANIEL");
		nomes.add("MARIA");
		nomes.add("JOSE");
		nomes.add("GUSTAVO");
		nomes.add("FRANCISCO");
		nomes.add("ADRIANO");
		nomes.add("MARTA");
		nomes.add("ALBERTO");
		nomes.add("ROBERTA");
		nomes.add("LULUZINHA");
	
	Semaphore semaforo = new Semaphore(1);
		
		for (int i = 0; i < 10; i++) {
			
			Thread cru = new Jogada(nomes.get(i), semaforo);
			
			
		}

	}

}
