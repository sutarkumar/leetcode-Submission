class Solution {
    public int myAtoi(String s) {
            if (s == null || s.length() == 0) return 0;

    int i = 0;
    int sign = 1;
    int result = 0;

    // Step 1: Skip leading whitespaces
    while (i < s.length() && s.charAt(i) == ' ') {
        i++;
    }

    // Step 2: Check for optional sign
    if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
        sign = (s.charAt(i) == '-') ? -1 : 1;
        i++;
    }

    // Step 3: Convert the string to an integer
    while (i < s.length() && Character.isDigit(s.charAt(i))) {
        int digit = s.charAt(i) - '0';

        // Handle overflow and underflow
        if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        result = result * 10 + digit;
        i++;
    }

    return result * sign;
    }
}