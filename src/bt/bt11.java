package bt;

import java.util.Scanner;

public class bt11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Day: ");
		int day = sc.nextInt();

		System.out.print("Month: ");
		int month = sc.nextInt();

		System.out.print("Year: ");
		int year = sc.nextInt();

		int maxDay;

		if (month == 4 || month == 6 || month == 9 || month == 11) {
			maxDay = 30;
		} else if (month == 2) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				maxDay = 29;
			} else {
				maxDay = 28;
			}
		} else {
			maxDay = 31;
		}

		if (day < 1 || day > maxDay || month < 1 || month > maxDay || year < 1) {
			System.out.print("Khong hop le");
		} else {
			int nextDay = day + 1;
			int nextMonth = month;
			int nextYear = year;

			if (nextDay > maxDay) {
				nextDay = 1;
				nextMonth = month + 1;

				if (nextMonth > 12) {
					nextMonth = 1;
					nextYear = year + 1;
				}
			}


			int preDay = day - 1;
			int preMonth = month;
			int preYear = year;

			if (preDay < 1) {
				preMonth = preMonth - 1;

				if (preMonth < 1) {
					preMonth = 12;
					preYear = year - 1;
				}

				if (preMonth == 4 || preMonth == 6 || preMonth == 9 || preMonth == 11) {
					preDay = 30;
				} else if (preMonth == 2) {
					if ((preYear % 4 == 0 && preYear % 100 != 0) || preYear % 400 == 0) {
						preDay = 29;
					} else {
						preDay = 28;
					}
				} else {
					preDay = 31;
				}

			}
			System.out.print("Ngay ke tiep: " + nextDay + "/" + nextMonth + "/" + nextYear + "\n");
			System.out.print("Ngay truoc do: " + preDay + "/" + preMonth + "/" + preYear);

		}
	}
}
