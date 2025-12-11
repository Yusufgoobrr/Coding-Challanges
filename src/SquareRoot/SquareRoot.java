package SquareRoot;

public class SquareRoot {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        long value = 1;
        int indexer = 0;
        while (value * value <= x) {
            value++;
            indexer++;
        }
        return indexer;
    }
}
