/*
Given a string, return a new string where the last 3 chars are now in upper case.
If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase()
returns the uppercase version of a string.
endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
 */
public class EndUp {
    public String endUp(String str) {
        if (str.length() < 3) {
            return str.toUpperCase();
        }
        String letters = str.substring(str.length() - 3, str.length()).toUpperCase();
        String nochanged = str.substring(0, str.length() - 3);
        return nochanged + letters;
    }

    public static void main(String[] arg) {
        EndUp lastChars = new EndUp();
        String result = lastChars.endUp("Heelele");
        System.out.println(result);
    }
}
