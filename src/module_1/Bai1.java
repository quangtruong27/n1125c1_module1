package module_1;
// Tính tuổi của một người

import java.time.Year;
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập năm sinh: ");
		int namSinh = sc.nextInt();
		// C1
//		int nam = 2023;
//		int tuoi = nam - namSinh;
		//C2
		int nam = Year.now().getValue();
		int tuoi = nam - namSinh;
		System.out.println("Tuổi là: " + tuoi);

	}
}