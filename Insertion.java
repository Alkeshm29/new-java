import java.util.Arrays;
import java.util.Scanner;

public class Insertion
{ 
	public static void main(String args[]) 
	{
		int[] arr = new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("Before sorting : " + Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("After sorting : " + Arrays.toString(arr)); } 

		public static void insertionSort(int[] arr) 
		{
			for (int i = 1; i < arr.length; i++) 
			{
				int j = i;
				while (j > 0 && arr[j] < arr[j- 1]) 
				{ 
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
					j--; 
				}
			}
		}
}
