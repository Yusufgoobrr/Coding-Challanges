package LengthOfLastWord;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int count = 0;
        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                i--;
            } else {
                count++;
                --i;
                if (i < 0) {
                    return count;
                } else {
                    if (s.charAt(i) == ' ') {
                        return count;
                    }
                }
            }
        }
        return 0;
    }
}

