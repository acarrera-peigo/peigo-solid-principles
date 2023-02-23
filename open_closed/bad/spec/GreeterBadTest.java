package open_closed.bad.spec;

import static org.junit.Assert.assertEquals;

import open_closed.bad.src.GreeterBad;
import org.junit.Test;


public class GreeterBadTest {

	@Test
	public void testSaysHello() {
		GreeterBad greeterBad = new GreeterBad();
		assertEquals("Hello.", greeterBad.greet());
	}

	@Test
	public void testSaysHelloFormally() {
		GreeterBad greeterBad = new GreeterBad();
		greeterBad.setFormality("formal");
		assertEquals("Good evening, sir.", greeterBad.greet());
	}

	@Test
	public void testSaysHelloCasually() {
		GreeterBad greeterBad = new GreeterBad();
		greeterBad.setFormality("casual");
		assertEquals("Sup bro?", greeterBad.greet());
	}

	@Test
	public void testSaysHelloIntimately() {
		GreeterBad greeterBad = new GreeterBad();
		greeterBad.setFormality("intimate");
		assertEquals("Hello Darling!", greeterBad.greet());
	}
}
