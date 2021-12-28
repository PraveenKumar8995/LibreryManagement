package javaCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> lhset=new LinkedHashSet<String>();
		
		lhset.add("Ravi");
		lhset.add("Arjun");
		lhset.add("Bala");
		lhset.add("Manoj");
		lhset.add("Ravi");
		//mmm
		Iterator itr=lhset.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
