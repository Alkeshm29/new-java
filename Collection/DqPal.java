package Collection;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DqPal {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
		System.out.println("Enter NAme for check");
		String name=sc.nextLine();
		String[] a = new String[name.length()];
		a=name.split(" ");
		int flag=0;
		//dq.add(name);
		Deque<String> dq=new LinkedList<String>(Arrays.asList(a));
		
		System.out.println(dq);
		while(!dq.isEmpty())
		{
			System.out.println("In While");
			//if(dq.getFirst()==dq.getLast())
			if(dq.getFirst().equals(dq.getLast()))
			{
				dq.removeFirst();
				if(!dq.isEmpty())
				dq.removeLast();
				System.out.println("In if");
			}
			else
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("Givsen String is Palindrom");
		else
			System.out.println("Given String is not Palindrom");
		
		sc.close();
	}
}
