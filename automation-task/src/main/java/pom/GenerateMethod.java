package pom;

import java.util.Random;

public class GenerateMethod {
    public static void generate(){

        String alphabet = "abcdefghijklmnopqrstwxz";
        StringBuilder builder = new StringBuilder();
        Random random = new Random();
        int length = 7;

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            builder.append(randomChar);
        }
        String randomString = builder.toString();
        System.out.println(randomString);

    }
}
