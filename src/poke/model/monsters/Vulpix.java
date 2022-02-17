package poke.model.monsters;

import poke.model.types.Fire;

public class Vulpix extends Pokemon implements Fire
{
	public Vulpix ()
	{
		super(037, "Vulpix");
	}
	
	public Vulpix(String name)
	{
		super(037, name);
	}
	
	public Vulpix(int number, String name)
	{
		super(number, name);
	}

	@Override
	public void flamethrower()
	{
		
	}

	@Override
	public int fireBall()
	{
		return 0;
	}
}
