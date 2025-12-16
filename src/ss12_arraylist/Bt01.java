package ss12_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bt01 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		System.out.print("Nhap n: ");
		int n = sc.nextInt();

		System.out.println("a: ");
		input(a, n);

		System.out.println("b: ");
		output(a);

		System.out.println("c: " + countoddElement(a));

		System.out.println("d: " + sumPositiveOdd(a));

		System.out.println("e: ");
		System.out.print("Nhap k: ");
		int k = sc.nextInt();
		System.out.println("K tai vi tri: " + findK(a, k));

		interchangeSort(a);
		System.out.println("f: " + a);

		reverseSort(a);
		System.out.println("g: " + a);

		System.out.println("h:");
		System.out.println("Nhap x: ");
		int x = sc.nextInt();
		deleteElement(a, x);
		System.out.println("Sau khi xoa x: " + a);

		System.out.println("i: ");
		System.out.print("Nhap value: ");
		int value = sc.nextInt();
		System.out.print("Nhap index: ");
		int index = sc.nextInt();
		insertElement(a, index, value);
		System.out.println("Sau khi chen: " + a);

		System.out.println("j:");
		System.out.println("Max: " + max(a));
		System.out.println("Min: " + min(a));

		System.out.println("i. Gia tri lon nhi: " + findSecondMax(a));
	}

	//a. Nhập một Arraylist tên gọi là a gồm n phần tử kiểu nguyên int.

	public static void input(ArrayList<Integer> a, int n) {
		for (int i = 0; i < n; i++) {
			System.out.printf("Nhap mang thu [%d]: ", i);
			a.add(sc.nextInt());
		}
	}

	//  b. In giá trị của các phần tử a.
	public static void output(ArrayList<Integer> a) {
		System.out.println("Danh sach cac phan tu: " + a);
	}

	//c. Đếm số lượng phần tử lẻ trong arraylist a.
	public static int countoddElement(ArrayList<Integer> a) {
		int count = 0;
		for (int item : a) {
			if (item % 2 != 0) {
				count++;
			}
		}
		return count;
	}

	//  d. Tính tổng số dương lẻ của a.
	public static int sumPositiveOdd(ArrayList<Integer> a) {
		int sum = 0;
		for (int item : a) {
			if (item > 0 && item % 2 != 0) {
				sum += item;
			}
		}
		return sum;
	}

	// e. Nhập vào phần tử k, tìm xem k có xuất hiện trong a không.
	// Nếu có chỉ ra các vị trí của k trong arraylist.
	public static ArrayList<Integer> findK(ArrayList<Integer> a, int k) {
		ArrayList<Integer> KIndex = new ArrayList<>();
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) == k) {
				KIndex.add(i);
			}
		}
		return KIndex;
	}

	// f. Sắp sếp a theo thứ tự tăng dần.
	// => Gợi ý: Sử dụng Collection sort để xử lý.
	public static void interchangeSort(ArrayList<Integer> a) {
		Collections.sort(a);
	}

	//  g. Đảo ngược thứ tự các phần tử của a.
	//  => Gợi ý: Sử dụng Collections reverse để xử lý.
	public static void reverseSort(ArrayList<Integer> a) {
		Collections.reverse(a);
	}

	// h. Xóa các phần tử trong a có giá trị x được nhập vào từ bàn phím.
	public static void deleteElement(ArrayList<Integer> a, int x) {
		a.removeIf(value -> value == x);
	}

	// i. Chèn 1 phần tử value vào ví trí index bất kỳ (xóa bớt phần tử cuối cùng).
	public static void insertElement(ArrayList<Integer> a, int value, int index) {
		if(index >= 0 && index < a.size()) {
			a.add(index, value);
			a.remove(a.size() - 1);
		}else{
			System.out.println("Khong hop le");
		}
	}

	//  j. Tìm giá trị lớn nhất và nhỏ nhất của a
	public static int max(ArrayList<Integer> a) {
		return Collections.max(a);
	}
	public static int min(ArrayList<Integer> a) {
		return Collections.min(a);
	}

	//    k. Tìm giá trị lớn nhì của a.
	public static int findSecondMax(ArrayList<Integer> a) {
		a.sort(Collections.reverseOrder());
		int max = a.get(0);
		int second = -1;
		for(int item : a){
			if(item < max){
				return item;
			}
		}
		return -1;
	}
}

