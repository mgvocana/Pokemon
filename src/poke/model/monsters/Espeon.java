package poke.model.monsters;

import poke.model.types.Psychic;

public class Espeon extends Eevee implements Psychic
{
	public Espeon()
	{
		super(196, "Espeon");
	}
	
	public Espeon (String name)
	{
		super(196, name);
	}
	
	public Espeon (int number, String name)
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
