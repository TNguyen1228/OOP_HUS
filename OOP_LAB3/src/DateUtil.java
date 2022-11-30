
public class DateUtil {
	private static int minYear = 1;
	private static final int maxYear = 9999;
	private static String[] strMonths = { "Jan", "Feb", "Mar", "Apr", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	private static int[] daysInMonths = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static int[] nonLeapYearMonthNumbers = { 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
	private static int[] leapYearMonthNumbers = { 6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
	private static String[] strDay = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		} else
			return false;
	}

	public static boolean isValidDate(int year, int month, int day) {
		if (year < minYear || year > maxYear) {
			return false;
		}
		if (month < 1 || month > 12) {
			return false;
		}
		int monthDays = daysInMonths[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);
		return 1 <= day && day <= monthDays;
	}

	public static int getDayOfWeek(int year, int month, int day) {
		int magicCenturyNumber = 6 - 2 * ((year / 100) % 4);

		// 2. Add to the last two digit of the year.
		int lastTwoDigitsOfYear = year % 100;

		// 3. Add to "the last two digit of the year divide by 4, truncate the
		// fractional part".
		int magicYearNumber = lastTwoDigitsOfYear / 4;

		// 4. Add to the number obtained from the month table.
		int magicMonthNumber = isLeapYear(year) ? leapYearMonthNumbers[month - 1] : nonLeapYearMonthNumbers[month - 1];

		// 5. Add to the day.
		int magicDayNumber = day;

		// 6. The sum modulus 7 gives the day of the week, where 0 for SUN, 1 for MON,
		// ..., 6 for SAT.
		return (magicCenturyNumber + lastTwoDigitsOfYear + magicYearNumber + magicMonthNumber + magicDayNumber) % 7;
	}

	public static String toString(int year, int month, int day) {
		if (!isValidDate(year, month, day)) {
			return "Not a valid date!";
		}
		int d = getDayOfWeek(year, month, day);
		return strDay[d] + " " + day + " " + strMonths[month - 1] + " " + year;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isLeapYear(2000));
		System.out.println(isLeapYear(2012));
		System.out.println(isValidDate(2012, 2, 29));
		System.out.println(getDayOfWeek(2056, 12, 28));
		System.out.println(toString(2012, 2, 15));
	}

}
