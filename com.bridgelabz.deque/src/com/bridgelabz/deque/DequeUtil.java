package com.bridgelabz.deque;
import com.bridgelabz.deque.Deque;
public class DequeUtil<E>
{
//.............deque operations.............
  Deque <E> front;
  Deque <E> rear;
  int size =0;
  public boolean isEmpty()
  {
      if(front == null)
      {
          return true;
      }
      else
          return false;
  }
  // Add at Front
  public void addFront(E item)
  {
      if(front == null)
      {
          front.data =item;
          rear = front;
      }
      else
      {
          Deque<E>temp =null;
          temp.data =item;
          temp.head =front;
          front.tail =temp;
          front =temp;
      }
      size++;
  }
  public void addRear(E item)
  {
      if(front == null){
          Deque <E> temp =new Deque(item);

          front = temp;

          rear =front;
      }
      else
      {
          Deque<E> temp =new Deque(item);
          rear.head =temp;
          temp.tail=rear;
          rear =temp;
      }
      size++;
  }
  // remove Front
  public E removeFront()
  {
      E val =null;
      if(front == null)
      {
          System.out.println("List is Empty no Element To Delete");
      }
      else{
          val=front.data;
          front =front.head;
      }
      size--;
      return val;
  }
  public E removeRear()
  {
      E val = null;
      if(front == null)
      {
          System.out.println(" List Empty has no ELement to delete ");
      }
      else
      {
          val=rear.data;
          rear=rear.tail;
          rear.head=null;
      }
      size--;
      return val;
  }
  public int size()
  {
      return size;
  }
}
