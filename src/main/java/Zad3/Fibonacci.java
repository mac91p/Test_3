package Zad3;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(getFibonacciIndex(88));

    }

    static long getFibonacciSequence(long x) {
        if (x == 0)
            return 0;
        else if (x == 1) {
            return 1;
        } else {
            return getFibonacciSequence(x - 1) + getFibonacciSequence(x - 2);
        }
    }

    static int getFibonacciIndex(int number) {
        int i = 2;
        while (i > 0) {
            long fibonacciNumber = getFibonacciSequence(i);
            if (fibonacciNumber != number) {
                if (fibonacciNumber > number) {
                    i = -1;
                    return i;
                } else {
                    i++;
                }
            } else {
                return i;
            }
        }
        return i;
    }


}
