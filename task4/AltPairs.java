/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
 */
public class AltPairs {
    public static void main(String[] args) {
        AltPairs result = new AltPairs();
        System.out.println(result.altPairs("CodingHorror"));
    }

    public String altPairs(String str) {
        String finalString = "";

        for (int i = 0; i < str.length(); i += 4) {
            int endOfString = i + 2;
            if (endOfString > str.length()) {
                endOfString = str.length();
            }
            finalString +=str.substring(i, endOfString);
        }
        return finalString;
    }
}
