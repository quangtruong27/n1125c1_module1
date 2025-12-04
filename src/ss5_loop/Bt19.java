package ss5_loop;

import java.util.Scanner;

/**
 * Viết chương nhập vào một số nguyên dương n. Sau đó quy đổi n ra hệ nhị phân.
 */

public class Bt19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = sc.nextInt();

		String binary = "";
		int du;

		for( int i = n; i > 0; i /= 2){
			du = i % 2;
			binary = du + binary;
		}
		System.out.print("binary = " + binary);
	}
}
