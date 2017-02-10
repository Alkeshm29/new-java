import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int rs[]={1,2,5,10,50,100,500,1000};
		int size=rs.length;
		int amount;
		System.out.println("Enter Ammount");
		Scanner sc=new Scanner(System.in);
		amount=sc.nextInt();
		for(int i=size;i<rs[i];i--)
		{
			int coin=amount % rs[i];
			amount=amount-(coin*i);
			System.out.println("Number of"+i+"coins required"+coin);
		}
/*		
		ArrayList<String> al=new ArrayList<String>();
		al.add("1000");
		al.add("500");
		al.add("100");
		al.add("50");
		al.add("10");
		al.add("5");
		al.add("2");
		al.add("1");
		
		for(String rs:al)
		{
			//System.out.println(al);
			String coin=amount % al;
		}
*/	}

}
