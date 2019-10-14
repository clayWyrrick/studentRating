import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class StudentTest {

	private static final int INITIAL_RATING = 5;

	@Test
	void testStudent() {
		Student s;
		try {
			s = new Student();

			Integer rating = s.getRating();
			Integer expected = INITIAL_RATING;
		
			assertEquals(expected, rating);
		} catch (NameException e) {
			fail();
		}
		
	}

	@Test
	void testCompareTo() {
		fail("Not yet implemented");
	}

}
