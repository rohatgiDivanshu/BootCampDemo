package bootcamp.demo;

public class Question2 {

    public static void main(String[] args) {

        String input = "Bootcamp session started started in sparta sparta";
        String[] words = input.split(" ");
        int wrc = 1;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {

                if (words[i].equals(words[j])) {
                    wrc++;
                    words[j] = "0";
                }
            }
            if (!words[i].equals("0"))
                System.out.println(words[i] + " : " + wrc);
            wrc = 1;


        }

    }
}
