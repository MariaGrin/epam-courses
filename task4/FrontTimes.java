/*
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
or whatever is there if the string is less than length 3. Return n copies of the front;

frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
 */
public class FrontTimes {
    public static void main(String[] args) {
        FrontTimes frontString = new FrontTimes();
        String resultString = frontString.frontTimes("Chocolate", 3);
        System.out.println(resultString);

    }

    public String frontTimes(String str, int n) {
        int stringLength = str.length();
        String result = "";

        for (int i = 0; i < n; i++) {
            if (stringLength > 3) {
                String frontLetters = str.substring(0, 3);
                result += frontLetters;
            } else {
                result += str;
            }
        }
        return result;
    }

}
