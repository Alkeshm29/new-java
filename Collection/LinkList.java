package Collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			LinkedList<String> l=new LinkedList<String>();
			l.add("A");
			l.add("B");
			l.add("c");
			l.add("d");
			l.add("e");
			l.add("f");
			
			System.out.println("Linked list="+l);
			
			l.addFirst("1");
			l.addLast("2");
			System.out.println("List afyer add"+l);
			
			l.removeLast();
			l.removeFirst();
			System.out.println("List afyer Remove"+l);
			
			l.add(4,"4");
			System.out.println("List afyer add"+l);
			
			l.remove(5);
			System.out.println("List afyer Remove"+l);
			
			System.out.println("Size of list is="+l.size());
			
			Collections.sort(l);
			System.out.println("after sort"+l);
			
			
	}

}
