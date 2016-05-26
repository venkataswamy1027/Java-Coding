package com.bridgelabz.vendor;
/*
*Created by:BridgeLabz
*Date:19/05/2016.
*Perpose:calculate the minimum number of Notes as well as the Notes to be returned by the Vending Machine as a Change
* taking array for Notes
* using Recursion Calculating number of minimum Notes Return by Vending machine
**/
import com.bridgelabz.util.Utility;
public class VendingMachineChange
{
  // Static Variables i for indexing the array and total for calculating the total Notes
         static int i=0;
         static int total=0;
         //Initialization of New Array
          static int[] notes = { 1000,500,100,50,5,2,1};
          static int money;
         // Function for Calculating the notes
    public static  int calculateFun(int money,int[]notes )
      {
          //calling calculate Function
          int rem;
          if(money==0)
          {
              return -1 ;
          }
              else
              {
                  if(money>=notes[i])
                  {
                      // logic for Calculating The notes
                 int calNotes =money/notes[i];
                   rem = money%notes[i];
                  money =rem;
                  total += calNotes;
                  System.out.println(notes[i]+   " Notes ---> " +calNotes );
                  }
                  i++;
                  return calculateFun(money, notes);
              }
      }//end of method
  // Startting Main Function
      public static void main(String[] args)
      {
          Utility u1=new Utility();
          //ask the user enter the money
          System.out.print("Enter how much Money Do U Want Count :");
          money =u1.inputInteger();
          // Creating The Object of Vending MAchine class
          int retValue=VendingMachineChange.calculateFun(money,notes);
          System.out.println("Total Number of Notes are :"+total);
      }
}
