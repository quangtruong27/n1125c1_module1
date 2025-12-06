package ss6_method;

import java.util.Scanner;

/**
 * Phương thức in ra n phần tử của dãy Fibonacy.
 */
public class Bt05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		do{
			System.out.print("Nhap n: ");
			n = sc.nextInt();
			if(n < 0){
				System.out.println("Phai nhap so nguyen duong");
			}
		}while(n < 0);

		fibonacci(n);
	}

	public static void fibonacci(int n){
		int f1 = 0;
		int f2 = 1;
		int fn = 1;

		while(fn < n){
			System.out.println(fn);
			f1 = f2;
			f2 = fn;
			fn = f1 + f2;
		}

	}
}
