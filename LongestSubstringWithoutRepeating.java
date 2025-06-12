package javaprograms;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Length of longest substring without repeating characters: " + lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0;  // start index of current window
        int[] chars = new int[128];  // ASCII character frequency array

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            chars[c]++;

            // If there is a repeating character, move start pointer
            while (chars[c] > 1) {
                chars[s.charAt(start)]--;
                start++;
            }

            // Calculate max length so far
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}
