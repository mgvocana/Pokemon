package poke.model.monsters;

import poke.model.types.Dark;

public class Umbreon extends Eevee implements Dark
{
	public Umbreon()
	{
		super(197, "Umbreon");
	}
	
	public Umbreon (String name)
	{
		super(197, name);
	}
	
	public Umbreon (int number, String name)
	{
		super(number, name);
	}

	@Override
	public void shadowScreen()
	{
		
	}

	@Override
	public void penumbra()
	{
		
	}
}
