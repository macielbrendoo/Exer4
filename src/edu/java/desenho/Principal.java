package edu.java.desenho;

import javax.swing.JFrame;

public class Principal {
	public static void main(String[] args) {
		JFrame janela = new JFrame("Desenho");
		Desenho pintura = new Desenho();
		janela.setContentPane(pintura);
		janela.setSize(800,550);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
