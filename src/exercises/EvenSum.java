package exercises;

import java.util.ArrayList;

public class EvenSum {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);

        System.out.println(sumEven(arr));
        //System.out.println(fiveLetters(arr));
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

        public static void fiveLetters(ArrayList<String> arr) {
            ArrayList<String> words = new ArrayList<>();
            words.add("peach");
            words.add("lemon");
            words.add("lime");
            words.add("banana");
            words.add("apple");
            words.add("mango");
            words.add("blueberry");
            words.add("watermelon");
            words.add("cherry");
            words.add("orange");
            //return;
        }


    }

//}
