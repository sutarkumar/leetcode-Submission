class Solution {
    public boolean isPalindrome(String s) {
        s = cleanString(s);
        return isPalindromeRecursive(s, 0, s.length() - 1);
    }

    private String cleanString(String s) {
        StringBuilder cleaned = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                cleaned.append(Character.toLowerCase(ch));
            }
        }
        return cleaned.toString();
    }

    private boolean isPalindromeRecursive(String s, int left, int right) {
        if (left >= right) return true;

        if (s.charAt(left) != s.charAt(right)) return false;

        return isPalindromeRecursive(s, left + 1, right - 1);
    }
}