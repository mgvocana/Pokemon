package poke.model.monsters;

import poke.model.types.Dark;

public class Umbreon extends Eevee implements Dark
{
	public Umbreon()
	{
		super(197, "Umbreon");
		super.setup(false, 200);
	}
	
	public Umbreon (String name)
	{
		super(197, name);
		super.setup(false, 200);
	}
	
	public Umbreon (int number, String name)
	{
		super(number, name);
		super.setup(false, 200);
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
