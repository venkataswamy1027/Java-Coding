package com.bridgelabz.app;
/*
* created by: Bridge Labz
* Date 05/05/2016
* Perpose: Write a program to read in Stock Names, Number of Share, Share Price. Print a Stock Report with total value of each Stock and the total value of Stock.
**/
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
public class Stock
{
	public static void stockReport()
	{
		try
		{
			int p;//This counter is used to avoid printing no. of shares or stock price instead of stock name.
			int q=0,i=0,r=0;
			String stockname="";//This variable is used to hold the stock name
			FileReader file=new FileReader("/com.bridgelabz.stockholder/src/file.txt");// a text file storing stock report
			BufferedReader buf=new BufferedReader(file);
			String line=buf.readLine();
			Stock t=new Stock();
			int array[]=new int[100];
			//This while loop is used to read all the strings line by line from a text file
			while((line=buf.readLine())!= null)
			{
				boolean b=t.isNumber(line);
				p=0;
				if(b==true)//This if block is used to check if the string is numeric or not.
				{
					array[i]=Integer.parseInt(line);
					i++;
					q++;
					p++;
					if(q%2==0)
					{
						r=r+(array[i-1]*array[i-2]);
						System.out.println(array[i-1]*array[i-2]);
				   }
				}
				else if(p==0)
				{
					stockname=line;
					System.out.println("The total value of stock "+stockname);
				}
			 }
			System.out.println("The total value of all stocks is :"+r);
		}
		catch(FileNotFoundException fe)
		{
			System.out.println("file does not exit");
		}
		catch (Exception nfe)
		{
			System.out.println(nfe);
		}
    }
    //This function is used to check if the string is numerical or not
	public static boolean isNumber(String line)
	{
        try
	    {
		    Integer.parseInt(line);

        }
		catch(Exception e)
		{
		    return false;
		}
        return true;

    }
	public static void main(String[] args)
	{
		Stock.stockReport();
	}

}
