package ss7_debug_string;

import java.util.Scanner;

/**
 * Cho 2 chuỗi (String) a và b nhập vào từ bàn phím. Hãy so sánh chuỗi nào lớn hơn. (quan trọng)
 */
public class Bt03 {

	public static String sosanh(String a, String b){
		if(a.compareTo(b)==0){
			return "Giong nhau";
		}else if(a.compareTo(b) < 0){
			return "a nho hon b";
		}else{
			return "a lon hon b";
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a: ");
		String a = sc.nextLine();
		System.out.print("Nhap b: ");
		String b = sc.nextLine();

		System.out.println(sosanh(a,b));
	}

}
