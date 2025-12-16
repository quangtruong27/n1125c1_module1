package ss11_array2d;

import java.util.Scanner;

public class Bt {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Nhap kich thuoc n: ");
		int n = sc.nextInt();

		int[][] A = new int[n][n];


		inout(A, n);
		System.out.println("Ma tran vua nhap:");
		output(A, n);


		System.out.println("b. Tich cac so boi so cua 3 tren dong dau: " + multiple3(A, n));


		int[] X = createArr(A, n);
		System.out.println("c. Mang X (gia tri lon nhat tung dong):");
		for (int x : X) System.out.print(x + " ");


		System.out.println("d. Tong cac so boi so cua 5 tren hang cuoi: " + multiple5(A, n));


		System.out.println("e. So lon nhat tren duong cheo chinh: " + max(A, n));


		System.out.println("f. So nho nhat tren duong cheo phu: " + min(A, n));


		System.out.println("g. So luong so nguyen to trong ma tran: " + countIsPrime(A, n));


		System.out.print("Nhap 2 dong muon hoan doi: ");
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		swapLine(A, n, d1, d2);
		System.out.println("Ma tran sau khi hoan doi dong:");
		output(A, n);


		System.out.print("Nhap 2 cot muon hoan doi (c1 c2): ");
		int c1 = sc.nextInt();
		int c2 = sc.nextInt();
		swapColumn(A, n, c1, c2);
		System.out.println("Ma tran sau khi hoan doi cot:");
		output(A, n);
	}

	// a. Nhập ma trận
	public static void inout(int[][] A, int n) {
		System.out.println("Nhap ma tran:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("A[" + i + "][" + j + "] = ");
				A[i][j] = sc.nextInt();
			}
		}
	}

	// a. Xuất ma trận
	public static void output(int[][] A, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println();
		}
	}

	//b. Tính tích các số là bội số của 3 nằm trên dòng đầu tiên của ma trận.
	public static int multiple3(int[][] A, int n) {
		int tich = 1;
		for (int j = 0; j < n; j++) {
			if (A[0][j] % 3 == 0) tich *= A[0][j];
		}
		return tich;
	}

	//c. Tạo ra mảng một chiều X với X[i] là các giá trị lớn nhất trên từng dòng i của ma trận A. In X ra.
	public static int[] createArr(int[][] A, int n) {
		int[] X = new int[n];
		for (int i = 0; i < n; i++) {
			int max = A[i][0];
			for (int j = 1; j < n; j++) {
				if (A[i][j] > max) max = A[i][j];
			}
			X[i] = max;
		}
		return X;
	}

	//   d. Tính tổng các số là bội số của 5 nằm trên hàng cuối cùng của ma trận.
	public static int multiple5(int[][] A, int n) {
		int tong = 0;
		for (int j = 0; j < n; j++) {
			if (A[n - 1][j] % 5 == 0) tong += A[n - 1][j];
		}
		return tong;
	}

	// e. Tìm số lớn nhất trên đường chéo chính của ma trận.
	public static int max(int[][] A, int n) {
		int max = A[0][0];
		for (int i = 1; i < n; i++) {
			if (A[i][i] > max) max = A[i][i];
		}
		return max;
	}

	// f. Tìm số nhỏ nhất trên đường chéo phụ của ma trận.
	public static int min(int[][] A, int n) {
		int min = A[0][n - 1];
		for (int i = 1; i < n; i++) {
			if (A[i][n - 1 - i] < min) min = A[i][n - 1 - i];
		}
		return min;
	}

	// g. Đếm số lượng số nguyên tố trong ma trận.
	public static int countIsPrime(int[][] A, int n) {
		int dem = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (isPrime(A[i][j])) dem++;
			}
		}
		return dem;
	}

	public static boolean isPrime(int x) {
		if (x < 2) return false;
		for (int i = 2; i <= Math.sqrt(x); i++) {
			if (x % i == 0) return false;
		}
		return true;
	}

	// h. Hoán đổi 2 dòng của ma trận
	public static void swapLine(int[][] A, int n, int d1, int d2) {
		for (int j = 0; j < n; j++) {
			int temp = A[d1][j];
			A[d1][j] = A[d2][j];
			A[d2][j] = temp;
		}
	}

	//   i. Hoán đổi 2 cột của ma trận
	public static void swapColumn(int[][] A, int n, int c1, int c2) {
		for (int i = 0; i < n; i++) {
			int temp = A[i][c1];
			A[i][c1] = A[i][c2];
			A[i][c2] = temp;
		}
	}
}
