//Tính điểm trung bình của học sinh

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập điểm môn Toán: ");
		double toan = sc.nextDouble();

		System.out.print("Nhập điểm môn Lý: ");
		double ly = sc.nextDouble();

		System.out.print("Nhập điểm môn Hoá: ");
		double hoa = sc.nextDouble();

		double dtb = (toan + ly + hoa) / 3;
		System.out.print("Điểm trung bình là: " + dtb);
	}
}
