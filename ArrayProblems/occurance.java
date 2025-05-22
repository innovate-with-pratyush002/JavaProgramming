public class occurance {
   public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        int hLen = haystack.length();
        int nLen = needle.length();

        // Only check up to the point where the remaining characters are >= needle length
        for (int i = 0; i <= hLen - nLen; i++) {
            if (haystack.substring(i, i + nLen).equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack = "Pratyush Nishad";
        String needle = "Ni";
        int result = strStr(haystack, needle);
        System.out.println("First occurrence index: " + result);
    }  
}
