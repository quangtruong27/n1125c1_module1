package ss5_loop;

import java.util.Scanner;

/**
 * In dãy số 2, 4, -6, 8, 10, -12 … n (bằng ít nhất 2 cách khác nhau) (n là số nhập vào từ bàn phím)
 */

public class Bt04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập n: ");
		int n = sc.nextInt();

		//C1
//		for(int i = 2; i <= n; i += 2){
//			if (i % 6 == 0) {
//				System.out.println(-i);
//			}else{
//				System.out.println(i);
//			}
//		}

		//C2
		int distance = 3;
		int count = 0;

		for (int i = 2; i <= n; i += 2) {
			count = count + 1;
			if (count == distance) {
				System.out.println(-i);
				count = 0;
			} else {
				System.out.println(i);
			}
		}
	}
}
