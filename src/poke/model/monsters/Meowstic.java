package poke.model.monsters;

import poke.model.types.Psychic;

public class Meowstic extends Pokemon implements Psychic
{
	public Meowstic()
	{
		super(678, "Meowstic");
	}
	
	public Meowstic(String name)
	{
		super(678, name);
	}
	
	public Meowstic(int number, String name)
	{
		super(number, name);
	}

	@Override
	public void mindRead()
	{
		
	}

	@Override
	public void mindControl()
	{
		
	}
}
