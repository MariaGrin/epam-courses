/*
Given a non-empty string like "Code" return a string like "CCoCodCode".
stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
 */
public class StringSplosion {
    public static void main(String[] args) {
        StringSplosion resultString = new StringSplosion();
        System.out.println(resultString.stringSplosion("Code"));
    }

    public String stringSplosion(String str) {
        String finalString = "";

        for (int i = 0; i < str.length() + 1; i++)
            finalString += str.substring(0, i);
        return finalString;
    }
}
