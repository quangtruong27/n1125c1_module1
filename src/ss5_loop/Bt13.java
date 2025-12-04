package ss5_loop;

import java.util.Scanner;

/**
 * Nhập 2 số nguyên dương a và b. Sau đó in ra ước số chung lớn nhất và bội số chung nhỏ nhất của 2 số nguyên dương a và b đó.
 */
public class Bt13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap a: ");
		int a = sc.nextInt();
		System.out.print("Nhap b: ");
		int b = sc.nextInt();

		int min = Math.min(a, b);
		int max = Math.max(a, b);

		for (int i = min; i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				System.out.println("USCLN: " + i);
				break;
			}
		}

		for (int i = max; ; i += max) {
			if (i % a == 0 && i % b == 0) {
				System.out.print("BSCNN: " + i);
				break;
			}
		}


	}
}
