package work.practice.q9;

/*
 Exercise 6: Create a method to accept date and print the duration in days,
  months and years with regards to current system date.
*/
public class DaysCalculation {

	public static boolean checkLeapYear(int year) {
		if (year % 400 == 0)
			return true;

		if (year % 100 == 0)
			return false;

		if (year % 4 == 0)
			return true;
		return false;
	}

	public static int daysBetweenYears(int year1, int year2) {
		int days = 0;

		while (year1 <= year2) {
			days += 365;
			if (checkLeapYear(year1)) {
				days += 1;
			}
			year1++;
		}
		return days;
	}

	public static int daysLeftInYear(int days, int month, int year) {

		int months[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (checkLeapYear(year)) {
			months[2] = 29;
		}

		int total = -days;
		while (month <= 12) {
			total += months[month];
			month++;
		}
		return total;
	}

	public static int daysPassedInYear(int days, int month, int year) {

		int months[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (checkLeapYear(year)) {
			months[2] = 29;
		}

		int total = days;
		int index = 1;
		while (index < month) {
			total += months[index];
			index++;
		}
		return total;
	}

	public static void main(String[] args) {
		int day1 = 17, month1 = 7, year1 = 1999;
		int day2 = 4, month2 = 8, year2 = 2021;

		if (year1 == year2) {

			int daysLeft1 = daysLeftInYear(day1, month1, year1);
			int daysLeft2 = daysLeftInYear(day2, month2, year2);
			int ans = Math.abs(daysLeft1 - daysLeft2);
			System.out.println(ans);
			return;

		}

		int totalDays = daysBetweenYears(year1 + 1, year2 - 1);
		int daysPassed = daysPassedInYear(day2, month2, year2);
		int daysLeft = daysLeftInYear(day1, month1, year1);

		System.out.println(totalDays + daysPassed + daysLeft);

	}
}
