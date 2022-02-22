package poke.view;

import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.Color;

import poke.controller.Controller;

public class PokePanel extends JPanel
{
	private Controller controller;
	private SpringLayout layout;
	
	private JTextField name;
	private JTextField number;
	private JTextField health;
	private JCheckBox canEvolve;
	private JTextArea typeText;
	private JScrollPane typePane;
	private JPanel fieldPanel;
	
	private JLabel imageLabel;
	private ImageIcon pokemonImage;
	private JComboBox<String> pokedexSelector;
	
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
