package poke.model.monsters;

import poke.model.types.Fairy;

public class Sylveon extends Eevee implements Fairy
{
	public Sylveon()
	{
		super(700, "Sylveon");
		super.setup(false, 200);
	}
	
	public Sylveon (String name)
	{
		super(700, name);
		super.setup(false, 200);
	}
	
	public Sylveon (int number, String name)
	{
		super(number, name);
		super.setup(false, 200);
	}

	@Override
	public void glitterbomb()
	{
		
	}

	@Override
	public void twinkle()
	{
		
	}
}
