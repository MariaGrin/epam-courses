/*Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
        nearHundred(93) → true
        nearHundred(90) → true
        nearHundred(89) → false
*/
public class NearHundred {
    public boolean nearHundred(int n) {
        int value1=100-n;
        int value2=200-n;
        return (Math.abs(value1) <= 10 || Math.abs(value2) <=10);
    }
    public static void main (String [] arg){
        NearHundred hundred = new NearHundred();
        boolean result = hundred.nearHundred(89);
        System.out.println(result);
    }
}
