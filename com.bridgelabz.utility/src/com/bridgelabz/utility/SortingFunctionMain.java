package com.bridgelabz.utility;
/*
*Created by:BridgeLabz
*Date 19/05/2016.
*Create Utility Class having following methods (1)binarySearch method for integer (2)binarySearch method for String (3)insertionSort method for integer (4)insertionSort method for String
*(5)bubbleSort method for integer and (6)bubbleSort method for String.
*Write main function to call the utility function
**/
import com.bridgelabz.sort.SortingFunctions;
import com.bridgelabz.util.Utility;
public class SortingFunctionMain
{
  Utility u1=new Utility();
  SortingFunctions sf=new SortingFunctions();
  public void sortMethod()
  {
    try{
        System.out.println("choose your opition");
        String abc="";
        String temp=null;
        long startTime=0,endTime=0,totalTime=0;
        do
        {
            System.out.println("1----Inserino Sort for Integers");
            System.out.println("2----Inserino Sort for String");
            System.out.println("3----Bubble sort for Integers");
            System.out.println("4----Bubble Sort for String");
            System.out.println("5----Binary Search for Integers");
            System.out.println("6----Binary Search for String");
            int choice = u1.inputInteger();
            switch(choice)
            {
                case 1 : startTime = System.currentTimeMillis();
                    			//int integer=u1.inputInteger();
                          System.out.print("Enter array size :");
                  		  	int arraysize1=u1.inputInteger();
                  			  Integer[] intArray1=new Integer[arraysize1];
                  			  for(int i=0;i<arraysize1;i++)
                  			 {
                  					System.out.print("Enter array["+i+"] : ");
                  					intArray1[i]=u1.inputInteger();
                  			 }
                  			  Integer[] inputArray1=(Integer[])sf.dataSort(intArray1);
                  			  System.out.println("...Integers sorting...");
                  			  for(Integer el:inputArray1)
                  			{
                  				System.out.print(el+" ");
			                  }
			                     System.out.println();
                           endTime   = System.currentTimeMillis();
                           totalTime = (endTime - startTime)/1000;
                           System.out.println("TotalTime Elapsed to Execute the Function in Seconds :"+totalTime);
                           break;
                case 2 :
                          startTime = System.currentTimeMillis();
                          System.out.print("Enter array size :");
                    			int arraysize2=u1.inputInteger();
                    			String[] inputstring1=new String[arraysize2];
                    			for(int i=0;i<arraysize2;i++)
                    			{
                    					System.out.print("Enter array["+i+"] : ");
                    					inputstring1[i]=u1.inputString();
                    			}
                    			String[] arrayString1=(String[])sf.dataSort(inputstring1);
                    			System.out.println("...Strings sorting...");
                    			for(String ss:arrayString1)
                    			{
                    			System.out.print(ss+" ");
                    			}
                    			System.out.println();
                         endTime   = System.currentTimeMillis();
                         totalTime = (endTime - startTime)/1000;
                         System.out.println("TotalTime Elapsed to Execute the Function in Seconds :"+totalTime);
                         break;
                case 3:
                         startTime = System.currentTimeMillis();
                         System.out.print("Enter array size :");
                         int arraysize3=u1.inputInteger();
                         Integer[] intArray2=new Integer[arraysize3];
                         for(int i=0;i<arraysize3;i++)
                         {
                             System.out.print("Enter array["+i+"] : ");
                             intArray2[i]=u1.inputInteger();
                         }
                         Integer[] inputArray2=(Integer[])sf.elementSort(intArray2);
                         System.out.println("...Integers sorting...");
                         for(Integer el:inputArray2)
                         {
                           System.out.print(el+" ");
                         }
                         System.out.println();
                         endTime   = System.currentTimeMillis();
                         totalTime = (endTime - startTime)/1000;
                         System.out.println("TotalTime Elapsed to Execute the Function in Seconds :"+totalTime);
                         break;

                case 4 :
                         startTime = System.currentTimeMillis();
                           System.out.print("Enter array size :");
                    			int arraysize4=u1.inputInteger();
                    			String[] inputstring2=new String[arraysize4];
                    			for(int i=0;i<arraysize4;i++)
                    			{
                    					System.out.print("Enter array["+i+"] : ");
                    					inputstring2[i]=u1.inputString();
                    			}
                    			String[] arrayString2=(String[])sf.elementSort(inputstring2);
                    			System.out.println("...Strings sorting...");
                    			for(String ss:arrayString2)
                    			{
                    			System.out.print(ss+" ");
                    			}
                    			System.out.println();
                           endTime   = System.currentTimeMillis();
                           totalTime = (endTime - startTime)/1000;
                           System.out.println("TotalTime Elapsed to Execute the Function in Seconds :"+totalTime);
                           break;
                case 5:
                         startTime = System.currentTimeMillis();
                           System.out.print("Enter array size :");
                         int arraysize5=u1.inputInteger();
                    			String[] wordsArray1=new String[arraysize5];
                    			for(int i=0;i<wordsArray1.length;i++)
                    			{
                    					System.out.print("Enter array["+i+"] : ");
                    					wordsArray1[i]=u1.inputString();
                    			}
                          for (int i=0;i<wordsArray1.length;i++) //sorting logic
                    			{
                    				for (int j=i+1; j<wordsArray1.length;j++)
                    				{
                    					if (wordsArray1[i].compareTo(wordsArray1[j])>0)
                    					{
                    						 temp = wordsArray1[i];
                    						wordsArray1[i]=wordsArray1[j];
                    						wordsArray1[j]=temp;
                    					}
                    				}
                    			}
                          System.out.print("Ask the user do you searching the word in the array :");
                    			String key1=u1.inputString();
                    			Integer lower1=0,upper1=wordsArray1.length;
                          Integer k1=(sf.binarySearch(wordsArray1,key1,lower1,upper1));
                          //int k=ks.intValue();
                    			if(k1==-1)
                    			System.out.println(wordsArray1[k1]+" not found.");
                    			else
                    			{
                    			int z=k1+1;
                    			System.out.println(wordsArray1[k1]+" is found at position "+z);
                    			}
                    			System.out.println();
                         endTime   = System.currentTimeMillis();
                         totalTime = (endTime - startTime)/1000;
                         System.out.println("TotalTime Elapsed to Execute the Function in Seconds :"+totalTime);
                         break;
                         case 6:
                         startTime = System.currentTimeMillis();
                           System.out.print("Enter array size :");
                         int arraysize6=u1.inputInteger();
    			                String[] wordsArray2=new String[arraysize6];
                    			for(int i=0;i<wordsArray2.length;i++)
                    			{
                    					System.out.print("Enter array["+i+"] : ");
                    					wordsArray2[i]=u1.inputString();
                    			}
                          for (int i=0;i<wordsArray2.length;i++) //sorting logic
                    			{
                    				for (int j=i+1; j<wordsArray2.length;j++)
                    				{
                    					if (wordsArray2[i].compareTo(wordsArray2[j])>0)
                    					{
                    						temp = wordsArray2[i];
                    						wordsArray2[i]=wordsArray2[j];
                    						wordsArray2[j]=temp;
                    					}
                    				}
                    			}
                          System.out.print("Words are in Sorted Order:");
    			                sf.printArray(wordsArray2);
                          System.out.print("Ask the user do you searching the word in the array :");
                    			String key2=u1.inputString();
                    			Integer lower2=0,upper2=wordsArray2.length;
                          Integer k2=(sf.binarySearch(wordsArray2,key2,lower2,upper2));
                          //int k=ks.intValue();
                    			if(k2==-1)
                    			System.out.println(wordsArray2[k2]+" not found.");
                    			else
                    			{
                    			int z=k2+1;
                    			System.out.println(wordsArray2[k2]+" is found at position "+z);
                    			}
                    			System.out.println();
                         endTime   = System.currentTimeMillis();
                         totalTime = (endTime - startTime)/1000;
                         System.out.println("TotalTime Elapsed to Execute the Function in Seconds :"+totalTime);
                         break;
            }//end of switch
            System.out.println("Press any Key to Continue \n Press E to exit");
            abc=u1.inputString();
        }//end of method
        while(!abc.equals("E"));
      }//try block
            catch(NumberFormatException nfe)
          {
            System.out.println("try to enter numbers only");
          }
        catch (ArrayIndexOutOfBoundsException ae)
        {
          System.out.println("Not Found");
        }
        catch(ClassCastException c )
        {
          System.out.println(c);
        }
    }
  public static void main(String[] args)
  {
    SortingFunctionMain obj=new SortingFunctionMain();
    obj.sortMethod();
  }
}
