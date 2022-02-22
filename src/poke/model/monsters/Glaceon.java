package poke.model.monsters;

import poke.model.types.Ice;

public class Glaceon extends Eevee implements Ice
{
	public Glaceon()
	{
		super(471, "Glaceon");
		super.setup(false, 200);
	}
	
	public Glaceon (String name)
	{
		super(471, name);
		super.setup(false, 200);
	}
	
	public Glaceon (int number, String name)
	{
		super(number, name);
		super.setup(false, 200);
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
