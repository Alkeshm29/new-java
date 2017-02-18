import java.util.Scanner;

public class FindNumb {

	public static void main(String[] args) {
		int i;
		boolean ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of steps");
		int n = sc.nextInt();
		int result = (int) Math.pow(2, n);
		System.out.println("Remider num between 0 to " + result);
		int lower = 1;
		int upper = result;
		int mid;
		for (i = 1; i < n; i++) {
			mid = (upper + lower) / 2;
			System.out.println("if no between "+(lower-1) + " to " + (mid - 1));
			System.out.println("if Present then type -true not then -false");
			ch = sc.nextBoolean();
			
			if (ch) {
				upper = mid - 1;
			} else {
				lower = mid + 1;
			}
		}
		System.out.println("is u no " + (upper));
		ch = sc.nextBoolean();
		if (ch) {
			System.out.println("u r no" + (lower));
		} else
			System.out.println(" u r no is" + (upper));
		System.out.println("u r answer in steps" + i);
	}

}