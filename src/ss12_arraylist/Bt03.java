package ss12_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bt03 {
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


		System.out.println(" a. Tìm nhân viên có điểm trung bình cao nhất, cao nhì.");
		pointMaxSecond();

		System.out.println("b. Tìm nhân viên theo họ tên.");
		System.out.print("Nhap ten can tim: ");
		String keyword = sc.nextLine();
		searchName(keyword);

		System.out.println("c. Sắp xếp nhân viên theo độ tuổi tăng dần.");
		interchangeSort();

		System.out.println("\nDANH SACH SAU KHI SAP XEP:");
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

		System.out.print("Diem TB: ");
		diemTB.add(sc.nextDouble());
		sc.nextLine();
	}

	public static void outputEmployee(int index) {
		System.out.println("\nNhan vien " + (index + 1));
		System.out.println("Ho ten: " + hoTen.get(index));
		System.out.println("Tuoi: " + tuoi.get(index));
		System.out.println("Gioi tinh: " + gioiTinh.get(index));
		System.out.println("Luong co ban: " + luongCoBan.get(index));
		System.out.println("Diem TB: " + diemTB.get(index));
	}

	// a. Tìm nhân viên có điểm trung bình cao nhất, cao nhì.

	public static void pointMaxSecond() {

		ArrayList<Double> cloneDiemTrungBinh = new ArrayList<>(diemTB);
		cloneDiemTrungBinh.sort(Collections.reverseOrder());

		double max1 = cloneDiemTrungBinh.get(0);
		double max2 = -1;

		for (double item : cloneDiemTrungBinh) {
			if (item < max1) {
				max2 = item;
				break;
			}
		}

		System.out.println("\nNhan vien diem cao nhat:");
		for (int i = 0; i < diemTB.size(); i++) {
			if (diemTB.get(i) == max1) {
				outputEmployee(i);
			}
		}

		System.out.println("\nNhan vien diem cao nhi:");
		for (int i = 0; i < diemTB.size(); i++) {
			if (diemTB.get(i) == max2) {
				outputEmployee(i);
			}
		}
	}

	//b. Tìm nhân viên theo họ tên.

	public static void searchName(String keyword) {
		keyword = keyword.toLowerCase();
		boolean found = false;

		for (int i = 0; i < hoTen.size(); i++) {
			if (hoTen.get(i).toLowerCase().contains(keyword)) {
				outputEmployee(i);
				found = true;
			}
		}

		if (!found) {
			System.out.println("Khong tim thay nhan vien nao!");
		}
	}

	//c. Sắp xếp nhân viên theo độ tuổi tăng dần.

	public static void interchangeSort() {

		for (int i = 0; i < tuoi.size() - 1; i++) {
			for (int j = i + 1; j < tuoi.size(); j++) {

				if (tuoi.get(i) > tuoi.get(j)) {

					// doi tuoi
					int tempTuoi = tuoi.get(i);
					tuoi.set(i, tuoi.get(j));
					tuoi.set(j, tempTuoi);

					// doi ten
					String tempTen = hoTen.get(i);
					hoTen.set(i, hoTen.get(j));
					hoTen.set(j, tempTen);

					// doi gioi tinh
					String tempGT = gioiTinh.get(i);
					gioiTinh.set(i, gioiTinh.get(j));
					gioiTinh.set(j, tempGT);

					//doi luong
					double tempLuong = luongCoBan.get(i);
					luongCoBan.set(i, luongCoBan.get(j));
					luongCoBan.set(j, tempLuong);

					// doi diem
					double tempDiem = diemTB.get(i);
					diemTB.set(i, diemTB.get(j));
					diemTB.set(j, tempDiem);
				}
			}
		}
	}
}