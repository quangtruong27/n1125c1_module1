//Tìm giá trị của biến a, i, j

public class Bai7 {
	public static void main(String[] args) {
		//a
		int i = 1; int j = 1;
		int a = i++ + j++;

		System.out.print("a/" + "\n" + "i = " + i + "\n" +
							"j = " + j + "\n" +
							"a = " + a + "\n");

		//b
//		int i = 1; int j = 1;
//		int a = i++ + ++j;
//
//		System.out.print("b/" + "\n" + "i = " + i + "\n" +
//				"j = " + j + "\n" +
//				"a = " + a + "\n");
//
//		//c
//		int i = 1; int j = 1;
//		int a = ++i + j++;
//
//		System.out.print("c/" + "\n" + "i = " + i + "\n" +
//				"j = " + j + "\n" +
//				"a = " + a + "\n");

		//d
//		int i = 1; int j = 1;
//		int a = ++i + ++j;
//		System.out.print("c/" + "\n" + "i = " + i + "\n" +
//				"j = " + j + "\n" +
//				"a = " + a + "\n");

//		//e
//		int i = 1; int j = 1;
//		int a = i++ + j++ + i++ + j++;
//		System.out.print("c/" + "\n" + "i = " + i + "\n" +
//				"j = " + j + "\n" +
//				"a = " + a + "\n");

//		//f
//		int i = 1; int j = 1;
//		int a = ++i + ++j + i++ + j++;
//		System.out.print("c/" + "\n" + "i = " + i + "\n" +
//				"j = " + j + "\n" +
//				"a = " + a + "\n");

		//g
//		int i = 1;
//		int a = i++ + ++i - i-- - --i;
//		System.out.print("c/" + "\n" + "i = " + i + "\n" +
//
//				"a = " + a + "\n");

		//h
		int a = 10;
		a += a++ + ++a;
		System.out.print("a = " + a + "\n");
	}

}
