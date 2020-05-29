package cont;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		//Opens a window with a message listed in the parameter when you first open the game
		JOptionPane.showMessageDialog(null, "Welcome to Yahtzee!\nYour goal in this game is to achieve as many as the same number as possible!\nOnly problem is, you only get 3 rounds to do so,\nGoodluck!");
		//Instance variables
		int x = 0;
		int score2 = 0;
		boolean repeat = true;
		Window w = new Window();
		boolean oneuse = false;
		boolean twouse = false;
		boolean threeuse = false;
		boolean fouruse = false;
		boolean fiveuse = false;
		boolean sixuse = false;
		
		//Makes the game go on forever, forever randomzing 5 numbers through 1-6
		while(repeat){
		int num1 = (int)(Math.random()*6 + 1);
		int num2 = (int)(Math.random()*6 + 1);
		int num3 = (int)(Math.random()*6 + 1);
		int num4 = (int)(Math.random()*6 + 1);
		int num5 = (int)(Math.random()*6 + 1);
		ifSeven(num1);
		ifSeven(num2);
		ifSeven(num3);
		ifSeven(num4);
		ifSeven(num5);
		int Rolls = 3;
		int result2 = 0;
		
		
		//More instance variables in the form of option buttons as a string array
		String[] options1 = {
				"1",
				"2",
				"3",
				"4",
				"5",
				"None",
				"Help",
				"Quit",
		};
		String[] options2 = {
				"1",
				"2",
				"3",
				"4",
				"5",
		};
		//For loop, looping until the player runs out of rolls
		//Inside the loop it checks what button the player picks
		//Depending on this button it will do something correlating with what button they pressed
		//First 5 buttons randomizing that correlating spot that they selected
		for(int i = 0; i < Rolls; i+=0){
			int result = w.option(options1,"Select how many numbers you would like to change:"+"\nRolls: "+Rolls+"\n["+num1+"]  "+"["+num2+"]  "+"["+num3+"]  "+"["+num4+"]  "+"["+num5+"]", "Yahtzee", JOptionPane.YES_NO_CANCEL_OPTION)+1;
			buttons(result, Rolls);
			if(result == 6){
				Rolls = 0;
			}
			else if(result != 7 && result != 0){
				Rolls -=1;
			}
			if(result == 1 || result == 2 || result == 3 || result == 4 || result == 5){
				for(int p = 0; p < result; p++){
				 result2 = w.option(options2, "Change these:"+"\n["+num1+"]  "+"["+num2+"]  "+"["+num3+"]  "+"["+num4+"]  "+"["+num5+"]")+1;
				int  l = result2;
				if(l == 1){
					num1 = (int)(Math.random()*6 + 1);
					System.out.println("lol");
				}
				if(l == 2){
					num2 = (int)(Math.random()*6 + 1);
					System.out.println("lol2");
				}
				if(l == 3){
					num3 = (int)(Math.random()*6 + 1);
					System.out.println("lol3");
				}
				if(l == 4){
					num4 = (int)(Math.random()*6 + 1);
					System.out.println("lol4");
				}
				if(l == 5){
					num5 = (int)(Math.random()*6 + 1);
					System.out.println("lol5");
				}
			}
			
		}
	
	}

	//GUI that allows the user to add up their score for a specific number
	String s = JOptionPane.showInputDialog(null, "["+num1+"]  "+"["+num2+"]  "+"["+num3+"]  "+"["+num4+"]  "+"["+num5+"]"+"\nWhat number do you want to add points up for?"+
	
			"\nFor Ones pick:   1"+"   /Score = "+ones(0, num1, num2, num3, num4, num5)*1+
			"\nFor Twos pick:   2"+"   /Score = "+twos(0, num1, num2, num3, num4, num5)*2+
			"\nFor Threes pick: 3"+"   /Score = "+threes(0, num1, num2, num3, num4, num5)*3+
			"\nFor Fours pick:  4"+"   /Score = "+fours(0, num1, num2, num3, num4, num5)*4+
			"\nFor Fives pick:  5"+"   /Score = "+fives(0, num1, num2, num3, num4, num5)*5+
			"\nFor Sixes pick:  6"+"   /Score = "+sixes(0, num1, num2, num3, num4, num5)*6);
	//Parses the score so we can add an option for when that score is actuall selected
	int score = Integer.parseInt(s);

	
	//If statements for what score the user decides to add up
	//Each one adds up the score of all the numbers with the specific requirements and sets that to the score
	if(score == 1 && oneuse == false){
		w.msg("Score is: "+ones(score, num1, num2, num3, num4, num5)*1);
		score2 += ones(score, num1, num2, num3, num4, num5)*1;
		ones2(oneuse);
	}
	if(score == 2 && twouse == false){
		w.msg("Score is: "+twos(score, num1, num2, num3, num4, num5)*2);
		score2 += twos(score, num1, num2, num3, num4, num5)*2;
		twos2(twouse);
	}
	if(score == 3 && threeuse == false){
		w.msg("Score is: "+threes(score, num1, num2, num3, num4, num5)*3);
		score2 += threes(score, num1, num2, num3, num4, num5)*3;
		threes2(threeuse);
	}
	if(score == 4 && fouruse == false){
		w.msg("Score is: "+fours(score, num1, num2, num3, num4, num5)*4);
		score2 += fours(score, num1, num2, num3, num4, num5)*4;
		fours2(fouruse);
	}
	if(score == 5 && fiveuse == false){
		w.msg("Score is: "+fives(score, num1, num2, num3, num4, num5)*5);
		score2 += fives(score, num1, num2, num3, num4, num5)*5;
		fives2(fiveuse);
	}
	if(score == 6 && sixuse == false){
		w.msg("Score is: "+sixes(score, num1, num2, num3, num4, num5)*6);
		score2 += sixes(score, num1, num2, num3, num4, num5)*6;
		sixes2(sixuse);
	}

	x += score2;
	
	//Displays end result of the total score
	//Gives the user an option to repeat the game if they say no the game closses by stopping the while loop from the beginning
	w.msg("TotalScore: "+x);
	String f = w.in("Do you want to keep going?\n(1 = Yes)\n(2 = No)");
	int u = Integer.parseInt(f);
	if(u == 2){
		repeat = false;
	}
		}
	}
	
	//END OF MAIN THING
	//END OF MAIN THING
	//END OF MAIN THING
	//Now Methods:
	
	//Makes sure the random number is between 1-6
	public static int ifSeven(int x){
		if(x > 6){
			x--;
		}
	return x;	
	}
	
	//Controls what happens if the user selects help none or decides to quit the game
	//If exit the game closes, if none they run out of rolls, if help a window opens with helpfull info on the game
	public static void buttons(int result, int Rolls){
		if(result == 8){
			System.exit(0);
		}
		if(result == 7){
			JOptionPane.showMessageDialog(null, "Help Menu:\nYou click how many numbers you want to change\nThen you click the ones you want to change and you try to match the same number\nThe higher the number the more points it will be worth in the end\nAt the end of the game you will get your score for the round and will be asked if you want to continue playing\nYour total score will add up in the end of all rounds");
			
		}
		if(result == 6){
			Rolls = 0;
		}
	}
	
	//Method we use when the user selects to change a number by rerolling it
	//Works by randomizing that specific number depending on the players choice
	public static void reRoll(int score, int return2, int num1, int num2, int num3, int num4, int num5){
		if(return2 == 1){
			num1 = (int)(Math.random()*6 + 1);
		}
		if(return2 == 2){
			num2 = (int)(Math.random()*6 + 1);
		}
		if(return2 == 3){
			num3 = (int)(Math.random()*6 + 1);
		}
		if(return2 == 4){
			num4 = (int)(Math.random()*6 + 1);
		}
		if(return2 == 5){
			num5 = (int)(Math.random()*6 + 1);
		}
	}
	
	//Ones twos threes fours fives and sixes methods add up the
	//Correct amount of score depending on their correlating value
	public static int ones(int score, int num1, int num2, int num3, int num4, int num5){
		int ones = 0;
		
			if(num1 == 1){
				ones++;
			}
			if(num2 == 1){
				ones++;
			}
			if(num3 == 1){
				ones++;
			}
			if(num4 == 1){
				ones++;
			}
			if(num5 == 1){
				ones++;
		}
		return ones;
	}
	public static int twos(int score, int num1, int num2, int num3, int num4, int num5){
		int twos = 0;
			if(num1 == 2){
				twos++;
			}
			if(num2 == 2){
				twos++;
			}
			if(num3 == 2){
				twos++;
			}
			if(num4 == 2){
				twos++;
			}
			if(num5 == 2){
				twos++;
		}
		return twos;
	}
	public static int threes(int score, int num1, int num2, int num3, int num4, int num5){
		int threes = 0;
			if(num1 == 3){
				threes++;
			}
			if(num2 == 3){
				threes++;
			}
			if(num3 == 3){
				threes++;
			}
			if(num4 == 3){
				threes++;
			}
			if(num5 == 3){
				threes++;
		}
		return threes;
	}
	public static int fours(int score, int num1, int num2, int num3, int num4, int num5){
		int fours = 0;
			if(num1 == 4){
				fours++;
			}
			if(num2 == 4){
				fours++;
			}
			if(num3 == 4){
				fours++;
			}
			if(num4 == 4){
				fours++;
			}
			if(num5 == 4){
				fours++;
		}
		return fours;
	}
	public static int fives(int score, int num1, int num2, int num3, int num4, int num5){
		int fives = 0;
			if(num1 == 5){
				fives++;
			}
			if(num2 == 5){
				fives++;
			}
			if(num3 == 5){
				fives++;
			}
			if(num4 == 5){
				fives++;
			}
			if(num5 == 5){
				fives++;
		}
		return fives;
	}
	public static int sixes(int score, int num1, int num2, int num3, int num4, int num5){
		int sixes = 0;
			if(num1 == 6){
				sixes++;
			}
			if(num2 == 6){
				sixes++;
			}
			if(num3 == 6){
				sixes++;
			}
			if(num4 == 6){
				sixes++;
			}
			if(num5 == 6){
				sixes++;
		}
		return sixes;
	}
	
	//Methods that just change the booleans to true for when the user selects to get the score of a specific number
	//It opens up that number as an option when the method is called
	
	public static void ones2(boolean oneuse){
		oneuse = true;
	}
	public static void twos2(boolean twouse){
		twouse = true;
	}
	public static void threes2(boolean threeuse){
		threeuse = true;
	}
	public static void fours2(boolean fouruse){
		fouruse = true;
	}
	public static void fives2(boolean fiveuse){
		fiveuse = true;
	}
	public static void sixes2(boolean sixuse){
		sixuse = true;
	}
}
