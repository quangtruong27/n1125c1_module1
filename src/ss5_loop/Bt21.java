package ss5_loop;

import java.util.Scanner;

/**
 * Nhập một số nguyên dương n (n > 0).  Hãy cho biết:
 * a. Có phải là số đối xứng? Ví dụ: 121, 12021, …
 * b. Có phải là số nguyên tố? Ví dụ: 2, 3, 5, 7, 11, 13, …
 * c. Các chữ số có tăng dần không? Ví dụ: 2345, 367, 59, 123, …
 */
public class Bt21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap n: ");
		int n = sc.nextInt();

		String a = String.valueOf(n);
		boolean isPalindrome = true;

		// cau a
		System.out.println("Cau a:");
		for (int i = 0; i < a.length() / 2; i++) {
			if (a.charAt(i) != a.charAt(a.length() - 1 - i)) {
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome) {
			System.out.println(n + " la so doi xung");
		} else {
			System.out.println(n + " khong phai so doi xung");
		}

		//Cau b
		boolean isPrime = true;
		System.out.println("Cau b:");
		if (n < 2) {
			isPrime = false;
		} else {
//			for (int i = 2; i <= n - 1; i++) {		 	// C1
			for	(int i = 2; i <= Math.sqrt(n); i ++){  //C2
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		if(isPrime) {
			System.out.print(n + " la so nguyen to");
		}else{
			System.out.println(n + " khong phai so nguyen to");
		}

		//Cau c
		System.out.println("Cau c:");
		boolean isIncreasing = true;

		for(int i = 0; i < a.length() - 2; i++){
			if (a.charAt(i) >= a.charAt(i + 1)) {
				isIncreasing = false;
				break;
			}
		}
		if(isIncreasing) {
			System.out.print("So tang dan");
		}else{
			System.out.print("So giam dan");
		}
	}
}
