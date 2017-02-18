import java.util.Scanner;

public class Gambler 
{
		public static void main(String[] args) 
		{	
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Stake value: ");
			int $Stake=sc.nextInt();
			System.out.println("Enter Goal value: ");
			int $Goal=sc.nextInt();
			System.out.println("Enter number of times: ");
			int times=sc.nextInt();
			
			int bets = 0;        // total number of bets made
			int wins = 0;        // total number of games won

			// repeat number of times
			for (int i=0;i<times;i++) 
			{
				int cash=$Stake;
		            
				while(cash>0&&cash<$Goal)
				{
					bets++;
		        	if(Math.random()<0.5) 
						cash++;     // win $1
					else                     
						cash--;     // lose $1
				}
		            if (cash==$Goal) 
		            	wins++;                // to find no. of wins   
			}

			System.out.println();
			System.out.println(wins + " wins of " + times);
			System.out.println("Percent of games won = " + 100.0 * wins / times);
			System.out.println("Avg # bets= " + 1.0 * bets / times);
			sc.close();
		}


}
