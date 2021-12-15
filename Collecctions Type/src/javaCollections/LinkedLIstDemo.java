package javaCollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedLIstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new LinkedList<String>();
		
		list.add("New");
		list.add("world");
		list.add("earth");
		list.add("universe");
		list.add("sun");
		list.add("moon");
		list.add(2, "planet");
		
		Iterator itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
