package open_closed.good.spec;

import static org.junit.Assert.assertEquals;

import open_closed.good.src.Greeter;
import open_closed.good.src.Personality;
import org.junit.Test;

/**
 * Created by mrk on 4/7/14.
 */
class MockPersonality implements Personality {

	public String greet() {
		return "foo";
	}
}

public class GreeterTest {

	@Test
	public void testGreetsSomeone() {
		MockPersonality mockPersonality = new MockPersonality();
		Greeter greeterBad = new Greeter(mockPersonality);

		assertEquals("foo", greeterBad.greet());
	}
}
