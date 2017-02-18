import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to ABc Bank");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no of customar");
		int n = sc.nextInt();
		Queue<Integer> q = new LinkedList<Integer>();
		int i;
		for (i = 0; i < n; i++)
			q.add(i);
		System.out.println("Total no of cust are :" +q.size());

		while (!q.isEmpty()) {
			System.out.println("Emter Ammount");
			int amout = sc.nextInt();
			System.out.println("Enter cash");
			int cash = sc.nextInt();
			System.out.println("Enter Choice--->1.Diposit 2.Withdrow 3.Balance Enqury");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				amout -= cash;
				System.out.println("Your Transaction is complitade Balance is " + amout);
				q.remove();
				break;
			case 2:
				amout += cash;
				System.out.println("Your Transaction is complitade Balance is " + amout);
				q.remove();
				break;
			case 3:
				System.out.println("Your Transaction is complitade Balance is " + amout);
				q.remove();
				break;
			default:
				System.exit(0);
				break;
			}
		}
		sc.close();
	}

}
