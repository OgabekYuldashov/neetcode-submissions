class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] charMap1 = new int[128];
        int[] charMap2 = new int[128];

        // count the count of distinct characters in each string
        for (int i = 0; i < s.length(); i++) {
            charMap1[(int) s.charAt(i)]++;
            charMap2[(int) t.charAt(i)]++;
        }

        // validate if both arrays have the same count for each character
        for (int i = 0; i < charMap1.length; i++) {
            if (charMap1[i] != charMap2[i])
                return false;
        }

        return true;
    }
}
