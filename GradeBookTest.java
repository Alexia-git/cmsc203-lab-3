import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
GradeBook gb1, gb2;
	
	@BeforeEach
	void setUp() throws Exception {
		
		gb1 = new GradeBook(5);
		
		gb1.addScore(30);
		gb1.addScore(69);
		gb1.addScore(50);
		
			
	}

	@AfterEach
	void tearDown() throws Exception {
		gb1 = null;
		gb2 = null;
	}

	@Test
	void testAddScore() {
		gb1.addScore(30);
		gb1.addScore(69);
		gb1.addScore(50);
	}

	@Test
	void testSum() {
		
		assertEquals(149.0, gb1.sum(), 0.0001);
		
	}

	@Test
	void testMinimum() {
		
		assertEquals(30.0, gb1.minimum(), 0.0001);

	}

	@Test
	void testFinalScore() {
		
		assertTrue(119.0 == gb1.finalScore());
			
	}

	@Test
	void testGetScoreSize() {
		
		assertEquals(3, gb1.getScoreSize());
	
	}

	@Test
	void testToString() {
	
		assertTrue("30.0 69.0 50.0".equals(gb1.toString()));
		
	}

}
