package open_closed.good.spec;

import static org.junit.Assert.assertEquals;

import open_closed.good.src.CasualPersonality;
import org.junit.Test;


public class CasualPersonalityTest {

	@Test
	public void testGreetsSomeoneCasually() {
		CasualPersonality cp = new CasualPersonality();
		assertEquals("Sup bro?", cp.greet());
	}
}
