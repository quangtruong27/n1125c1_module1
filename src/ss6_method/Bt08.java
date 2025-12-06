package ss6_method;

import java.util.Scanner;

public class Bt08 {

	static String ten1, ten2, ten3, ten4, ten5;
	static int tuoi1, tuoi2, tuoi3, tuoi4, tuoi5;
	static String gioiTinh1, gioiTinh2, gioiTinh3, gioiTinh4, gioiTinh5;
	static double luong1, luong2, luong3, luong4, luong5;
	static String diaChi1, diaChi2, diaChi3, diaChi4, diaChi5;

	static Scanner sc = new Scanner(System.in);

	public static void nhapNV1() {

		System.out.println("=== Nhap nhan vien 1 ===");
		System.out.print("Ten: ");
		ten1 = sc.nextLine();
		System.out.print("Tuoi: ");
		tuoi1 = sc.nextInt();
		sc.nextLine();
		System.out.print("Gioi tinh: ");
		gioiTinh1 = sc.nextLine();
		System.out.print("Luong: ");
		luong1 = sc.nextDouble();
		sc.nextLine();
		System.out.print("Dia chi: ");
		diaChi1 = sc.nextLine();
	}

	public static void nhapNV2() {

		System.out.println("=== Nhap nhan vien 2 ===");
		System.out.print("Ten: ");
		ten2 = sc.nextLine();
		System.out.print("Tuoi: ");
		tuoi2 = sc.nextInt();
		sc.nextLine();
		System.out.print("Gioi tinh: ");
		gioiTinh2 = sc.nextLine();
		System.out.print("Luong: ");
		luong2 = sc.nextDouble();
		sc.nextLine();
		System.out.print("Dia chi: ");
		diaChi2 = sc.nextLine();
	}

	public static void nhapNV3() {

		System.out.println("=== Nhap nhan vien 3 ===");
		System.out.print("Ten: ");
		ten3 = sc.nextLine();
		System.out.print("Tuoi: ");
		tuoi3 = sc.nextInt();
		sc.nextLine();
		System.out.print("Gioi tinh: ");
		gioiTinh3 = sc.nextLine();
		System.out.print("Luong: ");
		luong3 = sc.nextDouble();
		sc.nextLine();
		System.out.print("Dia chi: ");
		diaChi3 = sc.nextLine();
	}

	public static void nhapNV4() {

		System.out.println("=== Nhap nhan vien 4 ===");
		System.out.print("Ten: ");
		ten4 = sc.nextLine();
		System.out.print("Tuoi: ");
		tuoi4 = sc.nextInt();
		sc.nextLine();
		System.out.print("Gioi tinh: ");
		gioiTinh4 = sc.nextLine();
		System.out.print("Luong: ");
		luong4 = sc.nextDouble();
		sc.nextLine();
		System.out.print("Dia chi: ");
		diaChi4 = sc.nextLine();
	}

	public static void nhapNV5() {

		System.out.println("=== Nhap nhan vien 5 ===");
		System.out.print("Ten: ");
		ten5 = sc.nextLine();
		System.out.print("Tuoi: ");
		tuoi5 = sc.nextInt();
		sc.nextLine();
		System.out.print("Gioi tinh: ");
		gioiTinh5 = sc.nextLine();
		System.out.print("Luong: ");
		luong5 = sc.nextDouble();
		sc.nextLine();
		System.out.print("Dia chi: ");
		diaChi5 = sc.nextLine();
	}

	public static void inNV1() {
		System.out.println("\n--- Nhan vien 1 ---");
		System.out.println("Ten: " + ten1);
		System.out.println("Tuoi: " + tuoi1);
		System.out.println("Gioi tinh: " + gioiTinh1);
		System.out.println("Luong: " + luong1);
		System.out.println("Dia chi: " + diaChi1);
	}

	public static void inNV2() {
		System.out.println("\n--- Nhan vien 2 ---");
		System.out.println("Ten: " + ten2);
		System.out.println("Tuoi: " + tuoi2);
		System.out.println("Gioi tinh: " + gioiTinh2);
		System.out.println("Luong: " + luong2);
		System.out.println("Dia chi: " + diaChi2);
	}

	public static void inNV3() {
		System.out.println("\n--- Nhan vien 3 ---");
		System.out.println("Ten: " + ten3);
		System.out.println("Tuoi: " + tuoi3);
		System.out.println("Gioi tinh: " + gioiTinh3);
		System.out.println("Luong: " + luong3);
		System.out.println("Dia chi: " + diaChi3);
	}

	public static void inNV4() {
		System.out.println("\n--- Nhan vien 4 ---");
		System.out.println("Ten: " + ten4);
		System.out.println("Tuoi: " + tuoi4);
		System.out.println("Gioi tinh: " + gioiTinh4);
		System.out.println("Luong: " + luong4);
		System.out.println("Dia chi: " + diaChi4);
	}

	public static void inNV5() {
		System.out.println("\n--- Nhan vien 5 ---");
		System.out.println("Ten: " + ten5);
		System.out.println("Tuoi: " + tuoi5);
		System.out.println("Gioi tinh: " + gioiTinh5);
		System.out.println("Luong: " + luong5);
		System.out.println("Dia chi: " + diaChi5);
	}

	public static void main(String[] args) {


		nhapNV1();
		System.out.print("Ban co muon nhap tiep khong (Yes/No)? ");
		String a = sc.nextLine();

		if (a.equalsIgnoreCase("Yes")) {
			nhapNV2();
			System.out.print("Ban co muon nhap tiep khong (Yes/No)? ");
			a = sc.nextLine();

			if (a.equalsIgnoreCase("Yes")) {
				nhapNV3();
				System.out.print("Ban co muon nhap tiep khong (Yes/No)? ");
				a = sc.nextLine();

				if (a.equalsIgnoreCase("Yes")) {
					nhapNV4();
					System.out.print("Ban co muon nhap tiep khong (Yes/No)? ");
					a = sc.nextLine();

					if (a.equalsIgnoreCase("Yes")) {
						nhapNV5();
					}
				}
			}
		}

		System.out.println("\n===== DANH SACH NHAN VIEN =====");
		inNV1();
		if (ten2 != null) inNV2();
		if (ten3 != null) inNV3();
		if (ten4 != null) inNV4();
		if (ten5 != null) inNV5();
	}
}


