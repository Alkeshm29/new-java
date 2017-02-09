package Extra;


	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.*;

	public class Unor 
	{
		public static void main(String[] args) {
			try {
				BufferedReader br = new BufferedReader(new FileReader("/home/bridgeit/Alkesh/input1"));
				String file;
				while ((file = br.readLine()) != null) {
					System.out.println(file.toLowerCase());
					
					String[] a = new String[file.length()];
			    	a=file.split(" ");
			        LinkedList ll = new LinkedList(Arrays.asList(a));
			 
			        Iterator iterator = ll.iterator();
			        while (iterator.hasNext()) {
			            // Print element to console
			            System.out.println((String) iterator.next());
			        }
			        Collections.sort(ll);
			        System.out.println(ll);
					
				}
			} catch (IOException e) {}
		}

	}
