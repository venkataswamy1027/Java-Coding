package com.bridgelabz.stack;
import com.bridgelabz.node.Node;
public class StackClassMethod<E>
{
 public   Node<E> top;
static int count=0;
public void isEmpty()
{
    if(top == null)
    {
        System.out.println("Stack is Empty");
    }
    else
    {
        System.out.println("Stack is Not Empty");
    }
}
   public  void push( E data)
    {
        Node<E> temp= new Node();//creating a new node
        temp .data =data;
        if(top == null)
        {
            top=temp;
        temp .nextNode =null;
        }
        else
        {
            temp.nextNode = top;
            top=temp;
        }
        count++;
    }
    public void pop()//deletion operation
    {
        Node<E>top1 =top;
        if(top1 == null)
        {
            System.out.println("Stack Empty");
        }
        else
        {
            top1 = top1.nextNode;
             //System.out.println("Popped data : " +top.data)
                     top = top1;
        }
        count--;
    }

    public int size()
    {
        return count;
    }

    public void peek()
    {
        System.out.println("The Peek Element is "+top.data);
    }
}
