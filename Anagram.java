import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Boolean FLAG=true;

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st string");
		String a=sc.nextLine();
		System.out.println("Enter 2nd string");
		String b=sc.nextLine();

		int i,j;
		i=a.length();
		j=b.length();

		if(i==j)
		{
			for(int k=0;k<i;k++)
			{
				for(int l=0;l<i;l++)
				{
					if(a.charAt(k)==b.charAt(l))
					{
						FLAG=true;
						break;
					}
					else
						FLAG=false;
				}
			}
		}
		else
			FLAG=false;
		if(FLAG)
			System.out.println("Given Strings are anagrams");
		else
			System.out.println("Given Strings are not anagrams");
		}
}

