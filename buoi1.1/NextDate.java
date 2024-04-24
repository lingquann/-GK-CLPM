public class NextDate {
    public static String getNextDate(int day, int month, int year) {
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1812 || year > 2999) {
            return "Invalid date";
        }

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2 && isLeapYear(year)) {
            daysInMonth[2] = 29;
        }
        if (month == 2 && (isLeapYear(year)==false)) {
            return "Invalid date";
        }

        if (day < daysInMonth[month]) {
            day++;
        } else if (month < 12) {
            day = 1;
            month++;
        } else {
            day = 1;
            month = 1;
            year++;
        }

        return day + "/" + month + "/" + year;
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            return true;
        }
        if (year % 4 != 0) {
            return false;
        }
        return year % 4 == 0;
    }
}