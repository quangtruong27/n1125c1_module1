package ss5_loop;

import java.util.Scanner;

/**
 * In dãy số 2, -4, 6, -8, 10 … n (n là số nhập vào từ bàn phím) (*)
 */

public class Bt03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập n: ");
		int n = sc.nextInt();

		for (int i = 2; i <= n; i += 2)
			if (i % 4 == 0) {
				System.out.println(-i);
			} else {
				System.out.println(i);
			}
	}
}
