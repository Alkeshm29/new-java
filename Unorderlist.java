import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
	 
public class Unorderlist 
{	 
    public static void main(String[] args) 
    {

    	Scanner sc=new Scanner(System.in);
    	String[] a = new String[100];
    	System.out.println("Enter The String");
    	String b=sc.nextLine();
    	a=b.split(" ");
	        // convert array to LinkedList
	        LinkedList ll = new LinkedList(Arrays.asList(a));
	 
	        // iterate over each element in LinkedList and show 
	        //	what is in the list.
	        Iterator iterator = ll.iterator();
	        while (iterator.hasNext()) {
	            // Print element to console
	            System.out.println((String) iterator.next());
	        }
	        Collections.sort(ll);
	        System.out.println(ll);
    } 
}
