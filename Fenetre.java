import javax.swing.JFrame;

public class Fenetre extends JFrame
{	
	public Fenetre() 
	{
		this.setTitle("Outil de Visualisation : TEST");
		this.setSize(1200,800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Dessin pan = new Dessin();
		
		this.setContentPane(pan);
		this.setVisible(true);
	}
}
