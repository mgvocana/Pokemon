package poke.controller;

import java.util.ArrayList;

import poke.model.monsters.*;
import poke.model.monsters.Pokemon;

public class Controller
{
	ArrayList <Pokemon> pokedex;
	String dataFile;
	
	public Controller()
	{
		pokedex = new ArrayList <Pokemon> ();
		dataFile = "";
		createPokedex();
	}
	
	public void start()
	{
		
	}
	
	private void createPokedex()
	{
		pokedex.add(new Delcatty());
		pokedex.add(new Eevee());
		pokedex.add(new Espeon());
		pokedex.add(new Flareon());
		pokedex.add(new Glaceon());
		pokedex.add(new Jolteon());
		pokedex.add(new Leafeon());
		pokedex.add(new Meowstic());
		pokedex.add(new Shaymin());
		pokedex.add(new Sylveon());
		pokedex.add(new Umbreon());
		pokedex.add(new Vaporeon());
		pokedex.add(new Vulpix());
	}
}
