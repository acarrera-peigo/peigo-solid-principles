package open_closed.good.spec;

import static org.junit.Assert.assertEquals;

import open_closed.good.src.IntimatePersonality;
import open_closed.good.src.Personality;
import org.junit.Test;

public class IntimatePersonalityTest {

	@Test
	public void testGreetsSomeoneIntimately() {
		Personality ip = new IntimatePersonality();
		assertEquals("Hello Darling!", ip.greet());
	}
}
