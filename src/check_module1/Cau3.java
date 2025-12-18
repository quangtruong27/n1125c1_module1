package check_module1;

import java.util.Scanner;

/**
 * Câu 3: Viết phương thức có tham số truyền vào là một chuỗi các ký tự. Phương thức thực hiện đếm số lượng ký tự in hoa trong chuỗi.
 * -Nếu chuỗi có ký tự in hoa phương thức trả về số lượng ký tự in hoa có trong chuỗi.
 * -Nếu Chuỗi không chứa các ký tự hoa thì phương thức sẽ trả về thông báo "Chuỗi không chứa ký tự in hoa"
 */
public class Cau3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao chuoi ki tu: ");
		String s = sc.nextLine();

		System.out.println("So ki tu in hoa:" + cau3(s));

	}

	public static String cau3(String s) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				count++;
			}
		}

		if (count == 0) {
			return "khong co chu in hoa";
		}
		return String.valueOf(count);
	}


}
