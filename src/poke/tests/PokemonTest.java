package poke.tests;

/**
 * Project imports
 */
import poke.model.monsters.*;
/**
 * Reflection imports
 */
import java.lang.reflect.*;

/**
 * Testing imports
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokemonTest
{
	private Pokemon[] testedPokemon;

	@BeforeEach
	void setUp() throws Exception
	{
		testedPokemon = new Pokemon [6];
	}

	@AfterEach
	void tearDown() throws Exception
	{
	}

	@Test
	void test()
	{	
		boolean hasSetupMethod = false;
		boolean minimumParameterCount = false;
		Method [] parentMethods = testedPokemon[0].getClass().getSuperclass().getDeclaredMethods();
		for (Method currentMethod : parentMethods)
		{
			if (currentMethod.getName().equals("setup"))
			{
				hasSetupMethod = true;
				if (currentMethod.getParameterCount() > 1)
				{
					minimumParameterCount = true;
				}
				assertTrue(Modifier.isPublic(currentMethod.getModifiers()), "The setup method must be public!");
			}
		}
		assertTrue(hasSetupMethod, "Pokemon.java needs a setup method");
		assertTrue(minimumParameterCount, "The setup method needs more than one parameter!");
	}

}
