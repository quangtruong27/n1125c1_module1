package module_1;//Tính số nút trên biển số xe

import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		System.out.print("Nhập biển số xe: ");
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();

		int nut = (a + b + c + d + e) % 10;

		System.out.print("Số nút là: " + nut);
	}
}
