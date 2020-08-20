/*
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
 */
public class StringBits {
    public static void main(String[] args) {
        StringBits resultString = new StringBits();
        System.out.println(resultString.stringBits("Hello"));
    }

    public String stringBits(String str) {
        int length = str.length();
        String finalString = "";

        for (int i = 0; i < length; i = i + 2) {
            finalString += str.charAt(i);
        }
        return finalString;

    }
}
