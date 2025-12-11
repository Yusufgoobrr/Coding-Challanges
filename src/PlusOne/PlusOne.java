package PlusOne;

public class PlusOne {
    static void main(String[] args) {
        int[] digits = {1, 2, 3};
        System.out.println(plusOne(digits));
    }

    public static int[] plusOne(int[] digits) {
            int j = digits.length;
            for (int i = j - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] = ++digits[i];
                return digits;
            } else {
                digits[i] = 0;
            }

        }
        int[] res = new int[j + 1];
        res[0] = 1;
        return res;

    }
}
