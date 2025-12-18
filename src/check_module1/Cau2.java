package check_module1;

import java.util.Scanner;

/**
 * Câu 2: Nhập từ bàn phím mảng số nguyên gồm n phần tử (n<=20).
 * Hiển thị ra màn hình hiệu của Tổng các số chẵn và Tổng các số lẻ có trong mảng.
 * Ví dụ: [1,2,3,4,5,6]. Kết quả sau khi thực hiện là: (2+4+6) - (1+3+5) = 3
 */
public class Cau2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap n: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap mang thu " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}

		int chan = 0;
		int le = 0;

		for (int item : arr) {
			if( item % 2 == 0) {
				chan += item;
			}else{
				le += item;
			}
		}
		System.out.println("Ket qua: " + (chan - le));
	}
}
