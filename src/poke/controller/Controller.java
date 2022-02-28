package poke.controller;

import java.util.ArrayList;

import poke.model.monsters.*;
import poke.model.monsters.Pokemon;
import poke.view.PokeFrame;

public class Controller
{
	ArrayList <Pokemon> pokedex;
	String dataFile;
	PokeFrame frame;
	
	public Controller()
	{
		pokedex = new ArrayList <Pokemon> ();
		dataFile = "save.pokemon";
		createPokedex();
		frame = new PokeFrame(this);
	}
	
	public void start()
	{
		ArrayList<Pokemon> loadList  =IOController.loadData(dataFile, frame);
		
		if (loadList != null && loadList.size() > 0)
		{
			this.pokedex = loadList;
		}
	}
	
	private void createPokedex()
	{
		pokedex.add(new Delcatty());
		pokedex.add(new Eevee());
		pokedex.add(new Espeon());
		pokedex.add(new Flareon());
		pokedex.add(new Glaceon());
		pokedex.add(new Jolteon());
		pokedex.add(new Vulpix("Sparky"));
		pokedex.add(new Leafeon());
		pokedex.add(new Vulpix(312, "Fluffers"));
		pokedex.add(new Meowstic());
		pokedex.add(new Shaymin());
		pokedex.add(new Sylveon());
		pokedex.add(new Umbreon());
		pokedex.add(new Vaporeon());
		pokedex.add(new Vulpix());
		pokedex.add(new Pikachu());
	}
	
	public void save()
	{
		IOController.saveData(dataFile, pokedex, frame);
	}
	
	public String [] buildPokedexText()
	{
		String [] pokedexNames = new String [pokedex.size()];
		
		for (int index = 0; index < pokedex.size(); index ++)
		{
			pokedexNames[index] = index + ": " + pokedex.get(index).getName();
		}
		
		return pokedexNames;
	}
	
	public String [] getPokemonData(int index)
	{
		String [] currentPokemonInfo = new String[5];
		
		Pokemon currentPokemon = pokedex.get(index);
		
		currentPokemonInfo[0] = currentPokemon.getName();
		currentPokemonInfo[1] = currentPokemon.isCanEvolve() + "";
		currentPokemonInfo[2] = currentPokemon.getHealth() + "";
		currentPokemonInfo[3] = currentPokemon.getPokedexNumber() + "";
		
		String types = "";
		
		for (String type : currentPokemon.getTypes())
		{
			types += type + "\n";
		}
		
		currentPokemonInfo[4] = types;
		
		return currentPokemonInfo;
	}
}
