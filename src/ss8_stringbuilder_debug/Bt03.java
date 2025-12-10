package ss8_stringbuilder_debug;

public class Bt03 {
	//    a. Cho các ví dụ về ép kiểu mà độ chính xác không bị thay đổi, như thứ tự bên dưới:
	//        byte⤍short⤍int⤍long⤍float⤍double
	public static void cauA() {
		byte b = 10;
		short s = b;
		int i = s;
		long l = i;
		float f = l;
		double d = f;

		System.out.println("Cau A: " + d);
	}

	//   b. Cho các ví dụ về ép kiểu mà độ chính xác không bị thay đổi, như thứ tự bên dưới:
	//        double⤍float⤍long⤍int⤍short⤍byte
	public static void cauB() {
		double d = 12.0;
		float f = (float) d;
		long l = (long) f;
		int i = (int) l;
		short s = (short) i;
		byte b = (byte) s;

		System.out.println("Cau b: " + b);
	}

	//  c. Cho các ví dụ về ép kiểu mà độ chính xác bị thay đổi, như thứ tự bên dưới:
	//        double⤍float⤍long⤍int⤍short⤍byte
	public static void cauC() {
		double d = 123456.789;
		float f = (float) d;   // mất độ chính xác phần thập phân
		long l = (long) f;     // mất phần thập phân
		int i = (int) l;       // có thể vượt phạm vi int
		short s = (short) i;   // có thể vượt phạm vi short
		byte b = (byte) s;     // có thể vượt phạm vi byte

		System.out.println("Cau c: " + b);
	}

	//    d. Phân biệt ép kiểu tường minh và ép kiểu ngầm định
	public static void cauD() {
		int i = 10;
		double d = i; // ép kiểu ngầm định

		double d2 = 9.7;
		int i2 = (int) d2; // ép kiểu tường minh

		System.out.println("int -> double = " + d);
		System.out.println("double -> int = " + i2);
	}

	//   e. Khi nào cần dùng các ký tự L, F, D… sau các số nguyên, số thực trong Java?
	//   Khi nào thì không cần dùng đến các ký tự này mà Java vẫn tự hiểu được các số thuộc kiểu dữ liệu gì?
	public static void cauE() {
		long l = 1234567890123L; // cần L vì vượt phạm vi int
		float f = 3.14F;         // cần F vì mặc định số thực là double
		double d = 3.14;         // mặc định là double, không cần D

		System.out.println("L: " + l);
		System.out.println("F: " + f);
		System.out.println("D: " + d);
	}

	// Main để chạy thử tất cả
	public static void main(String[] args) {
		cauA();
		cauB();
		cauC();
		cauD();
		cauE();
	}
}
