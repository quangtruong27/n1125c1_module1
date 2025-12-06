package ss6_method;

import java.util.Scanner;

/**
 * Viết chương trình nhập thông tin của một nhân viên trong công ty.
 * Thông tin cần nhập vào bao gồm: họ tên, tuổi, giới tính, mức lương cơ bản, điểm trung bình tốt nghiệp đại học
 * (theo thang điểm 10). Sau khi nhập xong thì in thông tin đã nhập ra.
 */
public class Bt06 {
	static String hoTen;
	static int tuoi;
	static String gioiTinh;
	static double luongCoBan;
	static double diemTB;

	public static void nhapThongTin() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap Ho va Ten: ");
		hoTen = sc.nextLine();

		System.out.print("Nhap Tuoi: ");
		tuoi = sc.nextInt();
		sc.nextLine();

		System.out.print("Nhap Gioi tinh: ");
		gioiTinh = sc.nextLine();

		System.out.print("Nhap Luong Co Ban: ");
		luongCoBan = sc.nextDouble();

		System.out.print("Nhap Diem TB: ");
		diemTB = sc.nextDouble();

	}
	public static void inThongTin(){
		System.out.println("Ho va Ten: " + hoTen);
		System.out.println("Tuoi: " + tuoi);
		System.out.println("Gioi tinh: " + gioiTinh);
		System.out.println("Luong Co Ban: " + luongCoBan);
		System.out.println("Diem TB: " + diemTB);

	}

	public static void main(String[] args) {
		nhapThongTin();
		inThongTin();
	}
}
