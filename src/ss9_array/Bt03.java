package ss9_array;

import java.util.Scanner;

/**
 * Dựa trên chương trình quản lý nhân viên ở bài trước, thực hiện các yêu cầu sau:
 * <p>
 * a. Tìm nhân viên có điểm trung bình cao nhất.
 * <p>
 * b. Tìm nhân viên theo họ tên (tìm chính xác).
 * <p>
 * c. Tìm nhân viên theo họ tên (tìm mềm - Gần chính xác)
 * <p>
 * Ví dụ: Khi nhập một phần của họ tên (ví dụ: "Hoàng"),
 * hệ thống sẽ xuất ra tất cả các nhân viên có chữ "Hoàng" xuất hiện trong họ tên của họ (ví dụ: "Nguyễn Văn Hoàng",
 * "Hoàng Văn Thái", ...).
 */

public class Bt03 {
	static Scanner sc = new Scanner(System.in);

	public static void inputEmployee(
			String[] hoTen,
			int[] tuoi,
			String[] gioiTinh,
			double[] luong,
			double[] diemTB,
			int index

	) {
		System.out.println("\n Nhap nhan vien thu " + (index + 1));

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

	public static void outputEmployee(
			String[] hoTen,
			int[] tuoi,
			String[] gioiTinh,
			double[] luong,
			double[] diemTB,
			int index
	) {
		System.out.println("\nNhan vien thu " + (index + 1));
		System.out.println("Ho ten: " + hoTen[index]);
		System.out.println("Tuoi: " + tuoi[index]);
		System.out.println("Gioi tinh: " + gioiTinh[index]);
		System.out.println("Luong co ban: " + luong[index]);
		System.out.println("Diem TB: " + diemTB[index]);
	}

	// a. Tìm nhân viên có điểm trung bình cao nhất.
	public static void findMaxDiemTB(
			String[] hoTen,
			int[] tuoi,
			String[] gioiTinh,
			double[] luong,
			double[] diemTB
	) {
		double max = diemTB[0];

		for (double d : diemTB) {
			if (d > max) {
				max = d;
			}
		}

		System.out.println("\nNhan vien co diem TB cao nhat: " + max);
		for (int i = 0; i < diemTB.length; i++) {
			if (diemTB[i] == max) {
				outputEmployee(hoTen, tuoi, gioiTinh, luong, diemTB, i);
			}
		}
	}

	// b. Tìm nhân viên theo họ tên (tìm chính xác).
	public static void findByNameExact(
			String[] hoTen,
			int[] tuoi,
			String[] gioiTinh,
			double[] luong,
			double[] diemTB,
			String name
	) {
		boolean tim = false;

		System.out.println("\nKet qua tim kiem (chinh xac)");
		for (int i = 0; i < hoTen.length; i++) {
			if (hoTen[i].equalsIgnoreCase(name)) {
				outputEmployee(hoTen, tuoi, gioiTinh, luong, diemTB, i);
				tim = true;
			}
		}

		if (!tim) {
			System.out.println("Khong tim thay nhan vien ten: " + name);
		}
	}

	// c. Tìm nhân viên theo họ tên (tìm mềm - Gần chính xác)
	public static void findByNameSoft(
			String[] hoTen,
			int[] tuoi,
			String[] gioiTinh,
			double[] luong,
			double[] diemTB,
			String keyword
	) {
		boolean tim = false;

		System.out.println("\nKet qua tim kiem (gan dung)");
		for (int i = 0; i < hoTen.length; i++) {
			if (hoTen[i].toLowerCase().contains(keyword)) {
				outputEmployee(hoTen, tuoi, gioiTinh, luong, diemTB, i);
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


		String[] hoTen = new String[n];
		int[] tuoi = new int[n];
		String[] gioiTinh = new String[n];
		double[] luong = new double[n];
		double[] diemTB = new double[n];

		// Nhap
		for (int i = 0; i < n; i++) {
			inputEmployee(hoTen, tuoi, gioiTinh, luong, diemTB, i);
		}

		// Xuat
		System.out.println("\nDANH SACH NHAN VIEN");
		for (int i = 0; i < n; i++) {
			outputEmployee(hoTen, tuoi, gioiTinh, luong, diemTB, i);
		}


		findMaxDiemTB(hoTen, tuoi, gioiTinh, luong, diemTB);

		System.out.print("\nNhap nhanv vien (chinh xac): ");
		String nameExact = sc.nextLine();
		findByNameExact(hoTen, tuoi, gioiTinh, luong, diemTB, nameExact);

		System.out.print("\nNhap nhan vien (gan chinh xac: ");
		String keyword = sc.nextLine();
		findByNameSoft(hoTen, tuoi, gioiTinh, luong, diemTB, keyword);
	}
}

