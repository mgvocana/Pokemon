package poke.view;

import javax.swing.JFrame;

import poke.controller.Controller;

public class PokeFrame extends JFrame
{
	private Controller app;
	
	public PokeFrame(Controller controller)
	{
		super();
		
		this.app = controller;
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setTitle("Pokemon Game");
		this.setSize(800, 600);
		this.setResizable(false);
		this.setVisible(true);
	}
}
