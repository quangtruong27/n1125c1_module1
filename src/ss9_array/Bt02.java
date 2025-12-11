package ss9_array;

import java.util.Scanner;

public class Bt02 {
	static Scanner sc = new Scanner(System.in);

	public static void inputEmployee(
			String[] hoTen,
			int[] tuoi,
			String[] gioiTinh,
			double[] luong,
			double[] diemTB,
			int index

	) {
		System.out.println("\nNhao nhan vien thu " + (index + 1));

		System.out.print("Ho ten: ");
		hoTen[index] = sc.nextLine();

		System.out.print("Tuoi: ");
		tuoi[index] = Integer.parseInt(sc.nextLine());

		System.out.print("Gioi tinh: ");
		gioiTinh[index] = sc.nextLine();

		System.out.print("Luong co ban: ");
		luong[index] = Double.parseDouble(sc.nextLine());

		System.out.print("Điem TB: ");
		diemTB[index] = Double.parseDouble(sc.nextLine());
	}

	public static void outputEmployee(
			String[] hoTen,
			int[] tuoi,
			String[] gioiTinh,
			double[] luong,
			double[] diemTB,
			int index
	) {
		System.out.println("\nNhan vien thu" + (index + 1));
		System.out.println("Ho ten: " + hoTen[index]);
		System.out.println("Tuoi: " + tuoi[index]);
		System.out.println("Gioi tinh: " + gioiTinh[index]);
		System.out.println("Luong co ban: " + luong[index]);
		System.out.println("Điem TB: " + diemTB[index]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap so luong nhan vien: ");
		int n = Integer.parseInt(sc.nextLine());

		String[] hoTen = new String[n];
		int[] tuoi = new int[n];
		String[] gioiTinh = new String[n];
		double[] luong = new double[n];
		double[] diemTB = new double[n];

		for (int i = 0; i < n; i++) {
			inputEmployee(hoTen, tuoi, gioiTinh, luong, diemTB, i);
		}

		System.out.println("\nDANH SACH NHAN VIEN");
		for (int i = 0; i < n; i++) {
			outputEmployee(hoTen, tuoi, gioiTinh, luong, diemTB, i);
		}
	}
}
