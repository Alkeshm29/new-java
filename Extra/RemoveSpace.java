package Extra;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Strinf");
			String b=sc.nextLine();
			char[] a=b.toCharArray();
			String str="";
			for(int i=0;i<a.length;i++)//also compre ascii value of space
			{	
				if(a[i]!=' ')
				str=str+a[i];
			}
			System.out.println("New String are:"+str);
	}

}
