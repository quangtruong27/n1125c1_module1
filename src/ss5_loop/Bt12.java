package ss5_loop;

import java.util.Scanner;

/**
 * Tính tổng và tích các chữ số của một số m, m được nhập từ bàn phím
 */

public class Bt12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap m: ");
		int m = sc.nextInt();

		int s = 0;
		int p = 1;


		int i = 1;
		while (m > 0) {
			int digit = m % 10;

			s = s + digit;
			p = p * digit;
			m = m / 10;

		}
		System.out.println(s);
		System.out.println(p);
	}
}
