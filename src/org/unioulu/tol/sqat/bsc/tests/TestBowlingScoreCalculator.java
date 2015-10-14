package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.*;

public class TestBowlingScoreCalculator {

	
	@Test
	public void scoreAfterTwoThrowNoStrikeOrSpare() {
		Frame frame = new Frame(1,5);
		
		assertEquals(6, frame.score());
	}

}
