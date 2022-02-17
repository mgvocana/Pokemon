package poke.model.monsters;

import poke.model.types.Electric;

public class Jolteon extends Eevee implements Electric
{
	public Jolteon()
	{
		super(135, "Jolteon");
	}
	
	public Jolteon (String name)
	{
		super(135, name);
	}
	
	public Jolteon (int number, String name)
	{
		super(number, name);
	}

	@Override
	public void shock()
	{
		
	}

	@Override
	public void electricute()
	{
		
	}
}
