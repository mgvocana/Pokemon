package poke.model.monsters;

import poke.model.types.Grass;

public class Shaymin extends Pokemon implements Grass
{
	public Shaymin ()
	{
		super(492, "Shaymin");
	}
	
	public Shaymin(String name)
	{
		super(492, name);
	}
	
	public Shaymin(int number, String name)
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
