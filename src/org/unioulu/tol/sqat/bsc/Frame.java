package org.unioulu.tol.sqat.bsc;

public class Frame {
	private int firstThrow;
	private int secondThrow;
	private int score;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
		this.score = 0;
	}
	
	//the score of a single frame
	public int score(){
		this.score = this.getFirstThrow() + this.getSecondThrow();
		return score;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		//to be implemented
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		//to be implemented
		return false;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		//to be implemented
		return false;
	}

	//bonus throws
	public int bonus(){
		//to be implemented
		return 0;
	}
	
	public int getFirstThrow(){
		return this.firstThrow;
	}
	
	public int getSecondThrow(){
		return this.secondThrow;
	}
	
	public int getScore(){
		return this.score;
	}
	
	public boolean checkIfScoreValid(){
		if(this.getScore() >= 0 && this.getScore() <= 10){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean checkIfFirstThrowValid(){
		if(this.getFirstThrow >= 0 && this.getFirstThrow <= 10){
			return true;
		}
		else{
			return false;
		}
	}
}
