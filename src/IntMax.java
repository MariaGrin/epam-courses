/*
Given three int values, a b c, return the largest.
intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
 */
public class IntMax {
    public int intMax(int a, int b, int c) {
        int max = 0;

        if (a > b)
            max = a;
        else
            max = b;
        if (c > max)
            max = c;

        return max;
    }
    public static void main(String[] arg) {
        IntMax maxNum = new IntMax();
        int result = maxNum.intMax(3, 2, 1);
        System.out.println(result);
    }
}
