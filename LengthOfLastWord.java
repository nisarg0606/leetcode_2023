public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int i = s.length() - 1;
        for (; i >= 0; i--) {
            if (s.charAt(i) == ' ')
                break;
        }
        return s.length() - 1 - i;
    }

    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord.lengthOfLastWord("luffy is still joyboy"));
        System.out.println(lengthOfLastWord.lengthOfLastWord("a"));
    }
}
