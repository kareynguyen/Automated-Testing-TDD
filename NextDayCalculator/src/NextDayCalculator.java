

public class NextDayCalculator {
    public static final int FIRST_DAY = 1;
    public static final int FIRST_MONTH = 1;
    public static final int LAST_MONTH = 12;

    static boolean isLeapYear (int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    static int lastDayOfMonth(int month, int year) {
        int lastDayOfMonth = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastDayOfMonth = 31;
                break;
            case 2:
            if (isLeapYear(year)){
                lastDayOfMonth = 29;
            }else lastDayOfMonth = 28;
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                lastDayOfMonth = 30;
                break;
        }return lastDayOfMonth;
    }

    static String findNextDay(int day, int month, int year){
        if (day == lastDayOfMonth(month,year) && month == LAST_MONTH){
            return FIRST_DAY + "/" + FIRST_MONTH + "/" + ++year;
        }else if (day == lastDayOfMonth(month, year) &&
                month >= FIRST_MONTH &&
                month < LAST_MONTH){
            return FIRST_DAY + "/" + ++month + "/" + year;
        }else if (day >= FIRST_DAY && day <= lastDayOfMonth(month,year)){
            return ++day + "/" + month + "/" + year;
        }else return "Invalid";
    }

}


