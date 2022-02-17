package poke.model.monsters;

import poke.model.types.Grass;

public class Leafeon extends Eevee implements Grass
{
	public Leafeon()
	{
		super(470, "Leafeon");
	}
	
	public Leafeon (String name)
	{
		super(470, name);
	}
	
	public Leafeon (int number, String name)
	{
		super(number, name);
	}

	@Override
	public void deadlyVines()
	{
		
	}

	@Override
	public void venusFlyTrap()
	{
		
	}
	
	
}
