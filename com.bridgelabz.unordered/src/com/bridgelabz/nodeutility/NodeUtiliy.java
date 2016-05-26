package com.bridgelabz.nodeutility;
import com.bridgelabz.node.Node;//for unordered programming node1
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.lang.NullPointerException;
public class NodeUtiliy
{
  //Reading string from file
 public Node readFile(Node start)
 {
     try{
           FileInputStream fis = new FileInputStream("/home/rgukt/workspace/com.bridgelabz.unordered/data.txt");
           char ch;
           String word3="";
           while (fis.available() > 0)
           {
             ch = (char) fis.read();
             word3=word3+ch;
           }
           String[] wordsArray=word3.split(" ");
           for(int i =0; i < wordsArray.length ; i++)
           {
           start=addWordstoList(start,wordsArray[i]);
            }
          }
     		catch(NullPointerException ne)
     		{
     			System.out.println(ne);
     		}
           catch(IOException e){
           }
           return start;
 }//End of read method
 //Insert words...........
public Node addWordstoList(Node node1,String str)
{
   Node node2=node1;
   Node newNode=new Node();
   newNode.data=str;
   newNode.nextNode=null;
   if(node1==null)
   {
     return newNode;
   }
   else{
     while(node1.nextNode!=null)
     {
       node1=node1.nextNode;
     }
     node1.nextNode=newNode;
   }
   return node2;
}//End of insert method
//Search words
public Node searchData(Node node,String word)
{
     Node temp=node;
     while(node.nextNode!=null){
       if(word.compareTo((node.nextNode).data)==0)
       {
         node.nextNode=(node.nextNode).nextNode;
         System.out.println("Word is Found");
         System.out.println("the founded word is deleted from the file");
         System.out.println("file saved");
         return temp;
       }
       node=node.nextNode;
     }
     System.out.println("Word is not Found");
     System.out.println("the not founded word is added to the file");
     System.out.println("file saved");
     temp=addWordstoList(temp,word);
     return temp;
}//End of Search word
//writeToFile
public void writeDataToFile(String nWord)
{
      try{
      File fi=new File("/home/rgukt/workspacecom.bridgelabz.unordered/data.txt");
      fi.createNewFile();
      FileWriter fw=new FileWriter(fi);
         fw.write(nWord);
         fw.close();
      }
      catch(IOException e){
      }
      }
}