package ss5_loop;

import java.util.Scanner;

/**
 * In dãy số 1, 2, 3, 5, 8, 13, …n (n là số nhập vào từ bàn phím) (*).
 */

public class Bt07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;

		int f1 = 0;
		int f2 = 1;
		int fn = 1;

		do {
			System.out.print("Nhập n: ");
			n = sc.nextInt();
			if (n < 0) {
				System.out.println("Phai nhap so nguyen duong");
			}
		} while (n < 0);

		while (fn < n) {
			System.out.println(fn);
			f1 = f2;
			f2 = fn;
			fn = f1 + f2;
		}
	}
}
