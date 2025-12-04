package ss5_loop;

public class Bt23 {
	public static void main(String[] args) {

		for (int i = 10; i <= 99; i++) {

			int hangDonVi = i % 10; //du
			int hangChuc = i / 10; //nguyen

			int tong = hangChuc + hangDonVi;
			int tich = hangChuc * hangDonVi;

			if (tich == 2 * tong) {
				System.out.println(i);
			}
		}
	}
}
