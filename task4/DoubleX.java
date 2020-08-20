/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
 */
public class DoubleX {
    public static void main(String[] args) {
        DoubleX isDoubleX = new DoubleX();
        System.out.println(isDoubleX.doubleX("axxbb"));
    }

    public boolean doubleX(String str) {
        int isX = str.indexOf("x");

        if (isX == -1){
            return false;
        }
        String x = str.substring(isX);
        return x.startsWith("xx");
    }
}
