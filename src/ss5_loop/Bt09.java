package ss5_loop;

import java.util.Scanner;

/**
 * In dãy số 1, -3, 7, -15, 31, … (n là số nhập vào từ bàn phím).
 */
public class Bt09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap n: ");
		int n = sc.nextInt();

		int a = 1;
		int dau = 1;

		int i = 1;
		while (a <= n) {
			System.out.println(a * dau);
			a = a * 2 + 1;
			dau = -dau;
		}
	}
}
