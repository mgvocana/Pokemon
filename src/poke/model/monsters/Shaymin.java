package poke.model.monsters;

import poke.model.types.Grass;

public class Shaymin extends Pokemon implements Grass
{
	public Shaymin ()
	{
		super(492, "Shaymin");
		super.setup(false, 200);
	}
	
	public Shaymin(String name)
	{
		super(492, name);
		super.setup(false, 200);
	}
	
	public Shaymin(int number, String name)
	{
		super(number, name);
		super.setup(false, 200);
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
