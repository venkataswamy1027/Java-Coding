package com.bridgelabz.app;
/*
* created by: Bridge Labz
* Date 11/05/2016
* Perpose:this Stopwatch Program is for measuring the time that elapses between the start and end Time. ­
**/
import com.bridgelabz.util.Utility;
public class StopWatchProgram
{
	private static long start;//this variable used start time
	private static long stop;//this variable used stop time
	public void StartTime()//method 1
	{
		// reading the current system time in milli seconds
		start=System.currentTimeMillis();
		System.out.println("Starting Time :"+start);
	}
	public long elapsedTime()//method 2
	{
		long stop=System.currentTimeMillis();
		System.out.println("Ending Time :"+stop);
		return (stop-start);
	}
	public static void main(String[] args)
	{
		Utility u1=new Utility();
		//ask the user enter 1
		System.out.print("Enter Press 1 to Start Time:");
		start=u1.inputInteger();
		StopWatchProgram t1=new StopWatchProgram();
						 t1.StartTime();//this calls method 1
		System.out.print("Enter Press 2 to Stop Time:");
		//ask the user enter 2
		stop=u1.inputInteger();
		long elapsedtime=t1.elapsedTime();//this calls method 2
		System.out.println("Elapsed Time in second :"+elapsedtime);
	}
}
