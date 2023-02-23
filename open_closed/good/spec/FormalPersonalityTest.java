package open_closed.good.spec;

import static org.junit.Assert.assertEquals;

import open_closed.good.src.FormalPersonality;
import org.junit.Test;

public class FormalPersonalityTest {

	@Test
	public void testGreetsSomeoneFormally() {
		FormalPersonality fp = new FormalPersonality();
		assertEquals("Good evening, sir.", fp.greet());
	}
}
