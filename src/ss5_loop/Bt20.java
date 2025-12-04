package ss5_loop;

import java.util.Scanner;

/**
 * Viết chương trình tính S = a! + b! + c! với a, b, c là 3 số nguyên dương nhập từ bàn phím.
 */

public class Bt20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap a: ");
		int a = sc.nextInt();
		System.out.print("Nhap b: ");
		int b = sc.nextInt();
		System.out.print("Nhap c: ");
		int c = sc.nextInt();

		int a1 = 1, b1 = 1, c1 = 1;

		for (int i = 1; i <= a; i++) {
			a1 = a1 * i;
		}
		for (int i = 1; i <= b; i++) {
			b1 = b1 * i;
		}
		for (int i = 1; i <= c; i++) {
			c1 = c1 * i;
		}

		int s = a1 + b1 + c1;

		System.out.print("S: " + s);
	}
}
