package poke.model.monsters;

import poke.model.types.Fire;

public class Flareon extends Eevee implements Fire
{
	public Flareon()
	{
		super(136, "Flareon");
		super.setup(false, 200);
	}
	
	public Flareon (String name)
	{
		super(136, name);
		super.setup(false, 200);
	}
	
	public Flareon (int number, String name)
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
