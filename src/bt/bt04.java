package bt;

import java.util.Scanner;

public class bt04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập a: ");
		int a = sc.nextInt();

		System.out.print("Nhập b: ");
		int b = sc.nextInt();

		//int max, min;
//		C1
//		if (a > b) {
//			max = a;
//			min = b;
//		} else {
//			max = b;
//			min = a;
//		}

		//C2
		int max = (a > b) ? a : b;
		int min = (a < b) ? a : b;
		System.out.print("Max: " + max + "\n");
		System.out.print("Min: " + min);
	}
}
