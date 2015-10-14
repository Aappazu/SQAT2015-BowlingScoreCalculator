package org.unioulu.tol.sqat.bsc;

public class Frame {
	private int firstThrow;
	private int secondThrow;
	private int score;
	private static int frameNumber = 0;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
		this.score = 0;
		frameNumber++;
	}
	
	//the score of a single frame
	public int score(){
		this.score = this.getFirstThrow() + this.getSecondThrow();
		return score;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		if(this.getFirstThrow() == 10){
			return true;
		}
		else{
			return false;
		}
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		if(this.isStrike() == false){
		    if(this.getScore() == 10){
			    return true;
		    }
		    else{
			    return false;
		    }
	    }
		else{
			return false;
		}
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		if(this.getFrameNumber() == 10){
			return true;
		}
		else{
			return false;
		}
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
		if(this.getFirstThrow() >= 0 && this.getFirstThrow() <= 10){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean checkIfSecondThrowValid(){
		if(this.getSecondThrow() >= 0 && this.getSecondThrow() <= 10){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean checkIfFrameValid(){
		if(this.checkIfFirstThrowValid() == true){
			if(this.checkIfSecondThrowValid() == true){
				if(this.checkIfScoreValid() == true){
					return true;
				}
				else{
					return false;
				}
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
	}
	
	public int getFrameNumber(){
		return frameNumber;
	}
}
