package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static void main(String[] args) {
        System.out.println(App.scrabble("rkqodlw", "world")); // true
        System.out.println(App.scrabble("ajv", "java")); // false
        System.out.println(App.scrabble("avjafff", "JaVa")); // true
        System.out.println(App.scrabble("", "hexlet")); // false
    }

    public static boolean scrabble(String set, String word) {
        String[] setArr = set.toLowerCase().split("");
        List<String> chList = new ArrayList<>(Arrays.asList(setArr));
        for (int i = 0; i < word.length(); i++) {
            int indexOfCh = chList.indexOf(String.valueOf(word.toLowerCase().charAt(i)));
            if (indexOfCh == -1) {
                return false;
            }
            chList.remove(indexOfCh);
        }
        return true;
    }
}

//END
