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
import javax.swing.DefaultComboBoxModel;

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
	
	private JButton saveButton;
	
	public PokePanel(Controller app)
	{
		super();
		
		this.controller = app;
		
		this.layout = new SpringLayout();
		this.name = new JTextField("Name");
		this.number = new JTextField("Pokedex Number");
		this.health = new JTextField("Health");
		this.canEvolve = new JCheckBox("Can evolve");
		this.fieldPanel = new JPanel(new GridLayout(0, 1));
		
		this.pokedexSelector = new JComboBox<String>();
		
		this.pokemonImage = new ImageIcon();
		this.imageLabel = new JLabel("Name and picture go here");
		layout.putConstraint(SpringLayout.WEST, imageLabel, 150, SpringLayout.WEST, this);
		
		this.typePane = new JScrollPane();
		this.typeText = new JTextArea();
		
		this.saveButton = new JButton("Gotta catch them all!");
		
		setupDropDown();
		setupPanel();
		setupListeners();
		setupLayout();
	}
	
	private void setupPanel()
	{
		this.setLayout(layout);
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(new Color(217, 24, 24));
		
		fieldPanel.add(saveButton);
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
		
		updateDisplay("");
		
	}
	
	private void setupListeners()
	{
		saveButton.addActionListener(click -> controller.save());
	}
	
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.NORTH, fieldPanel, 25, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, fieldPanel, -300, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.SOUTH, fieldPanel, -25, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.EAST, fieldPanel, -25, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.WEST, pokedexSelector, 150, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.SOUTH, pokedexSelector, -200, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.EAST, pokedexSelector, -150, SpringLayout.WEST, fieldPanel);
		layout.putConstraint(SpringLayout.NORTH, imageLabel, 150, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.EAST, imageLabel, -100, SpringLayout.WEST, fieldPanel);
	}
	
	private void setupDropDown()
	{
		DefaultComboBoxModel <String> pokeModel = new DefaultComboBoxModel<String>(app.buildPokedexText());
		pokedexSelector.setModel(pokeModel);
	}
	
	private void updateDisplay(String name)
	{
		String path = "/poke/view/images/";
		String defaultName = "Vulpix";
		String extension = ".png";
		
		try
		{
			pokemonImage = new ImageIcon(getClass().getResource(path + name + extension));
		}
		catch (NullPointerException missingFile)
		{
			pokemonImage = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		imageLabel.setIcon(pokemonImage);
	}
}
