package lab.arrays;

import java.util.Scanner;

public class ReverseSort {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			
		}
		int dig = 0;
		int rev = 0;
		
		int temp = 0;
		for(int i = 0; i < n; i++) {
			temp = arr[i];
			rev = 0;
			dig = 0;
			while(temp > 0) {
				dig = temp % 10;
				rev = rev*10+dig;
				temp = temp/10;
			}
			arr[i] = rev;
		}
		for(int i = 0; i < n; i++) {
		
			for(int j = 0; j <= i ; j++) {
				if(arr[i] < arr[j]) {
					int tem= arr[j];
					arr[j] = arr[i];
					arr[i] = tem;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
