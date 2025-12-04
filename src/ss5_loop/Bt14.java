package ss5_loop;

/**
 * In hình * sau đây: (chiều dài các cạnh là không cố định)
 */
public class Bt14 {
	public static void main(String[] args) {
		int row = 6;
		int column = 6;

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if (i == 1 || i == row || j == 1 || j == column) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
