package poke.model.monsters;

import poke.model.types.Grass;

public class Leafeon extends Eevee implements Grass
{
	public Leafeon()
	{
		super(470, "Leafeon");
		super.setup(false, 200);
	}
	
	public Leafeon (String name)
	{
		super(470, name);
		super.setup(false, 200);
	}
	
	public Leafeon (int number, String name)
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
