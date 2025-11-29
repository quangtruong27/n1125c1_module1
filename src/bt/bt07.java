package bt;

import java.util.Scanner;

public class bt07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập TNCT: ");
		int tnct = sc.nextInt();

		double luongcanban = 65000;

		double heSo;

		if (tnct < 12) {
			heSo = 1.92;
		} else if (tnct < 36) {
			heSo = 2.34;
		} else if (tnct < 60) {
			heSo = 3;
		} else {
			heSo = 4.5;
		}

		double luong = luongcanban * heSo;
		System.out.println("Luong: " + luong + "$");
	}
}
