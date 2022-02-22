package poke.model.monsters;

import poke.model.types.Normal;

public class Eevee extends Pokemon implements Normal
{
	public Eevee()
	{
		super(133, "Eevee");
		super.setup(true, 200);
	}
	
	public Eevee (String name)
	{
		super(133, name);
		super.setup(true, 200);
	}
	
	public Eevee (int number, String name)
	{
		super(number, name);
		super.setup(true, 200);
	}

	@Override
	public void cuddle()
	{
		
	}

	@Override
	public double scream()
	{
		return 0;
	}
}
