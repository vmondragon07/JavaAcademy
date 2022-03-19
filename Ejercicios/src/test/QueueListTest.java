package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.QueueList;


class QueueListTest {
	
	QueueList queueList = new QueueList();

	@BeforeAll
	static void setUpBeforeClass() {
		
	}

	

	@Test
	void test() {
		assertTrue(queueList.isPalindrome("ana"));
		assertTrue(queueList.isPalindrome("civic"));
		assertTrue(queueList.isPalindrome("madam"));
		assertFalse(queueList.isPalindrome("vianey"));
	}

}
