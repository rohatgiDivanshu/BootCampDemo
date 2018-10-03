package bootcamp.demo;

public class Question3 {

    public static int OccuranceOfString(String str, char c) {

        int result = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.toLowerCase().trim().charAt(i) == c) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        String string = "This is ME Sparta";
        char c = 's';

        System.out.println("Occurance of a Character of String :" + OccuranceOfString(string, c));
    }
}
