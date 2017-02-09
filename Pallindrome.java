import java.util.*;

public class Pallindrome 
{
	   public static void main(String args[])
	   {
	      String str, reverse = "";
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter the string");
	      str = sc.nextLine();
	 
	      int length = str.length();
	 
	      for (int i=length-1;i>=0;i--)
	         reverse = reverse+str.charAt(i);
	 
	      if (str.equals(reverse))
	         System.out.println("String is a palindrome");
	      else
	         System.out.println("String is not a palindrome");
	 
	   }	   		
}
