package ss10_array2;

public class Bt01 {

	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int[] tachSoNguyenTo(int[] a) {
		int count = 0;
		for (int x : a) {
			if (isPrime(x)) {
				count++;
			}
		}

		int[] b = new int[count];
		int add = 0;
		for (int x : a) {
			if (isPrime(x)) {
				b[add++] = x;
			}
		}

		return b;
	}


}