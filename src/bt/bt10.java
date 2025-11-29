package bt;

import java.util.Scanner;

public class bt10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap so nguyen duong: ");
		int x = sc.nextInt();

		double squareRoot = Math.sqrt(x);

		if (squareRoot % 1 == 0) {
			System.out.print("x la so chinh phuong");
		} else {
			System.out.print("x ko phai la so chinh phuong");
		}
	}
}
