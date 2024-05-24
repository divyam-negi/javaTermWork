public class Eighteen {
    public static void main(String[] args) {
        String str1 = "aaaabppppp";
        String str2 = "aabbcc";
        
        System.out.println(findLongestSubsequence(str1)); // Output: p=5
        System.out.println(findLongestSubsequence(str2)); // Output: a=2
    }

    public static String findLongestSubsequence(String str) {
        char[] chars = str.toCharArray();
        char longestChar = chars[0];
        int longestCount = 1;

        int currentCount = 1;
        char currentChar = chars[0];

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == currentChar) {
                currentCount++;
            } else {
                if (currentCount > longestCount) {
                    longestCount = currentCount;
                    longestChar = currentChar;
                }
                currentChar = chars[i];
                currentCount = 1;
            }
        }

        if (currentCount > longestCount) {
            longestCount = currentCount;
            longestChar = currentChar;
        }

        return longestChar + "=" + longestCount;
    }
}
