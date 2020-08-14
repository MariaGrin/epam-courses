/*
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
 */
public class SleepIn {
    public static boolean SleepOrNot(boolean weekday, boolean vacation) {
        if(weekday==false || vacation==true){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        SleepIn sleep = new SleepIn();
        System.out.println(sleep.SleepOrNot(false, true));
    }
};
