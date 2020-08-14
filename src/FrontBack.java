/*
Given a string, return a new string where the first and last chars have been exchanged.
frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
 */
public class FrontBack {
    public String frontBack(String str) {
        String first;
        String last;
        String nochanged;
        if (str.length() == 0) {
            return str;
        }
        else if (str.length() == 1) {
            return str;
        }
        else if (str.length() == 2) {
            first = str.substring(0,1);
            last = str.substring(1);
            return last+first;
        }
        else{
            first=str.substring(0,1);
            last=str.substring(str.length()-1);
            nochanged=str.substring(1, str.length()-1);
            return last+nochanged+first;
        }
    }
    public static void main(String[] arg) {
        FrontBack revWord = new FrontBack();
        String result = revWord.frontBack("code");
        System.out.println(result);
    }
}

