package javaCollections;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Queue<String> queue=new ArrayDeque<>();
	Queue<String> queue=new PriorityQueue<>();
	
	queue.add("Praveen Kumar");
	queue.add("Chithu Cuty");
	queue.add("Vicky Kumar");
	queue.add("Ashok Kumar");
	queue.add("Gopi Krish");
	queue.add("Sri Ram");
	
	System.out.println("Head"+queue.element());
	System.out.println("Header"+queue.peek());
	
	Iterator itr=queue.iterator();
	
	System.out.println("---Before removing------");
	while(itr.hasNext())
	{
		//System.out.println("---Before removing------");
		System.out.println(itr.next());
	}
	
	queue.remove();
	queue.poll();
	
	System.out.println("---After removing------");
	
	for(String str1:queue)
	{
		System.out.println(str1);
	}
	
//	Iterator itr1=queue.iterator();
//	while(itr1.hasNext())
//	{
//		System.out.println(itr1.next());
//	}
	
	
	Queue<String> queue1=new ArrayDeque<>();
	
	queue1.add("King");
	queue1.add("Queen");
	queue1.add("Prince");
	queue1.add("Princes");
	queue1.add("Minister");
	queue1.add("weapons");
	
	System.out.println("------------------------------");
	
	Iterator itr2=queue.iterator();
	while(itr2.hasNext())
	{
		System.out.println(itr2.next());
	}	
	for (String str: queue1) /// This can be used instead of Iterator:
	{
		
		System.out.println(str);
	}
	}
}
