package Collection;

import java.util.Scanner;
import java.util.Stack;

public class RevStr {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		String arr[]=new String[str.length()];
		arr=str.split(" ");
		Stack<String> st=new Stack<>();
		for(String s:arr)
			st.push(s);
		
		System.out.println(st);
		while(!st.isEmpty())
		{
			System.out.print(" "+st.pop());
		}
		//------------------------------
		
	}

}
