package ss5_loop;

import java.util.Scanner;

/**
 * Nhập vào 2 số nguyên dương a & b với điều kiện là b > a.
 * Hãy thực hiện đếm và tính tổng trong đoạn[a, b] có bao nhiêu số đối xứng, chính phương, nguyên tố
 */
public class Bt22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b;

		do {
			System.out.print("Nhap a: ");
			a = sc.nextInt();
			System.out.print("Nhap b: ");
			b = sc.nextInt();

			if (b <= a) {
				System.out.println("Loi b > a");
			}
		} while (b <= a);

			int countPalindrome = 0, sumPalindrome = 0,
					countSquare = 0, sumSquare = 0,
					countPrime = 0, sumPrime = 0;

			for (int i = a; i <= b; i++) {
				//doi xung
				String s = String.valueOf(i);
				boolean isPalindrome = true;

				for (int j = 0; j < s.length() / 2; j++) {
					if (s.charAt(j) != s.charAt(s.length() - 1 - j)) {
						isPalindrome = false;
						break;
					}
				}
				if (isPalindrome) {
					countPalindrome++;
					sumPalindrome += i;
				}

				//so chinh phuong
				int x = (int) Math.sqrt(i);
				if (x * x == i) {
					countSquare++;
					sumSquare += i;
				}

				//so nguyen to
				boolean isPrime = true;
				if (i < 2) {
					isPrime = false;
				} else {
					for (int j = 2; j <= Math.sqrt(i); j++) {  //C2
						if (i % j == 0) {
							isPrime = false;
							break;
						}
					}
				}
				if (isPrime) {
					countPrime++;
					sumPrime += i;
				}
			}
			System.out.println("So doi xung: " + countPalindrome + ", Tong: " + sumPalindrome);
			System.out.println("So chinh phuong: " + countSquare + ", Tong: " + sumSquare);
			System.out.println("So nguyen to: " + countPrime + ", Tong: " + sumPrime);
	}
}
