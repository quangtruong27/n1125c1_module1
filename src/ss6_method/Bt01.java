package ss6_method;

/**
 * Bài tập chương câu lệnh điều kiện và rẽ nhánh
 *     a.    Viết phương thức đổi một ký tự hoa sang ký tự thường.
 *     b.    Viết phương thức giải phương trình bậc nhất.
 *     c.    Viết phương thức giải phương trình bậc hai.
 *     d.    Viết phương thức trả về giá trị nhỏ nhất của 4 số nguyên.
 */
public class Bt01 {
	public static void main(String[] args) {
		System.out.println(toLowerCase('C'));
		levelOne(2, 3);
		levelTwo(1, 3, 4);
		System.out.println(min(1, 2, 3, 4));
	}

	public static char toLowerCase(char c) {
		if (c >= 'A' && c <= 'Z') {
			return (char) +(c + 32);
		}
		return c;
	}

	public static void levelOne(double a, double b) {
		if (a == 0) {
			if (b == 0) {
				System.out.println("PT vo so nghiem");
			} else {
				System.out.println("PT vo nghiem");
			}
		} else {
			System.out.println("Nghiem la: " + (-b / a));
		}
	}

	public static void levelTwo(double a, double b, double c) {
		if (a == 0) {
			levelOne(b, c);
			return;
		}
		double delta = b * b - 4 * a * c;
		if (delta < 0) {
			System.out.println("PT vo nghiem");
		} else if (delta == 0) {
			System.out.println("Nghiem la: " + (-b / (2 * a)));
		} else {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("x1: " + x1 + " x2: " + x2);
		}
	}

	public static int min(int a, int b, int c, int d) {
		int min = a;
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		if (d < min) {
			min = d;
		}
		return min;
	}
}
