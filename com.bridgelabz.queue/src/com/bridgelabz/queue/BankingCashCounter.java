package com.bridgelabz.queue;
/*
*Created by:BridgeLabz
*Date 18/05/2016
*Perpose:where people come in to deposit Cash and withdraw Cash. Have an input panel to add people
*to Queue to either deposit or withdraw money and dequeue the people. Maintain the Cash Balance.
**/ 
import com.bridgelabz.queue.Queue;
import com.bridgelabz.node.Node;
import com.bridgelabz.util.Utility;
public class BankingCashCounter
 {
   static int cashBal = 10000;
   Utility u1=new Utility();
   public BankingCashCounter()
   {
     Queue <Integer> obj = new Queue<Integer>();
     while(true)
     {
         System.out.println("...Choose Option... ") ;
         System.out.println("1---Deposit ") ;
         System.out.println("2---Withdraw ") ;
         System.out.println("3--- Go for Service ") ;
         System.out.println("4--- display them in Queue ") ;
         System.out.println("5--- User will see total cash Counter ") ;
         System.out.println("6--- Exit") ;
         System.out.println("...Choose Option...") ;
         int choice =u1.inputInteger();
         switch(choice)
         {
             case 1:
                 obj.addAtFront(choice);
                 break;
             case 2:
                 obj.addAtFront(choice);
                 break;
             case 3:
                 obj.doOpearations();
                 break;
             case 4 :
                // System.out.println("Displaying Queue");
                 obj.display();
                 break;
             case 5 :
                 int cash= obj.getCashCounterBalance();
                 System.out.println("Total Cash in cash Counter "+cash);
                 break;

             case 6:
                 System.out.println("Application is closed...");
                 System.exit(1);
                 break;
                 default : System.out.println("Invalid Key Pressed..!!!");
               }//end of switch case
          }//end of while loop
  }//end of constructor
public static void main(String[] args)
  {
    BankingCashCounter bc=new BankingCashCounter();
  }
 }
