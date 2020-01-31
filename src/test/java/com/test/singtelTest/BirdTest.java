package com.test.singtelTest;
import org.junit.Test;

import com.test.singtel.Bird;

class BirdTest {
	 
	@Test
	public void testSing() {
		Bird bird = new Bird();
		bird.sing();
	}
}
