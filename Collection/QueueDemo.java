package Collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		Queue<Integer> q=new LinkedList<Integer>();
		for(int i=0;i<n;i++)
			q.add(i);
		System.out.println(q);

		System.out.println("Size of Queue is :"+q.size());
		
		q.remove();
		System.out.println("After Remove"+q);
		System.out.println("Size of Queue is :"+q.size());
		
		sc.close();
		
	}

}
