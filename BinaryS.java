import java.util.Scanner;

public class BinaryS 
{
		public static void main(String[] args){
			int size,start,end,mid,count = 0; 
			Scanner u = new Scanner(System.in);
			System.out.println("Please Enter Strings");
			String names = u.toString();
			String str1[] = names.split(",");
			size = str1.length;
			String str2;
			System.out.println("Please Enter the string to be find :");
			str2 = u.toString();
			
			System.out.print("Sorted Strings are: ");
			//u.printArray(str1); //Generic type array printing
			
			
			start = 0;
			end  = size-1;

			while(start <= end){
				mid = (start+end)/2;
				if (str2.compareTo(str1[mid])==0){
					System.out.println("\nSearch found at position :"+mid);
					count++;
					break;
				}
				if(str2.compareTo(str1[mid])<0)
					end = mid-1;
				else
					start = mid+1;		
			}
			if(count == 0)
				System.out.println("\nSearch not found");		
			
		}
	}
	
	

//}
