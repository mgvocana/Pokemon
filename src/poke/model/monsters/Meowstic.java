package poke.model.monsters;

import poke.model.types.Psychic;

public class Meowstic extends Pokemon implements Psychic
{
	public Meowstic()
	{
		super(678, "Meowstic");
		super.setup(false, 200);
	}
	
	public Meowstic(String name)
	{
		super(678, name);
		super.setup(false, 200);
	}
	
	public Meowstic(int number, String name)
	{
		super(number, name);
		super.setup(false, 200);
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
