package com.bridgelabz.deque;
public class Deque<E>
{
  public E data;
  public Deque<E>head;
  public Deque<E>tail;
  public Deque(E item)
  {
    this.data=item;
    this.head=null;
    this.tail=null;
  }
}
