package module_1;//Tính chu vi và diện tích hình tròn

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập bán kính của hình tròn: ");
		double r =  sc.nextDouble();

		double chuVi = 2 * Math.PI * r;
		double dienTich = Math.PI * r * r;

		System.out.print("Chu vi: " + chuVi + "\n"
							+ "Diện tích: " + dienTich);
	}
}
