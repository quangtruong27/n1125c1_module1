package ss6_method;

import java.util.Scanner;

/**
 * Bài tập chương Câu lệnh lặp. Phương thức nhận vào một số nguyên dương n và thực hiện:
 * a.    S = 1 + 2 + … + n
 * b.    S = 1^2 + 2^2 + … + n^2
 * c.    S = 1 + 1/2 + … + 1/n
 * d.    S = 1 * 2 * … * n
 * e.    S = 1! + 2! + … + n!
 */
public class Bt03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = sc.nextInt();

		System.out.println("Tong: " + sum(n));
		System.out.println("Tong binh phuong: " + sum2(n));
		System.out.println("Tong nghich dao: " + sum3(n));
		System.out.println("Tong tich: " + sum4(n));
		System.out.println("Tong giai thua: " + sum5(n));
	}

	//a.    S = 1 + 2 + … + n
	public static  int sum (int n) {
		int s = 0;
		for ( int i = 1; i <= n; i++){
			s += i;
		}
		return s;
	}
	// b.    S = 1^2 + 2^2 + … + n^2
	public static int sum2(int n) {
		int s = 0;
		for ( int i = 1; i <= n; i++){
			s += i * i;
		}
		return s;
	}

	// c.    S = 1 + 1/2 + … + 1/n
	public static double sum3(int n) {
		double s = 0;
		for ( int i = 1; i <= n; i++){
			s += 1.0 / i;
		}
		return s;
	}
	//d.    S = 1 * 2 * … * n
	public static int sum4(int n){
		int s = 1;
		for ( int i = 1; i <= n; i++){
			s *= i;
		}
		return s;
	}
	//e.    S = 1! + 2! + … + n!
	public static double sum5(int n){
		double s = 0;
		double a = 1;
		for ( int i = 1; i <= n; i++){
			a *= i;
			s += a;
		}
		return s;
	}
}
