package ss5_loop;

import java.util.Scanner;

public class Bt24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap gia: ");
		int price = sc.nextInt();
		System.out.print("Nhap tien tra: ");
		int paid = sc.nextInt();

		int change = paid - price;

		for (int i = 3; i >= 1; i--) {

			int donVi = (int) Math.pow(10, i);

			if (change >= 500 * donVi) {
				System.out.printf("Co %d to %d\n", change / (500 * donVi), 500 * donVi);
				change = change % (500 * donVi);
			}
			if (change >= 200 * donVi) {
				System.out.printf(" Co %d to %d\n", change / (200 * donVi), 200 * donVi);
				change = change % (200 * donVi);
			}
			if (change >= 100 * donVi) {
				System.out.printf(" Co %d to %d\n", change / (100 * donVi), 100 * donVi);
				change = change % (100 * donVi);
			}

		}

	}
}
