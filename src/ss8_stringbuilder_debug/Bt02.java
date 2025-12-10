package ss8_stringbuilder_debug;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Bt02 {


	public static void main(String[] args) throws ParseException {
		// a. Chuyển chuỗi "02/28/2023" sang kiểu java.util.Date.

		String a = "02/28/2023";
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date aDate = sdf.parse(a);

		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Cau a: " + sdf2.format(aDate));

		// b. Chuyển ngày hiện tại (của hệ thống) đang ở kiểu
		// java.util.Date sang kiểu String theo đinh dạng dd/MM/yyyy và hiển thị ra màn hình.
		System.out.print("Cau b:");
		Date now = new Date();
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy");
		String date = sdf3.format(now);
		System.out.println("Ngay hien tai: " + date);

		//c. Chuyển chuỗi "02/28/2023" sang kiểu LocalDate.
		String b = "02/28/2023";
		DateTimeFormatter df = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate ld = LocalDate.parse(b, df);
		System.out.println("Cau c: " + ld);

		//d. Chuyển ngày hiện tại (của hệ thống) đang ở kiểu LocalDate
		// sang kiểu String theo đinh dạng dd/MM/yyyy và hiển thị ra màn hình.
		LocalDate now2 = LocalDate.now();
		DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String date2 = df2.format(now2);
		System.out.println("Cau d: " + date2);

		//e. Lấy ngày, tháng, năm, giờ, phút, giây hiện tại của hệ thống.
		LocalDateTime today = LocalDateTime.now();

		int day = today.getDayOfMonth();
		int month = today.getMonthValue();
		int year = today.getYear();
		int hour = today.getHour();
		int minite = today.getMinute();
		int second = today.getSecond();

		System.out.println("Cau e: " + day + "/" + month + "/" + year + " " + hour + ":" + minite + ":" + second);

		// f. Hãy cho biết 1 tháng sau (tính từ ngày hiện tại) sẽ rơi vào thứ mấy trong tuần,
		// và cách ngày hiện tại bao nhiêu ngày?
		LocalDate now3 = LocalDate.now();
		LocalDate nextMonth = now3.plusMonths(1);
		DayOfWeek dayOfWeek = nextMonth.getDayOfWeek();

		long dayBetween = now3.until(nextMonth, ChronoUnit.DAYS);

		System.out.println("Cau f:");
		System.out.println("Ngay thang sau: " + nextMonth);
		System.out.println("Vao thu: " + dayOfWeek);
		System.out.println("Cach: " + dayBetween + "ngay");

		//g. Hãy cho biết cách đây 1000 ngày (tính từ ngày hiện tại) là ngày tháng năm nào?
		System.out.println("Cau g: ");
		LocalDate now4 = LocalDate.now();
		LocalDate past = now4.minusDays(1000);

		System.out.println("Cach day 1000 ngay la: " + past);

		//h. Nhập vào hai chuỗi có định dạng "dd/MM/yyyy" và chuyển đổi chúng thành hai đối tượng LocalDate
		// bằng cách sử dụng DateTimeFormatter và phương thức parse(). Sử dụng phương thức until()
		// để tính số ngày chênh lệch giữa hai LocalDate.
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap ngay thu nhat: ");
		String ngay = sc.nextLine();

		System.out.print("Nhap ngay thu 2: ");
		String ngay2 = sc.nextLine();

		DateTimeFormatter dt =  DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate ld1 = LocalDate.parse(ngay, dt);
		LocalDate ld2 = LocalDate.parse(ngay2, dt);

		long dayBetween2 = ld1.until(ld2, ChronoUnit.DAYS);

		System.out.println("Ngay chenh lech: " + dayBetween2);

		// i. Hãy nhập vào 1 String có định dạng là dd/MM/yyyy.
		// Sau đó, nhập vào số tự nhiên n. Hãy in ra ngày đứng sau ngày đã nhập n ngày.
		System.out.print("Nhap ngay: ");
		String ngay3 = sc.nextLine();

		System.out.print("Nhap n: ");
		int n = sc.nextInt();

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate now5 = LocalDate.parse(ngay3, dtf);

		LocalDate count = now5.plusDays(n);

		System.out.print("Ngay dung ngay sua da nhap: " + count);
	}
}
