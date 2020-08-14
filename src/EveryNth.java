/*
Given a non-empty string and an int N, return the string made starting with char 0,
and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
 */
public class EveryNth {
    public String everyNth(String str, int n) {
        int length = str.length();
        String nth = "";
        int i = 0;
        while (i < length) {
            nth = nth + str.substring(i, i+1);
            i=i+n;
        }
        return nth;
    }
    public static void main(String[] arg) {
        EveryNth changedWord = new EveryNth();
        String result = changedWord.everyNth("abcdefg", 3);
        System.out.println(result);
    }
}
