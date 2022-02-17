package poke.model.monsters;

import poke.model.types.Normal;

public class Delcatty extends Pokemon implements Normal
{
	public Delcatty()
	{
		super(301, "Delcatty");
	}
	
	public Delcatty(String name)
	{
		super(301, name);
	}
	
	public Delcatty(int number, String name)
	{
		super(number, name);
	}

	@Override
	public void cuddle()
	{
		
	}

	@Override
	public double scream()
	{
		return 0.9;
	}
}
