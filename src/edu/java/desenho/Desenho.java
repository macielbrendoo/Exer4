package edu.java.desenho;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Desenho extends JPanel {
	public void paint(Graphics g) {
		int j = 500;
		for(int i = 0; i < 500;i+=10) {
			g.drawOval(i, 0, j, 500);
			j -=20;
		}
		j = 500;
		for(int i = 0; i < 500;i+=10) {
			g.drawOval(0, i, 500, j);
			j -=20;
		}
		int [] x = {560, 610, 660};
		int [] y = {50, 0, 50};
		g.drawPolygon(x, y, 3);
		g.drawRect(560, 50, 100, 100);
	}
}
