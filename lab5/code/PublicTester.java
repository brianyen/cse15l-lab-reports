import org.junit.Test;

import static org.junit.Assert.*;

public class PublicTester {
	@Test
	public void testReflect() {
		assertEquals("hello world dlrow olleh", Reflect.reflectString("hello world"));
	}

	@Test
	public void testReflectEmpty() {
		assertEquals(" ", Reflect.reflectString(""));
	}
}

