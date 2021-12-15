package javaCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				//HASH SET//
		
		Set<String> hset=new HashSet<String>();
		
		hset.add("Ravi");
		hset.add("Arjun");
		hset.add("Bala");
		hset.add("Manoj");
		
		Iterator itr=hset.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
