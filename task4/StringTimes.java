/*
Given a string and a non-negative int n, return a larger string that is n copies of the original string.

stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
 */
public class StringTimes {
    public static void main(String args[]) {
        StringTimes result = new StringTimes();
        System.out.println(result.stringTimes("Hi", 1));
    }

    public String stringTimes(String str, int n) {
        String lagerString = "";

        for (int i = 0; i < n; i++) {
            lagerString += str;
        }
        return lagerString;
    }
}

