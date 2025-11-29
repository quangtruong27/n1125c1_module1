package bt;

import java.sql.SQLOutput;
import java.util.Scanner;

public class bt08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Month: ");
		int month = sc.nextInt();
		System.out.print("Year: ");
		int year = sc.nextInt();
		int day;

		if (month == 4 || month == 6 || month == 9 || month == 11) {
			day = 30;
		} else if (month == 2) {
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
				day = 29;
			}else{
				day = 28;
			}
		}else{
			day = 31;
		}

		System.out.print("Month: " + month + " Year: " + year + " Day: " + day);
	}
}
