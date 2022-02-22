package poke.model.monsters;

import poke.model.types.Fire;

public class Vulpix extends Pokemon implements Fire
{
	public Vulpix ()
	{
		super(037, "Vulpix");
		super.setup(false, 200);
	}
	
	public Vulpix(String name)
	{
		super(037, name);
		super.setup(false, 200);
	}
	
	public Vulpix(int number, String name)
	{
		super(number, name);
		super.setup(false, 200);
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
