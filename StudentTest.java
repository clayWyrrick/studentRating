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
	void testCompareTo() throws NameException {
		Student firstStudent = new Student("x", "y", 2);
		Student secondStudent = new Student("x", "y", 3);
		
		int actual = secondStudent.compareTo(firstStudent);
		
		// should be bigger than zero
		boolean result = false;
		
		if (actual > 0)
			result = true;
		assertTrue(result);
		
		//should be less than 0
		Student Student = new Student("x", "y", 5);
		
		result = false;
		
		actual = secondStudent.compareTo(Student);
		if (actual < 0)
			result = true;
		assertTrue(result);
		
		//should be the same, 0
		Student studentSame = new Student("x", "y", 3);
		actual = secondStudent.compareTo(studentSame);
		int expected = 0;
		assertEquals(expected, actual);
		
		
		
	}
	
	@Test
	public void testGet() throws NameException {
		Integer expected = 4;
		Integer rating = expected;
		String firstName = "Alex";
		String lastName = "Bo";
		Student s = new Student(firstName, lastName, rating);
		Integer actual = s.getRating();
		assertEquals(expected, actual);
	}

}
