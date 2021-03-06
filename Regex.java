	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.InputStreamReader;
	import java.text.DateFormat;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
	
	public static void main(String[] args) throws Exception {
			String in = "";
			Scanner sc=new Scanner(System.in);
			System.out.println(in);
			String firstName = " ", contact;
			System.out.println("\nEnter Full name:");
			String name = sc.nextLine();
			boolean checkName = Pattern.matches("[A-Z][a-zA-Z]*[\\s][A-Z][a-zA-Z]*[\\s][A-Z][a-zA-Z]*",name);
			if (!checkName) 
			{
				System.out.println("Invalid format ...");
				System.exit(0);
				
			}
			else 
			{
				String fname[] = name.split(" ");
				firstName = fname[0];
			}

			System.out.println("Enter Mobile Number:");
			contact = sc.nextLine();
			boolean checkContact = Pattern.matches("[789]{1}\\d{9}",contact);
			if (!checkContact) {
				System.out.println("Invalid Number..");
				System.exit(0);
			}
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			String date = df.format(new Date());
			System.out.println(date);
			
			in = in.replace("<<name>>", firstName);
			in = in.replaceAll("<<full name>>", name);
			in = in.replace("xxxxxxxxxx", contact);
			in = in.replace("01/01/2016", date);
			System.out.println(in);

			
		}

}
