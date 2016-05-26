package com.bridgelabz.stack;
/*
*Created by:Bridge Labz
*Date 16-05-2016
*Perpose:read an Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6)
*Ensure parentheses must appear in a balanced or not.
**/
import com.bridgelabz.util.Utility;
import com.bridgelabz.stack.StackClassMethod;
public class BalancedParentheses
{
  Utility u1=new Utility();
  public BalancedParentheses()
  {
      //Stack<Character>stack =new Stack();
      StackClassMethod<Character>stack=new StackClassMethod();
      System.out.println("Enter Equation Expression like (3*4)+(4*5) ");
      String  expression =u1.inputString();
      for(int i =0; i<expression.length();i++)
      {
            char c = expression.charAt(i);
            if(c=='(' || c=='{')
            {
                stack.push(c);
            }
            else if(c==')'|| c=='}')
            {
              stack.pop();
            }
        }//end of for loop
        int n=stack.size();
        if(n==0)
        {
            System.out.println("Expression is Balanced ");
        }
        else
        {
            System.out.println("Expresion is Not Balanced");
        }
  }
  public static void main(String[] args)
  {
    BalancedParentheses bp=new BalancedParentheses();
  }
}
