package check_module1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Tìm số lớn nhì trong mảng
 */
public class Cau5 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("Nhap n: ");
		int n = sc.nextInt();
		input(al, n);

		int error = findSecondMax(al);

		if (error == -1) {
			System.out.println("Khong co so lon nhi");
		} else {
			System.out.println("Gia tri lon nhi: " + error);
		}

	}

	public static void input(ArrayList<Integer> al, int n) {
		for (int i = 0; i < n; i++) {
			System.out.printf("Nhao mang thu [%d]: ", i);
			al.add((sc.nextInt()));
		}
	}

	public static int findSecondMax(ArrayList<Integer> al) {
		al.sort(Collections.reverseOrder());
		int max = al.getFirst();
		//int second = -1;
		for (int item : al) {
			if (item < max) {
				return item;
			}
		}
		return -1;
	}

}
