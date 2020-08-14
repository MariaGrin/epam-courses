/*Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
        backAround("cat") → "tcatt"
        backAround("Hello") → "oHelloo"
        backAround("a") → "aaa"
 */

public class BackAround {
    public String backAround(String str) {
        char last = str.charAt(str.length()-1);
        return last+ str + last;
    }
    public static void main(String[] arg) {
        BackAround addLet = new BackAround();
        String result = addLet.backAround("a");
        System.out.println(result);
    }
}

