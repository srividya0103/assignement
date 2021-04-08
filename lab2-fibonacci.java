package lab.exercise;
import java.util.Scanner;
public class Fibonacci {
	public static int fibo(int n) {
		int a[] = new int[n+1];
		a[0] = 1;
		a[1] = 1;
		for(int i = 2; i <= n; i++) {
			a[i] = a[i-2]+a[i-1];
		}
		return a[n-1];
		
	}
		
	public static int fiboRec(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		return(fiboRec(n-1)+fiboRec(n-2));
		
		
	}
	
	
public static void main(String[] args) {
	int n;
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	int nth = fibo(n);
	int n1 = fiboRec(n);
	System.out.println(nth);
	System.out.println(n1);

}
}
