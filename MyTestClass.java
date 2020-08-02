
import org.junit.Test;
import static org.junit.Assert.*;

public class MyTestClass {
	@Test
	public void testAnagram() {
		boolean isAnagram = Main.areAnagram("table", "bleat");
		assertTrue("Two strings are anagram", isAnagram);
	}
}
