package javaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=new ArrayList<String>();
		
		list.add("New");
		list.add("world");
		list.add("earth");
		list.add("universe");
		list.add("universe");
		list.add("sun");
		list.add("moon");
		list.add(2, "planet");
		System.out.println(list.toString());
		
		Iterator itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
