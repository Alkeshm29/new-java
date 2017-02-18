import java.util.Scanner;

public class Tripls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Total Nos");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println("Given pair is Tripl=" + arr[i]+" " + arr[j] +" "+ arr[k]);
					}
					
				}
			}
		}
		sc.close();
	}

}
