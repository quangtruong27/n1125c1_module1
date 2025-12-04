package ss5_loop;

public class Bt17 {
	public static void main(String[] args) {
		int n = 6;

		System.out.println("Hinh a");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i == 1 || i == n || j == i) {
					System.out.print(" *");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("Hinh b");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i == 1 || i == n || j == n - i + 1) {
					System.out.print(" *");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
