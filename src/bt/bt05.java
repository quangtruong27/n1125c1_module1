package bt;

public class bt05 {
	public static void main(String[] args) {
		double a = 3;
		double b = 2;

		if (a == 0) {
			if (b == 0) {
				System.out.println("PT vo so nghiem");
			} else {
				System.out.println("Vo nghiem");
			}
		} else {
			double x = -b / a;
			System.out.println("Nghiem cua x: " + x);
		}
	}
}
