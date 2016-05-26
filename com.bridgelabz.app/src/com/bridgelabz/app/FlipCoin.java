package com.bridgelabz.app;
/*
* created by: BridgeLabz
* Date 09/05/2016
Perpose:Flip Coin and prints percentage of Heads and Tails.
**/
public class FlipCoin
{
	public static void main(String[] args)
	{
		if(Math.random()<0.5)//Math.random() returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
		{
			System.out.println("Heads");
		}
		else
		{
			System.out.println("Tails");
		}
	}
}
