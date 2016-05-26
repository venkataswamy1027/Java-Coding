package com.bridgelabz.node;
public class Node<E>
{
	public String data;
	public Node nextNode;
	//constructor
	public Node()
	{
		this.nextNode=null;
	}
	public void setData(String data)
	{
		this.data=data;
		nextNode=null;
	}
}