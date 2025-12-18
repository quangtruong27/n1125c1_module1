package check_module1;

import java.util.Scanner;

/**
 * Câu 4: Viết phương thức tìm các số nguyên tố với tham số truyền vào là mảng chứa các số nguyên.
 */
public class Cau4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap vao mang " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}

		int[] result = getPrime(arr);

		for (int x : result) {
			System.out.print(x + " ");
		}

	}
	public static boolean isPrime(int x) {
		if (x < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(x); i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static int[] getPrime(int[] arr) {

		int count = 0;
		for (int x : arr) {
			if (isPrime(x)) {
				count++;
			}
		}

		int[] result = new int[count];

		int index = 0;
		for (int x : arr) {
			if (isPrime(x)) {
				result[index] = x;
				index++;
			}
		}

		return result;
	}
}
