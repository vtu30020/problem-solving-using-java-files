class Solution {
    public int dayOfYear(String date) {
        String[] s = date.split("-");

        int year = Integer.parseInt(s[0]);
        int month = Integer.parseInt(s[1]);
        int day = Integer.parseInt(s[2]);

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            days[1] = 29;
        }

        int result = day;

        for (int i = 0; i < month - 1; i++) {
            result += days[i];
        }

        return result;
    }
}


OUTPUT:

Input
date =
"2019-01-09"
Output
9
Expected
9