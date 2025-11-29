package bt;

import java.util.Scanner;

public class bt09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap ky tu: ");
		char ch = sc.next().charAt(0);

		if(!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))){
			System.out.print("Nhap sai ki tu");
		} else if (ch >= 'a' && ch <= 'z') {
			ch = (char)(ch - 32);
			System.out.print("Ky tu sau khi doi: " + ch);
		}else{
			ch = (char)(ch + 32);
			System.out.print("Ky tu sau khi doi: " + ch);
		}

	}


}
