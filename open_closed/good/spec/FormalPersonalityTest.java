package open_closed.good.spec;

import static org.junit.Assert.assertEquals;

import open_closed.good.src.FormalPersonality;
import open_closed.good.src.Personality;
import org.junit.Test;

public class FormalPersonalityTest {

	@Test
	public void testGreetsSomeoneFormally() {
		Personality fp = new FormalPersonality();
		assertEquals("Good evening, sir.", fp.greet());
	}
}
