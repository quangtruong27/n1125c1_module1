package ss9_array;

import java.util.Scanner;

public class Bt03 {

	static Scanner sc = new Scanner(System.in);
	static String[] hoTen;
	static int[] tuoi;
	static String[] gioiTinh;
	static double[] luong;
	static double[] diemTB;

	public static void inputEmployee(int index) {
		System.out.println("\nNhap nhan vien thu " + (index + 1));

		System.out.print("Ho ten: ");
		hoTen[index] = sc.nextLine();

		System.out.print("Tuoi: ");
		tuoi[index] = sc.nextInt();
		sc.nextLine();

		System.out.print("Gioi tinh: ");
		gioiTinh[index] = sc.nextLine();

		System.out.print("Luong co ban: ");
		luong[index] = sc.nextDouble();
		sc.nextLine();

		System.out.print("Diem TB: ");
		diemTB[index] = sc.nextDouble();
		sc.nextLine();
	}

	public static void outputEmployee(int index) {
		System.out.println("\nNhan vien thu " + (index + 1));
		System.out.println("Ho ten: " + hoTen[index]);
		System.out.println("Tuoi: " + tuoi[index]);
		System.out.println("Gioi tinh: " + gioiTinh[index]);
		System.out.println("Luong co ban: " + luong[index]);
		System.out.println("Diem TB: " + diemTB[index]);
	}


	public static void findMaxDiemTB() {
		double max = diemTB[0];

		for (double d : diemTB) {
			if (d > max) {
				max = d;
			}
		}

		System.out.println("\nNhan vien co diem TB cao nhat: " + max);
		for (int i = 0; i < diemTB.length; i++) {
			if (diemTB[i] == max) {
				outputEmployee(i);
			}
		}
	}


	public static void findByNameExact(String name) {
		boolean tim = false;

		System.out.println("\nKet qua tim kiem (chinh xac)");
		for (int i = 0; i < hoTen.length; i++) {
			if (hoTen[i].equalsIgnoreCase(name)) {
				outputEmployee(i);
				tim = true;
			}
		}

		if (!tim) {
			System.out.println("Khong tim thay nhan vien ten: " + name);
		}
	}


	public static void findByNameSoft(String keyword) {
		boolean tim = false;
		keyword = keyword.toLowerCase();

		System.out.println("\nKet qua tim kiem (gan dung)");
		for (int i = 0; i < hoTen.length; i++) {
			if (hoTen[i].toLowerCase().contains(keyword)) {
				outputEmployee(i);
				tim = true;
			}
		}

		if (!tim) {
			System.out.println("Khong co nhan vien nao chua tu khoa: " + keyword);
		}
	}


	public static void main(String[] args) {

		System.out.print("Nhap so luong nhan vien: ");
		int n = sc.nextInt();
		sc.nextLine();

		hoTen = new String[n];
		tuoi = new int[n];
		gioiTinh = new String[n];
		luong = new double[n];
		diemTB = new double[n];

		// Nhap
		for (int i = 0; i < n; i++) {
			inputEmployee(i);
		}

		// Xuat
		System.out.println("\nDANH SACH NHAN VIEN");
		for (int i = 0; i < n; i++) {
			outputEmployee(i);
		}

		// a. Tim diem TB cao nhat
		findMaxDiemTB();

		// b. Tim theo ten chinh xac
		System.out.print("\nNhap ten can tim (chinh xac): ");
		String nameExact = sc.nextLine();
		findByNameExact(nameExact);

		// c. Tim theo ten gan dung
		System.out.print("\nNhap tu khoa tim kiem: ");
		String keyword = sc.nextLine();
		findByNameSoft(keyword);
	}
}
