package bt;

import java.util.Scanner;

public class bt06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập a: ");
		double a = sc.nextDouble();

		System.out.print("Nhập b: ");
		double b = sc.nextDouble();

		System.out.print("Nhập c: ");
		double c = sc.nextDouble();

		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.print("PT vô số nghiệm");
				} else {
					System.out.print("PT vô nghiệm");
				}
			} else {
				double x = -c / b;
				System.out.print("X = " + x);
			}
		} else {
			double delta = b * b - 4 * a * c;

			if (delta < 0) {
				System.out.println("Pt vô nghiệm");
			} else if (delta == 0) {
				double x = -b / 2 * a;
				System.out.println("PT có một nghiệm duy nhất: " + x);
			} else {
				double x1 = (-b - Math.sqrt(delta)) / (2 * a);
				double x2 = (-b + Math.sqrt(delta)) / (2 * a);
				System.out.println("PT có 2 nghiệm phân biệt");
				System.out.print("X1 = " + x1 + "\n");
				System.out.print("X2 = " + x2);
			}
		}
	}
}
