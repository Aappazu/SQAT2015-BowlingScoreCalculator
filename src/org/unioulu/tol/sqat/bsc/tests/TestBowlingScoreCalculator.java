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
	public void checkValidScoreTen(){
		Frame frame = new Frame(2,8);
		
		frame.score();
		
		assertEquals(true, frame.checkIfScoreValid());
	}
	
	@Test
	public void checkValidScoreZero(){
		Frame frame = new Frame(0,0);
		
		frame.score();
		
		assertEquals(true, frame.checkIfScoreValid());
	}
	
	@Test
	public void checkFalseScoreOverTen(){
		Frame frame = new Frame(2,9);
		
		frame.score();
		
		assertEquals(false, frame.checkIfScoreValid());
	}
	
	@Test
	public void checkFalseScoreUnderZero(){
		Frame frame = new Frame(-1,0);
		
		frame.score();
		
		assertEquals(false, frame.checkIfScoreValid());
	}
	
	@Test
	public void checkIfFirstThrowValidWithZero(){
		Frame frame = new Frame(0, 2);
		
		frame.score();
		
		assertEquals(true, frame.checkIfFirstThrowValid());
	}
	
	@Test
	public void checkIfFirstThrowValidWithTen(){
		Frame frame = new Frame(10, 0);
		
		frame.score();
		
		assertEquals(true, frame.checkIfFirstThrowValid());
	}
	
	@Test
	public void checkIfFirstThrowInvalidWithMinusOne(){
		Frame frame = new Frame(-1, 0);
		
		frame.score();
		
		assertEquals(false, frame.checkIfFirstThrowValid());
	}
	

}
