package bt;

public class bt03 {
	public static void main(String[] args) {
		int a = 3;
		int b = 2;

		//C1
//		int temp = a;
//		a = b;
//		b = temp;

		//C2
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Sau khi dao");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
}
