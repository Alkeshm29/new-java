package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ListCol {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("Java");
		al.add("c");
		al.add("c++");
		al.add("Shell");
		al.add("sql");
		al.add("Asp");
		
		al.add(6,"html");//Add specific Location
		
	
		Iterator t=al.iterator();
		
		System.out.println("ArrayLIst1"+al);
		System.out.println("Array list2 :");
		
		for(String str:al)
		{
			System.out.print(str+" ");
		}
		
		//for Remove
		al.remove("Shell");
		System.out.println("\n ArrayLIst1"+al);
		//Get Specific elem
		System.out.println("Specific elem is: "+al.get(2));
		//index
		System.out.println("Index of JAva:"+al.indexOf("Java"));
		//sort list
		Collections.sort(al);
		System.out.println("\n ArrayLIst1"+al);
		//clear
		al.clear();
		System.out.println("After Clear "+al);
		
	}

}
