public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            minLen = Math.min(minLen, str.length());
        }
        int i = 0;
        for (; i < minLen; i++) {
            char c = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0].substring(0, i);
    }

    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(lcp.longestCommonPrefix(strs));
        strs = new String[] { "dog", "racecar", "car" };
        System.out.println(lcp.longestCommonPrefix(strs));
    }
}