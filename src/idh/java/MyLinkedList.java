package idh.java;

import java.util.Arrays; 
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class MyLinkedList<T> implements List<T> {

	/**
	 * We only need to store a dummy -1th element of our list.
	 * It nows whether there is a next element.
	 */
	ListElement prefirst = new ListElement(null);
	
	

	public boolean contains(Object o) {
		
		return containsRecursive(prefirst.next, o);
	}

   private boolean containsRecursive(ListElement current, Objekt o);
   if (current == 0) {
	   return false;
	   
	   if (o.equals(current.value) {
		   return true;
		   
		   return containsRecursive(current.next, o);
			
			
		
		}
	}

	

}
