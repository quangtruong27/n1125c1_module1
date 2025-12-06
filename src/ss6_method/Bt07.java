package ss6_method;

import java.util.Scanner;

public class Bt07 {

	static String hoTen1, hoTen2, hoTen3, hoTen4, hoTen5;
	static int tuoi1, tuoi2, tuoi3, tuoi4, tuoi5;
	static String gioiTinh1, gioiTinh2, gioiTinh3, gioiTinh4, gioiTinh5;
	static double luong1, luong2, luong3, luong4, luong5;
	static double diem1, diem2, diem3, diem4, diem5;

	static Scanner sc = new Scanner(System.in);

	public static void nhapNV1() {
		System.out.println("**NHAP THONG TIN NHAN VIEN 1**");

		System.out.print("Ho ten: ");
		hoTen1 = sc.nextLine();

		System.out.print("Tuoi: ");
		tuoi1 = sc.nextInt();
		sc.nextLine();

		System.out.print("Gioi tinh: ");
		gioiTinh1 = sc.nextLine();

		System.out.print("Luong co ban: ");
		luong1 = sc.nextDouble();

		System.out.print("Diem TB: ");
		diem1 = sc.nextDouble();
		sc.nextLine();
	}

	public static void nhapNV2() {
		System.out.println("**NHAP THONG TIN NHAN VIEN 2**");

		System.out.print("Ho ten: ");
		hoTen2 = sc.nextLine();

		System.out.print("Tuoi: ");
		tuoi2 = sc.nextInt();
		sc.nextLine();

		System.out.print("Gioi tinh: ");
		gioiTinh2 = sc.nextLine();

		System.out.print("Luong co ban: ");
		luong2 = sc.nextDouble();

		System.out.print("Diem TB: ");
		diem2 = sc.nextDouble();
		sc.nextLine();
	}

	public static void nhapNV3() {
		System.out.println("**NHAP THONG TIN NHAN VIEN 3**");
		System.out.print("Ho ten: ");
		hoTen3 = sc.nextLine();

		System.out.print("Tuoi: ");
		tuoi3 = sc.nextInt();
		sc.nextLine();

		System.out.print("Gioi tinh: ");
		gioiTinh3 = sc.nextLine();

		System.out.print("Luong co ban: ");
		luong3 = sc.nextDouble();

		System.out.print("Diem TB: ");
		diem3 = sc.nextDouble();
		sc.nextLine();
	}

	public static void nhapNV4() {
		System.out.println("=== Nhap thong tin NV4 ===");
		System.out.print("Ho ten: ");
		hoTen4 = sc.nextLine();

		System.out.print("Tuoi: ");
		tuoi4 = sc.nextInt();
		sc.nextLine();

		System.out.print("Gioi tinh: ");
		gioiTinh4 = sc.nextLine();

		System.out.print("Luong co ban: ");
		luong4 = sc.nextDouble();

		System.out.print("Diem TB: ");
		diem4 = sc.nextDouble();
		sc.nextLine();
	}

	public static void nhapNV5() {
		System.out.println("=== Nhap thong tin NV5 ===");
		System.out.print("Ho ten: ");
		hoTen5 = sc.nextLine();

		System.out.print("Tuoi: ");
		tuoi5 = sc.nextInt();
		sc.nextLine();

		System.out.print("Gioi tinh: ");
		gioiTinh5 = sc.nextLine();

		System.out.print("Luong co ban: ");
		luong5 = sc.nextDouble();

		System.out.print("Diem TB: ");
		diem5 = sc.nextDouble();
		sc.nextLine();
	}

	public static void inNV1() {
		System.out.println("NV1: " + hoTen1 + ", " + tuoi1 + ", " + gioiTinh1 + ", " + luong1 + ", " + diem1);
	}

	public static void inNV2() {
		System.out.println("NV2: " + hoTen2 + ", " + tuoi2 + ", " + gioiTinh2 + ", " + luong2 + ", " + diem2);
	}

	public static void inNV3() {
		System.out.println("NV3: " + hoTen3 + ", " + tuoi3 + ", " + gioiTinh3 + ", " + luong3 + ", " + diem3);
	}

	public static void inNV4() {
		System.out.println("NV4: " + hoTen4 + ", " + tuoi4 + ", " + gioiTinh4 + ", " + luong4 + ", " + diem4);
	}

	public static void inNV5() {
		System.out.println("NV5: " + hoTen5 + ", " + tuoi5 + ", " + gioiTinh5 + ", " + luong5 + ", " + diem5);
	}


	public static void main(String[] args) {
		System.out.print("Nhap so nhan vien (1-5): ");
		int n = sc.nextInt();
		sc.nextLine();

		switch (n) {
			case 1:
				nhapNV1();
				break;
			case 2:
				nhapNV2();
				break;
			case 3:
				nhapNV3();
				break;
			case 4:
				nhapNV4();
				break;
			case 5:
				nhapNV5();
				break;
			default:
				System.out.println("So nhan vien khong hop le!");
				return;
		}

		System.out.println("\n*** DANH SACH NHAN VIEN ***");
		switch (n) {
			case 1:
				inNV1();
				break;
			case 2:
				inNV2();
				break;
			case 3:
				inNV3();
				break;
			case 4:
				inNV4();
				break;
			case 5:
				inNV5();
				break;
		}

	}
}



