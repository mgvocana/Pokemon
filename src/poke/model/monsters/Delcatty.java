package poke.model.monsters;

import poke.model.types.Normal;

public class Delcatty extends Pokemon implements Normal
{
	public Delcatty()
	{
		super(301, "Delcatty");
		super.setup(false, 200);
	}
	
	public Delcatty(String name)
	{
		super(301, name);
		super.setup(false, 200);
	}
	
	public Delcatty(int number, String name)
	{
		super(number, name);
		super.setup(false, 200);
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
