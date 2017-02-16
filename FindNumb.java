import java.util.Scanner;

public class FindNumb {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter Number you want to");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		int pow=(int)Math.pow(2, n);
		System.out.println("THe range of your num is 0 to "+pow);
		int last=pow,first=0;
		char ch;	
		//if("No")
		while(1)
		{
			int mid=(first+last)/2;
			switch(ch)
			{
				case 'y': 
					last = mid - 1;
					break;
				case 'n': 	
					first = mid+1;
					break;
			}
		}
		
		
		
		/*System.out.println("Please enter "+n+" number..");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}*/
		
		
	}

}
