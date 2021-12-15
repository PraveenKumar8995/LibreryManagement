package javaCollections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> trset=new TreeSet<String>();
		
		trset.add("Ravi");
		trset.add("Arjun");
		trset.add("Bala");
		trset.add("Manoj");
		
		System.out.println(trset);
		Iterator<String> itr=trset.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
