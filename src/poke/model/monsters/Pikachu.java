package poke.model.monsters;

import poke.model.types.Electric;

public class Pikachu extends Pokemon implements Electric
{
	public Pikachu()
	{
		super(25, "Pikachu");
		super.setup(false, 200);
	}
	
	public Pikachu (String name)
	{
		super(25, name);
		super.setup(false, 200);
	}
	
	public Pikachu (int number, String name)
	{
		super(number, name);
		super.setup(false, 200);
	}

	public void shock()
	{
		
	}

	public void electricute()
	{
		
	}
}
