package tdd.examples;

public class LongestCommonSubstring {
    public static int longestCommonSubstring(String A, String B) {
        int n = A.length();
        int max = 0;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                String subStr = A.substring(j, i + 1);
                if (B.contains(subStr)) {
                    max = Math.max(max, subStr.length());
                }
            }
        }
        return max;
    }
}