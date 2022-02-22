package poke.view;

import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.Color;

import poke.controller.Controller;

public class PokePanel extends JPanel
{
	private Controller controller;
	
	public PokePanel(Controller app)
	{
		super();
		
		this.controller = app;
		
		setupPanel();
		setupListeners();
		setupLayout();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
}
