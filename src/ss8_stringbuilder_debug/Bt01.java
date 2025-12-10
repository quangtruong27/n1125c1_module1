package ss8_stringbuilder_debug;

public class Bt01 {

	// a. Cho chuỗi "Hello World"
	//    Lấy ra chữ World bằng cách dùng StringBuffer và StringBuilder.
	public static void cauA(String str){
		StringBuilder sb = new StringBuilder(str);
		String result1 = sb.substring(6);

		StringBuffer sb1 = new StringBuffer(str);
		String result2 = sb1.substring(6);

		System.out.println("Cau a:");
		System.out.println("String Builder: " + result1);
		System.out.println("String Buffer: " + result2);
	}

	// b. Cho chuỗi "Hello World"
	//    Thay o thành f bằng cách dùng StringBuffer và StringBuilder.
	public static void cauB(String str){
		System.out.println("Cau b: ");

		StringBuffer b1 = new StringBuffer(str);
		b1.setCharAt(4,'f');
		b1.setCharAt(7,'f');
		System.out.println("String Buffer: " + b1);

		StringBuilder b2 = new StringBuilder(str);
		b2.setCharAt(4,'f');
		b2.setCharAt(7,'f');
		System.out.println("String Builder: " + b2);
	}

	// c. Cho chuỗi "Hello" và chuỗi “World”
	//    Nối 2 chuỗi này bằng cách dùng String, StringBuffer và StringBuilder.
	public static void cauC(String a, String b){
		System.out.println("Cau c:");

		String c = a + b;
		System.out.println("String: " + c);

		StringBuffer c1 = new StringBuffer(a);
		c1.append(b);
		System.out.println("String Buffer: " + c1);

		StringBuilder c2 = new StringBuilder(a);
		c2.append(b);
		System.out.println("String Builder: " + c2);
	}

	// d. Đoạn code tạo đối tượng và in kết quả
	public static void cauD(){
		String a = "A";
		String b = new String("A");
		String c = "A";
		b.concat("B");
		String d = c.concat("C");
		StringBuffer e = new StringBuffer("E");
		e.append("F");
		StringBuilder g = new StringBuilder("G");
		g.append("H");
		System.out.println("Cau d: " + (a + b + c + d + e + g));
	}

	// e. Viết chương trình phân biệt sự khác nhau giữa so sánh bằng method equals và so sánh bằng toán tử == khi sử dụng String,
	// StringBuffer và StringBuilder.
	public static void testString() {
		String s1 = new String("Hello");
		String s2 = new String("Hello");

		System.out.println("\n=== String ===");
		System.out.println("s1 == s2 ? " + (s1 == s2));           // false
		System.out.println("s1.equals(s2) ? " + s1.equals(s2));   // true
	}

	public static void testStringBuffer() {
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");

		System.out.println("\n=== StringBuffer ===");
		System.out.println("sb1 == sb2" + (sb1 == sb2));       // false
		System.out.println("sb1.equals(sb2)" + sb1.equals(sb2)); // false
		System.out.println("sb1.toString().equals(sb2.toString())"
				+ sb1.toString().equals(sb2.toString())); // true
	}

	public static void testStringBuilder() {
		StringBuilder sbld1 = new StringBuilder("Hello");
		StringBuilder sbld2 = new StringBuilder("Hello");

		System.out.println("\n=== StringBuilder ===");
		System.out.println("sbld1 == sbld2" + (sbld1 == sbld2));       // false
		System.out.println("sbld1.equals(sbld2)" + sbld1.equals(sbld2)); // false
		System.out.println("sbld1.toString().equals(sbld2.toString())"
				+ sbld1.toString().equals(sbld2.toString()));   // true
	}

	public static void main(String[] args) {
		String str = "Hello World";
		String a = "Hello ";
		String b = "World";

		cauA(str);
		cauB(str);
		cauC(a, b);
		cauD();

		// gọi câu e
		testString();
		testStringBuffer();
		testStringBuilder();
	}
}