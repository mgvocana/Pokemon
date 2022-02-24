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
import java.awt.Dimension;

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
		
		this.layout = new SpringLayout();
		this.name = new JTextField("Name");
		this.number = new JTextField("Pokedex Number");
		this.health = new JTextField("Health");
		this.canEvolve = new JCheckBox("Can evolve");
		this.fieldPanel = new JPanel(new GridLayout());
		this.pokedexSelector = new JComboBox<String>();
		this.pokemonImage = new ImageIcon();
		this.imageLabel = new JLabel();
		this.typePane = new JScrollPane();
		this.typeText = new JTextArea();
		
		setupPanel();
		setupListeners();
		setupLayout();
	}
	
	private void setupPanel()
	{
		this.setLayout(layout);
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(new Color(217, 24, 24));
		
		fieldPanel.add(name);
		fieldPanel.add(health);
		fieldPanel.add(number);
		fieldPanel.add(typePane);
		fieldPanel.add(canEvolve);
		
		this.add(fieldPanel);
		this.add(pokedexSelector);
		this.add(imageLabel);
		
		number.setEditable(false);
		typeText.setEditable(false);
		typeText.setLineWrap(true);
		typeText.setWrapStyleWord(true);
		typePane.setViewportView(typeText);
		typePane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		typePane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
	}
	
	private void setupListeners()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
}
