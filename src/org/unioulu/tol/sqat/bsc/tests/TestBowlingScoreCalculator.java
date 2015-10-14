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
	
	@Test
	public void scoreOverTenAfterTwoThrowNoStrikeOrSpare(){
		Frame frame = new Frame(2,9);
		
		assertEquals(11, frame.score());
	}
	
	@Test
	public void checkValidScore(){
		Frame frame = new Frame(2,6);
		
		assertEquals(true, frame.checkIfScoreValid());
	}
	
	@Test
	public void checkFalseScore(){
		Frame frame = new Frame(2,9);
		
		assertEquals(false, frame.checkIfScoreValid());
	}

}
