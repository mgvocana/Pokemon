package poke.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import poke.model.monsters.Pokemon;
import poke.view.PokeFrame;

public class IOController
{
	public static ArrayList<Pokemon> loadData(String dataFile, PokeFrame frame)
	{
		ArrayList<Pokemon> pokeList = null;
		
		try (FileInputStream inputStream = new FileInputStream(dataFile); 
				ObjectInputStream input = new ObjectInputStream(inputStream))
		{
			ArrayList <Pokemon> loadedPokemon = new ArrayList<Pokemon>();
			loadedPokemon = (ArrayList<Pokemon>) input.readObject();
			pokeList = loadedPokemon;
		}
		catch(IOException fileError)
		{
			JOptionPane.showMessageDialog(frame, fileError.getMessage(), "Could not read file!", JOptionPane.ERROR_MESSAGE);
		}
		catch(ClassNotFoundException classError)
		{
			JOptionPane.showMessageDialog(frame, classError.getMessage(), "Incorrect class type!", JOptionPane.ERROR_MESSAGE);
		}
		
		return pokeList;
	}
	
	public static void saveData(String dataFile, ArrayList<Pokemon> pokemonList, PokeFrame frame)
	{
		try (FileOutputStream outputStream = new FileOutputStream(dataFile);
				ObjectOutputStream output = new ObjectOutputStream(outputStream))
		{
			output.writeObject(pokemonList);
		}
		catch(IOException fileError)
		{
			JOptionPane.showMessageDialog(frame, fileError.getMessage(), "Saving Error?", JOptionPane.ERROR_MESSAGE);
		}
	}
}
