package bt;

import java.util.Scanner;

public class bt02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so tu 1 - 10: ");
		int n = sc.nextInt();

//		switch (n){
//			case 1:
//				System.out.println("One");
//				break;
//			case 2:
//				System.out.println("Two");
//				break;
//			case 3:
//				System.out.println("Three");
//				break;
//			case 4:
//				System.out.println("Four");
//				break;
//			case 5:
//				System.out.println("Five");
//				break;
//			case 6:
//				System.out.println("Six");
//				break;
//			case 7:
//				System.out.println("Seven");
//				break;
//			case 8:
//				System.out.println("Eight");
//				break;
//			case 9:
//				System.out.println("Nine");
//				break;
//			case 10:
//				System.out.println("Then");
//				break;
//			default:
//				System.out.println("Khong co");
//		}

		if (n < 1 || n > 10) {
			System.out.println("Phai nhap tu 1 - 10");
		}else if(n == 1){
			System.out.println("One");
		}else if(n == 2){
			System.out.println("Two");
		}else if(n == 3){
			System.out.println("Three");
		}else if(n == 4){
			System.out.println("Four");
		}else if(n == 5){
			System.out.println("Five");
		}else if(n == 6){
			System.out.println("Six");
		}else if(n == 7){
			System.out.println("Serven");
		}else if(n == 8){
			System.out.println("Eight");
		}else if(n == 9){
			System.out.println("Nine");
		}else{
			System.out.println("Then");
		}
	}
}
