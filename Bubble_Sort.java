import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("Before sorting : " + Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("After sorting : " + Arrays.toString(arr)); 
		}

		public static void bubbleSort(int[] arr) 
		{
			int n=5;
			int temp=0;
			for(int i=0;i<n;i++)
			{  
                for(int j=1;j<(n-i);j++)
                {  
                	if(arr[j-1]>arr[j])
                	{  
                		   temp = arr[j-1];  
                		   arr[j-1]=arr[j];  
                		   arr[j]=temp; 
                	}
                }
            }
		}
}