package com.bridgelabz.app;
/*
* created by: BridgeLabz
* Date 10/05/2016
* Perpose: Computes the prime factorization for given number.
**/
import com.bridgelabz.util.Utility;
public class PrimeFactor
{
	void cal_Prime_Number(int num)// method 1
	{
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
			generate_Prime_Factor(i);//this caling  method 2 copy the i value to k
			}
		}
	}
	void generate_Prime_Factor(int k)//method 2
	{
		int count=0;		//initial count=0
		for(int j=1;j<=k;j++)
		{
			if(k%j==0)
			{
				count=count+1;
			}
		}
		if(count==2) //checking if count increment
		{
			System.out.println(k);//printing the prime factors for given number
		}
	}
	public static void main(String[] args)
	{
			Utility u1=new Utility();
			// ask the user enter number
			System.out.print("Enter any number :");
			int num=u1.inputInteger();
			PrimeFactor t1=new PrimeFactor();
			//display the results
			System.out.println("================================");
			System.out.println("Prime Factors for Given Number");
			System.out.println("================================");
			//  this is caling the method 1 to pass the argument
			t1.cal_Prime_Number(num);
	}
}
