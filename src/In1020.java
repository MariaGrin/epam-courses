/*
Given 2 int values, return true if either of them is in the range 10..20 inclusive.
in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
 */
public class In1020 {
    public boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >=10 && b <=20));
    }
    public static void main(String[] arg) {
        In1020 inRanger = new In1020();
        boolean result = inRanger.in1020(8, 99);
        System.out.println(result);
    }
}
