import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueTest {

	
	Queue<String> q1 = new Queue<String>();
	Queue<String> q2 = new Queue<String>();
	Queue<String> q3 = new Queue<String>();

	@Test
	void isEmptyTest()
	{
		assertTrue(q1.isEmpty());
		q1.push("A");
		assertFalse(q1.isEmpty());
		q1.push("B");
		assertFalse(q1.isEmpty());
	}
	
	@Test
	void popTest()
	{
		assertThrows(QueueUnderFlowException.class, ()->{ q2.pop();});
		q2.push("A");
		assertEquals("A",q2.pop());
		q3.push("A");
		q3.push("B");
		q3.push("C");
		assertEquals("A",q3.pop());
		assertEquals("B",q3.pop());
		assertEquals("C",q3.pop());
		assertThrows(QueueUnderFlowException.class, ()->{ q3.pop();});

	}

	
	
	
	
}
