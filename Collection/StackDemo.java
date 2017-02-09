package Collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Stack s=new Stack();
		
		s.push("1");
		s.push("2");
		s.push("3");
		s.push("4");
		s.push("A");
		s.push("B");
		s.push("c");
		
		System.out.println(s);
		
		int index=s.search("2");
		System.out.println(index);
		
		s.pop();
		System.out.println(s);
		
		System.out.println("top is "+s.peek());//sing peek top element
		
		int size=s.size();
		System.out.println("Size="+size);
	}

}
