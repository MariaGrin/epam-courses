/*
Given 2 int values, return true if one is negative and one is positive.
Except if the parameter "negative" is true, then return true only if both are negative.
posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true
 */
public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative==true && a<0 && b<0) {
            return true;
        }
        else if (negative==false && ((a<0 && b>0) || (a>0 && b<0))) {
            return true;
        }
        return false;
    }
    public static void main (String [] arg){
        PosNeg number = new PosNeg();
        boolean result = number.posNeg(-4, -5, true);
        System.out.println(result);
    }
}
