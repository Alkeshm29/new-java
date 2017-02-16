import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//int rs[]={1,2,5,10,50,100,500,1000};
		int rs[]={1000,500,100,50,20,10,5,2,1};
		
		int size=rs.length;
		int amount;
		int i=0;//rs.length+1;
		System.out.println("Enter Ammount");
		Scanner sc=new Scanner(System.in);
		amount=sc.nextInt();
		while(amount>0)
		{
			int count=0;
			while(rs[i]<=amount &&amount!=0)
			{
				amount=amount-rs[i];
				count++;
			}
			if(count>0)
			{
				System.out.println("Required Changes :"+rs[i]+"X"+count/*);*/+"="+rs[i]*count);
			}
			i++;
			
		}
		
		
		//		for(int i=size;i<=rs[i];i--)

		/*for(int i=size;i<0;i--)
		{
			int coin=amount % rs[i];
			//amount=amount-(coin*i);
			amount=amount/rs[i];
			
			System.out.println("Number of"+i+"coins required"+coin);
			
		}*/
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
*/	
	}

}
