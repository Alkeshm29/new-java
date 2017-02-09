import java.util.Scanner;

public class Pare {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String arr=sc.nextLine();

		int counter = 0,index = 0;
		    for(int i=0; i<arr.length(); i++)
		    {
		        if(arr.charAt(i)=='(')
		            counter++;
		        else if(arr.charAt(i)==')')
		            counter--;
		    }
		    if(counter == 0)
		    	System.out.println("Parenthis Match");	
		    else
		    	System.out.println("Parenthis is not match");
	}
}
