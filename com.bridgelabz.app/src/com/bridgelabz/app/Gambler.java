package com.bridgelabz.app;
/*
* created by: BridgeLabz
* Date 13/05/2016
* Perpose:  Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke (i.e. has no money) or reach $goal.
* Keeps track of the number of times he/she wins and the number of bets he/she makes. Run the experiment N times, averages the results,
* and prints them out.
**/
import com.bridgelabz.util.Utility;
import java.lang.Math;
public class Gambler
{
  int trails,stake,goal;
	Utility u1;
	//constructor to initalize variables. It input from user
	public Gambler()
  {
		u1=new Utility();
		System.out.print("Enter stack Price :");
		stake=u1.inputInteger();
		System.out.print("Enter stack Goal :");
		goal=u1.inputInteger();
		System.out.print("Enter number of trials to perform:");
		trails=u1.inputInteger();
	}
  public void playGame()
  {
    int betting = 0;        // total number of bets made
    int winning = 0;        // total number of games won

    // repeat T times
    for (int t = 0; t < trails; t++) {

        // do one gambler's ruin simulation
        int cash = stake;
        while (cash > 0 && cash < goal) {
            betting++;
            if (Math.random() < 0.5) cash++;     // win
            else                     cash--;     // lose
        }
        if (cash == goal) winning++;                // user achieve desired goal?
    }
    // print results
    System.out.println(winning + " games wins of number of trails " + trails);
    System.out.println("Percent of games won = " + (100.0 * winning / trails));
    System.out.println("Percent of game loss = " + ((100)-(100.0 * winning / trails)));
}
  public static void main(String[] args)
   {
    Gambler games=new Gambler();
    games.playGame();
  }
}
