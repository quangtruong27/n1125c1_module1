package ss5_loop;

import java.util.Scanner;

/**
 * In dãy số 2, -4, 6, 8, -10, 12, 14, 16, -18, ….., n (n là số nhập vào từ bàn phím)
 */

public class Bt06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập n: ");
		int n = sc.nextInt();

		int distance = 1;
		int count = 0;

		for (int i = 2; i <= n; i += 2) {
			if (count == distance) {
				System.out.println(-i);
				count = 0;
				distance = distance + 1;
			} else {
				System.out.println(i);
				count = count + 1;
			}
		}
	}
}
