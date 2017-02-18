package Collection;

import java.util.Scanner;

public class RevStr1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();

		String arr[] = new String[str.length()];
		arr = str.split(" ");
		String reverse = "", r = "";
		for (String s : arr) 
		{
			reverse = s;
			r="";
			int len=reverse.length();
			 for (int i=len-1;i>=0;i--)
		         r = r+reverse.charAt(i);
			
			System.out.print(r+" ");
		}
	}
}

/*Output
Enter String
I am going to pune
I ma gniog ot enup */