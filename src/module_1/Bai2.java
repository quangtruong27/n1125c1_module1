package module_1;//Phép toán cơ bản giữa hai số

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập a:");
		int a = sc.nextInt();
		System.out.print("Nhập b:");
		int b = sc.nextInt();

		int tong = a + b;
		int hieu = a - b;
		int tich = a * b;
		double thuong = (double)a / b;

		System.out.println("Tổng: " + tong);
		System.out.println("Hiệu: " + hieu);
		System.out.println("Tích: " + tich);
		System.out.println("Thương: " + thuong);

	}
}
