package Collection;

import java.util.Deque;
import java.util.LinkedList;

public class DqueueDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Deque<String> dq=new LinkedList<String>();
		dq.add("A");
		dq.add("B");
		dq.addFirst("1");
		dq.addLast("7");
		dq.add("c");
		System.out.println(dq);
		
		System.out.println("Size of dq is :"+dq.size());
		
		System.out.println(dq.contains("B"));
		
		dq.removeLast();
		System.out.println(dq.getLast());
		
		dq.removeFirst();
		System.out.println(dq);
		
		System.out.println(dq.getLast());
	}

}
