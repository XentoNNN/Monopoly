package monopoly1;

import java.util.Random;
import java.util.Scanner;

public class Dice {
	
	int zar1;
	int zar2;
	Random rand=new Random();
	int faceValue=1;
	int i;
	kodes kodes;
	public Dice() {
		
		
		
	}
	public int getFaceValue() {
		faceValue=rand.nextInt(4)+1;
		return faceValue;
	}
	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}
	
	}