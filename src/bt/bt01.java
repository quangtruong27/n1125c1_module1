package bt;


/**
 * de bai
 */
public class bt01 {
	public static void main(String[] args) {
		/*
		&&: AND: Dung khi ca 2 deu dung
		|| : OR: Sai khi ca 2 deu sai
		!: dao gia tri
		*/

		boolean a = true && false;    			// false
		boolean b = (3 > 100) || (25 % 5 == 0); //true
		boolean c = a && b;						//false && true = false
		boolean d = !a || b;					//true || true = true
	}
}
