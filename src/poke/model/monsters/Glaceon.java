package poke.model.monsters;

import poke.model.types.Ice;

public class Glaceon extends Eevee implements Ice
{
	public Glaceon()
	{
		super(471, "Glaceon");
	}
	
	public Glaceon (String name)
	{
		super(471, name);
	}
	
	public Glaceon (int number, String name)
	{
		super(number, name);
	}

	@Override
	public void frostbite()
	{		
		
	}

	@Override
	public void permafrost()
	{
		
	}
}
