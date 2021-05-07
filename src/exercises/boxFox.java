package exercises;

import java.util.Arrays;

public class boxFox {
    public static void main(String[] args) {
        String iWouldNot = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not " +
                "eat them in a house. I will not eat them with a mouse.";

        int maxStrings = 100;

        String[] words = iWouldNot.split("\\. ");
        System.out.println(Arrays.toString(words));

    }
}
