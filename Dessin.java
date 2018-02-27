
import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class Dessin extends JPanel {
	public void paint(Graphics g) {
		super.paint(g);
		Deplacement depl0node0 = new Deplacement(0.0, 1000.0, 100.0, 1.5, 11.11);
		ArrayList<Deplacement> deplNode0 = new ArrayList<Deplacement>();
		deplNode0.add(depl0node0);
		
		Deplacement depl0node1 = new Deplacement(0.0, 1000.0, 100.0, 1.5, 11.11);
		ArrayList<Deplacement> deplNode1 = new ArrayList<Deplacement>();
		deplNode1.add(depl0node1);
		
		Deplacement depl0node2 = new Deplacement(0.0, 1000.0, 100.0, 1.5, 15.33);
		ArrayList<Deplacement> deplNode2 = new ArrayList<Deplacement>();
		deplNode2.add(depl0node2);
		
		Vehicule node0 = new Vehicule(0, 100.0, 100.0, 1.5, deplNode0);
		Vehicule node1 = new Vehicule(1, 115.0, 100.0, 1.5, deplNode1);
		Vehicule node2 = new Vehicule(2, 161.8, 100.0, 1.5, deplNode2);
		g.drawRect(node0.getPosX(), node0.getPosY(), 10, 10);
		g.drawRect(node1.getPosX(), node1.getPosY(), 10, 10);
		g.drawRect(node2.getPosX(), node2.getPosY(), 10, 10);
	}
}
