/*Given a string, return true if the string starts with "hi" and false otherwise.
startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
 */
public class StartHi {
    public boolean startHi(String str) {
        if (str.startsWith("hi")){
            return true;
        }
        return false;
    }
    public static void main(String[] arg) {
        StartHi greeting = new StartHi();
        boolean result = greeting.startHi("hello hi");
        System.out.println(result);
    }
}
