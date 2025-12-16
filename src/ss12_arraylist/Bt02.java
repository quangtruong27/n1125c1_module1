package ss12_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Bt02 {
	static Scanner sc = new Scanner(System.in);

	static ArrayList<String> hoTen = new ArrayList<>();
	static ArrayList<Integer> tuoi = new ArrayList<>();
	static ArrayList<String> gioiTinh = new ArrayList<>();
	static ArrayList<Double> luongCoBan = new ArrayList<>();
	static ArrayList<Double> diemTB = new ArrayList<>();

	public static void main(String[] args) {

		System.out.print("Nhap so luong nhan vien: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("\nNhap nhan vien thu " + (i + 1));
			inputEmployee();
		}

		System.out.println("\nDANH SACH NHAN VIEN");
		for (int i = 0; i < hoTen.size(); i++) {
			outputEmployee(i);
		}
	}

	public static void inputEmployee() {
		System.out.print("Ho ten: ");
		hoTen.add(sc.nextLine());

		System.out.print("Tuoi: ");
		tuoi.add(sc.nextInt());
		sc.nextLine();

		System.out.print("Gioi tinh: ");
		gioiTinh.add(sc.nextLine());

		System.out.print("Luong co ban: ");
		luongCoBan.add(sc.nextDouble());

		System.out.print("Đirm TB: ");
		diemTB.add(sc.nextDouble());
		sc.nextLine();
	}

	public static void outputEmployee(int index) {
		System.out.println("\nNhan vien " + (index + 1));
		System.out.println("Ho ten: " + hoTen.get(index));
		System.out.println("Tuoi: " + tuoi.get(index));
		System.out.println("Gioi tinh: " + gioiTinh.get(index));
		System.out.println("Luong co ban: " + luongCoBan.get(index));
		System.out.println("Điem TB: " + diemTB.get(index));
	}
}

