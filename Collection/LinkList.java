package Collection;

import java.util.ArrayList;
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
			//Sort
			Collections.sort(l);
			System.out.println("after sort"+l);
			//Get
			System.out.println("using get="+l.get(2));
			//Update
			System.out.println("Update f="+l.set(5,"XX")+":"+l);
			//Searching
			if(l.contains("B"))
				System.out.println("B is present at "+l.indexOf("B"));
			else 
				System.out.println("Element is not found");
			Collections.reverse(l);
			System.out.println("Reverse List"+l);
			
			Collections.shuffle(l);
			System.out.println("After Shuffle="+l);
			//Copying one list into another
//			LinkedList<String> cp=new LinkedList<String>();
//			Collections.copy(cp, l);
//			System.out.println("New List"+cp);
	}

}
