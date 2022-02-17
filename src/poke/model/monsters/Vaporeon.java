package poke.model.monsters;

import poke.model.types.Water;

public class Vaporeon extends Eevee implements Water
{
	public Vaporeon()
	{
		super(134, "Vaporeon");
	}
	
	public Vaporeon (String name)
	{
		super(134, name);
	}
	
	public Vaporeon (int number, String name)
	{
		super(number, name);
	}

	@Override
	public void splash()
	{
		
	}

	@Override
	public int bubbles()
	{
		return 0;
	}
}
