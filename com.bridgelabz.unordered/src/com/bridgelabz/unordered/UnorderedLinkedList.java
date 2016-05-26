package com.bridgelabz.unordered;
import com.bridgelabz.node.Node;
import com.bridgelabz.nodeutility.NodeUtiliy;
/*
* created by: Bridge Labz
* Date 16/05/2016
* Perpose: Read the Text from a file, split it into words and arrange it as Linked List. Take a user input to search a Word in the List.
*If the Word is not found then add it to the list, and if it found then remove the word from the List.
*In the end save the list into a file
**/
import com.bridgelabz.util.Utility;
public class UnorderedLinkedList
{
  static  Node start;
  Utility  u1=new Utility();
  NodeUtiliy nu=new NodeUtiliy();
  public UnorderedLinkedList()
  {
    try
    {
        start=nu.readFile(start);
        System.out.print("Enter the word to search :");
        String word1=u1.inputString();
        //Search the word
        start=nu.searchData(start,word1);
        String word2=" ";
        while(start!=null)
        {
          word2=word2+start.data;
          word2=word2+" ";
          start=start.nextNode;
        }
          //  u1.writeToFile(start);
          nu.writeDataToFile(word2);
        }catch(NullPointerException n)
        {
          System.out.println(n);
        }
  }  //End of method
  public static void main(String[] args)
   {
     UnorderedLinkedList un=new UnorderedLinkedList();
   }
}
