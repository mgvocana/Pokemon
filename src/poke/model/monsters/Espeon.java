package poke.model.monsters;

import poke.model.types.Psychic;

public class Espeon extends Eevee implements Psychic
{
	public Espeon()
	{
		super(196, "Espeon");
		super.setup(false, 200);
	}
	
	public Espeon (String name)
	{
		super(196, name);
		super.setup(false, 200);
	}
	
	public Espeon (int number, String name)
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
