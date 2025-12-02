package ss5_loop;

import java.util.Scanner;

/**
 * In dãy số 1, 3, 5, 7, 9 … n (n là số nhập vào từ bàn phím)
 */

public class Bt02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập n: ");
		int n = sc.nextInt();

		//c1
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		//c2
		for (int i = 1; i <= n; i += 2) {
			System.out.println(i + "\t");
		}
	}
}
