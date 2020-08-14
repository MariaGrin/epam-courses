/*
Return true if the given string contains between 1 and 3 'e' chars.
stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */
public class StringE {
    public boolean stringE(String str) {
        int k = 0;
        for (int i=0; i < str.length(); i++) {
            if (str.substring(i,i+1).equals("e"))
                k++;
        }
        return (k >= 1 && k <= 3);
    }
    public static void main(String[] arg) {
        StringE countE = new StringE();
        boolean result = countE.stringE("Heelele");
        System.out.println(result);
    }
}
