/*
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
 */
public class MixStart {
    public boolean mixStart(String str) {
        if (str.length() < 3)
            return false;
        return str.substring(1,3).equals("ix");
    }
    public static void main(String[] arg) {
        MixStart isIx = new MixStart();
        boolean result = isIx.mixStart("piz snacks");
        System.out.println(result);
    }
}
