package poke.model.monsters;

import poke.model.types.Water;

public class Vaporeon extends Eevee implements Water
{
	public Vaporeon()
	{
		super(134, "Vaporeon");
		super.setup(false, 200);
	}
	
	public Vaporeon (String name)
	{
		super(134, name);
		super.setup(false, 200);
	}
	
	public Vaporeon (int number, String name)
	{
		super(number, name);
		super.setup(false, 200);
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
