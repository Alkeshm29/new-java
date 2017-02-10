import java.util.Random;
import java.util.Scanner;
	
public class Coupan 
{
		static Scanner sc=new Scanner(System.in);
		static int n;
		
		static void random(int num)
		{
		System.out.println("Enter the range of random number=");		
		int n=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			Random r=new Random();
			int random=r.nextInt(n);
			System.out.println("Coupan Number are="+random);
		}


		}
		public static void main(String args[])
		{
			System.out.println("Enter the no of random number you want=");
			int num=sc.nextInt();
			random(num);
		}
	
}
	