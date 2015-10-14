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
	
	@Test
	public void checkIfFirstThrowInvalidWithEleven(){
		Frame frame = new Frame(11, 0);
		
		frame.score();
		
		assertEquals(false, frame.checkIfFirstThrowValid());
	}
	
	public void checkIfSecondThrowValidWithZero(){
		Frame frame = new Frame(2, 0);
		
		frame.score();
		
		assertEquals(true, frame.checkIfSecondThrowValid());
	}
	
	@Test
	public void checkIfSecondThrowValidWithTen(){
		Frame frame = new Frame(0, 10);
		
		frame.score();
		
		assertEquals(true, frame.checkIfSecondThrowValid());
	}
	
	@Test
	public void checkIfSecondThrowInvalidWithMinusOne(){
		Frame frame = new Frame(0, -1);
		
		frame.score();
		
		assertEquals(false, frame.checkIfSecondThrowValid());
	}
	
	@Test
	public void checkIfSecondThrowInvalidWithEleven(){
		Frame frame = new Frame(0, 11);
		
		frame.score();
		
		assertEquals(false, frame.checkIfSecondThrowValid());
	}
	
	@Test
	public void checkIfFrameValidWithTen(){
		Frame frame = new Frame(5,5);
		
		frame.score();
		
		assertEquals(true, frame.checkIfFrameValid());
	}
	
	@Test
	public void checkIfFrameValidWithZero(){
		Frame frame = new Frame(0,0);
		
		frame.score();
		
		assertEquals(true, frame.checkIfFrameValid());
	}
	
	@Test
	public void checkIfFrameValidWithMinusOne(){
		Frame frame = new Frame(-1,0);
		
		frame.score();
		
		assertEquals(false, frame.checkIfFrameValid());
	}
	
	@Test
	public void checkIfFrameValidWithEleven(){
		Frame frame = new Frame(10,1);
		
		frame.score();
		
		assertEquals(false, frame.checkIfFrameValid());
	}
	
	@Test
	public void checkStrikeTrue(){
		Frame frame = new Frame(10, 0);
		
		frame.score();
		
		assertEquals(true, frame.isStrike());
	}
	
	@Test
	public void checkStrikeFalse(){
		Frame frame = new Frame(9, 0);
		
		frame.score();
		
		assertEquals(false, frame.isStrike());
	}
	
	@Test
	public void checkSpareTrue(){
		Frame frame = new Frame(9,2);
		
		frame.score();
		
		assertEquals(true, frame.isSpare());
	}
	
	@Test
	public void checkSpareFalse(){
		Frame frame = new Frame(4,5);
		
		frame.score();
		
		assertEquals(false, frame.isSpare());
	}
	
	@Test
	public void checkSpareWithStrike(){
		Frame frame = new Frame(10,0);
		
		frame.score();
		
		assertEquals(false, frame.isSpare());
	}
	

}
