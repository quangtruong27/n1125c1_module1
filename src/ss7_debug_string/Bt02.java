package ss7_debug_string;

public class Bt02 {
	// a. String -> int
	public static int stringToInt(String s) {
		return Integer.parseInt(s);
	}

	// b. int -> String
	public static String intToString(int i) {
		return String.valueOf(i);
	}

	// c. String -> long
	public static long stringToLong(String s) {
		return Long.parseLong(s);
	}

	// d. long -> String
	public static String longToString(long l) {
		return String.valueOf(l);
	}

	// e. String -> float
	public static float stringToFloat(String s) {
		return Float.parseFloat(s);
	}

	// f. float -> String
	public static String floatToString(float f) {
		return String.valueOf(f);
	}

	// g. String -> double
	public static double stringToDouble(String s) {
		return Double.parseDouble(s);
	}

	// h. double -> String
	public static String doubleToString(double d) {
		return String.valueOf(d);
	}

	// i. String -> short
	public static short stringToShort(String s) {
		return Short.parseShort(s);
	}

	// k. short -> String
	public static String shortToString(short s) {
		return String.valueOf(s);
	}

	public static void main(String[] args) {

		System.out.println("a. String -> int: " + stringToInt("123"));
		System.out.println("b. int -> String: " + intToString(456));
		System.out.println("c. String -> long: " + stringToLong("7890"));
		System.out.println("d. long -> String: " + longToString(9876543210L));
		System.out.println("e. String -> float: " + stringToFloat("3.14"));
		System.out.println("f. float -> String: " + floatToString(2.71f));
		System.out.println("g. String -> double: " + stringToDouble("123.456"));
		System.out.println("h. double -> String: " + doubleToString(789.01));
		System.out.println("i. String -> short: " + stringToShort("12"));
		System.out.println("k. short -> String: " + shortToString((short) 34));
	}
}
