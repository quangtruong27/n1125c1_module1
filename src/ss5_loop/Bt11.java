package ss5_loop;

import java.util.Scanner;

/**
 * S = 1+1/3!+1/5!+…..+1/(2n-1)!
 */

public class Bt11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap n: ");
		int n = sc.nextInt();

		double s = 0.0;

		//C1
//		for(int i = 1; i <= n; i++){
//			int fact = 1;
//			for(int j = 1; j <= (2 * i - 1); j++){
//				fact = fact * j;
//			}
//		s = s + 1.0/fact;
//		}
		//C2
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			s = s + 1.0 / fact;
			fact = fact * (2 * i) * (2 * i + 1);
		}
		System.out.println("S: " + s);
	}
}
