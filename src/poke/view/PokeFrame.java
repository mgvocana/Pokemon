package poke.view;

import javax.swing.JFrame;

import poke.controller.Controller;

public class PokeFrame extends JFrame
{
	private Controller app;
	private PokePanel panel;
	
	public PokeFrame(Controller controller)
	{
		super();
		
		this.app = controller;
		
		panel = new PokePanel(app);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setTitle("Pokemon Game");
		this.setContentPane(panel);
		this.setSize(800, 600);
		this.setResizable(false);
		this.setVisible(true);
	}
}
