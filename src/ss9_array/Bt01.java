package ss9_array;

import util.Input;

import java.util.Scanner;

public class Bt01 {

	static Scanner sc = new Scanner(System.in);

	//1. Các thao tác nhập xuất
	//    a. Nhập mảng
	//    b. Xuất mảng
	public static void inputArray(int[] arr) {
		System.out.println("Cau 1: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]=", i);
			arr[i] = sc.nextInt();
		}
	}

	public static void outputArray(int[] arr) {
		for (int item : arr) {
			System.out.println(item);
		}
	}

	//2. Các thao tác kiểm tra
	//    a. Mảng có phải là mảng toàn chẵn?
	//    b. Mảng có phải là mảng toàn số nguyên tố?
	//    c. Mảng có phải là mảng tăng dần?
	public static boolean isAllEven(int[] arr) {
		System.out.println("Cau 2: ");
		for (int item : arr) {
			if (item % 2 != 0) {
				return false;
			}
		}
		return true;
	}

	// ktr so nguyen to
	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isAllPrime(int[] arr) {
		for (int item : arr) {
			if (!isPrime(item)) {
				return false;
			}
		}
		return true;
	}

	//c. Mảng có phải là mảng tăng dần?
	public static boolean isAscending(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}

	//3. Các thao tác tính toán
	//    a. Đếm số lượng phần tử lẻ có trong mảng a.
	//    b. Tính tổng số dương lẻ của mảng a.
	//    c. Có bao nhiêu số chia hết cho 4 nhưng không chia hết cho 5.
	//    d. Tổng các số nguyên tố có trong mảng.

	public static int countOddElement(int[] arr) {
		System.out.println("Cau 3: ");
		int count = 0;
		for (int item : arr) {
			if (item % 2 != 0) {
				count++;
			}
		}
		return count;
	}

	//    b. Tính tổng số dương lẻ của mảng a.
	public static int sumPositiveOdd(int[] arr) {
		int sum = 0;
		for (int item : arr) {
			if (item > 0 && item % 2 != 0) {
				sum += item;
			}
		}
		return sum;
	}

	//    c. Có bao nhiêu số chia hết cho 4 nhưng không chia hết cho 5.
	public static int countDivisibleBy4NotBy5(int[] arr) {
		int count = 0;
		for (int item : arr) {
			if (item % 4 == 0 && item % 5 != 0) {
				count++;
			}
		}
		return count;
	}

	//    d. Tổng các số nguyên tố có trong mảng.
	public static int sumPrime(int[] arr) {
		int sum = 0;
		for (int item : arr) {
			if (isPrime(item)) {
				sum += item;
			}
		}
		return sum;
	}

	//4. Các thao tác tìm kiếm
	//    a. Vị trí cuối cùng của phần tử x trong mảng.
	//    b. Vị trí số nguyên tố đầu tiên trong mảng nếu có.
	//    c. Tìm số dương nhỏ nhất trong mảng.
	//    d. Nhập vào phần tử k, tìm xem k có xuất hiện trong mảng a không. Nếu có chỉ ra các vị trí của k trong mảng. (*)
	//    e. Tìm giá trị lớn nhất và nhỏ nhất của mảng a.

	public static int lastIndex(int[] arr, int x) {
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

	//    b. Vị trí số nguyên tố đầu tiên trong mảng nếu có.
	public static int firstPrimeIndex(int[] arr){
		for(int i = 0; i < arr.length; i++){
			if(isPrime(arr[i])){
				return i;
			}
		}
		return -1;
	}

	//    c. Tìm số dương nhỏ nhất trong mảng.
	public static int findMinPositive(int[] arr){
		int min = Integer.MAX_VALUE;
		for(int item : arr){
			if(item > 0 && item < min){
				min = item;
			}
		}
		return min;
	}

	//    e. Tìm giá trị lớn nhất và nhỏ nhất của mảng a.
	public static int findMin(int[] arr){
		int min = arr[0];
		for(int item : arr){
			if(item < min){
				min = item;
			}
		}
		return min;
	}

	public static int findMax(int[] arr){
		int max = arr[0];
		for(int item : arr){
			if(item > max){
				max = item;
			}
		}
		return max;
	}

	public static void main(String[] args) {

		System.out.print("Nhap so luong phan tu: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		inputArray(arr);
		outputArray(arr);
		System.out.println(isAllEven(arr) ? "a. Mang toan chan" : "a. Mang khong chan");
		System.out.println((isAllPrime(arr) ? "b. Mang toan so nguyen to" : "b. Mang khoan toan so nguyen to"));
		System.out.println(isAscending(arr) ? "c. Mang tang dan" : "c. Mang khong tang dan");
		System.out.println("a. So luong phan tu le trong mang: " + countOddElement(arr));
		System.out.println("b. Tong so duong le cua mang: " + sumPositiveOdd(arr));
		System.out.println("c. So chia het cho 4 ma khong chia het cho 5: " + countDivisibleBy4NotBy5(arr));
		System.out.println("d. Cac so nguyen to co trong mang: " + sumPrime(arr));

		System.out.print("Nhap x: ");
		int x = sc.nextInt();
		System.out.println("a. Vi tri cuoi cung cua x: " + lastIndex(arr, x));
		System.out.println("b. Vi tri so dau tien trong mang: " + firstPrimeIndex(arr));
		System.out.println("c .So duong nho nhat trong mang: " + findMinPositive(arr));
		System.out.println("e. Vi tri nho nhat: " + findMin(arr));
		System.out.println(" Vi tri lon nhat: "+ findMax(arr));
	}
}
