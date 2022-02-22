package poke.model.monsters;

import poke.model.types.Electric;

public class Jolteon extends Eevee implements Electric
{
	public Jolteon()
	{
		super(135, "Jolteon");
		super.setup(false, 200);
	}
	
	public Jolteon (String name)
	{
		super(135, name);
		super.setup(false, 200);
	}
	
	public Jolteon (int number, String name)
	{
		super(number, name);
		super.setup(false, 200);
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
