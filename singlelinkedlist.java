package singlylinkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class singlelinkedlist {

	public static void main(String[] args) {
		List<String> list = new LinkedList();
		
		list.add("0");
		list.add("1");
		list.add("java");
		System.out.println(list);	
		//Size of the list 
		System.out.println("Size of list: "+list.size());
		//get list at position
		System.out.println(list.get(2));
		// set method
		list.set(0,"zero");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		List<String> list1 = new LinkedList<String>();
		list1.add(0,"5");
		list1.add("eclipse");
		list1.add("IDE");
		list1.add(0,"lenovo");
		list.addAll(list1);
		
		System.out.println(list);
		//iterator
		System.out.println("elements: ");
		for(int i=0; i<list.size(); i++)
		{
		System.out.println(list.get(i) + " ");
		}
		// TODO Auto-generated method stub

	}

	

}
