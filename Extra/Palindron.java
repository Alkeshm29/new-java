package Extra;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Palindron {
	    public static void main(String[] args)
	    {
	    	Scanner sc=new Scanner(System.in);
	        String str,str2;
	        int flag =1;
	        str=sc.nextLine();
	        str2=sc.nextLine();
	        
	        char[] arr=str.toCharArray();
	        Arrays.sort(arr);
	        String sorted=new String(arr);
	        
	        char[] arr1=str2.toCharArray();
	        Arrays.sort(arr1);
	        String sorted2=new String(arr1);
	        
	        System.out.println(sorted);
	        System.out.println(sorted2);
	        
	        for(int i=0;i<str.length();i++)
	        {
	        	 if(sorted.charAt(i) == sorted2.charAt(i))
	        	 {
	        		 //System.out.println("");
	        	 		flag=0;
	        	 }
	        	 
	        }
	        if(flag==0)
	        	System.out.println("Match");
	        else 
       		 System.out.println("Not match");
	        
	    }
	    
	}
