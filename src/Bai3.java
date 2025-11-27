//Tính tiền và thuế giá trị gia tăng cho sản phẩm

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập tên sản phẩm: ");
		String ten = sc.nextLine();

		System.out.print("Nhập số lượng sản phẩm: ");
		int soLuong =  sc.nextInt();

		System.out.print("Nhập đơn giá: ");
		double donGia =  sc.nextDouble();

		double tong = soLuong * donGia;
		double thue = tong * 0.1;

		System.out.println("Tên: "	+ ten + "\n"
							+ "Tổng tiền: "	+ tong + "\n"
							+ "Thuế VAT: "	+ thue + "\n");
	}
}
