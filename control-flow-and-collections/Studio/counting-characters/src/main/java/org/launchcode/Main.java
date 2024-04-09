package org.launchcode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
//        String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] characterInString = str.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char letter : characterInString) {
            if (!charCount.containsKey(letter)) {
                charCount.put(letter, 1);
            } else {
                charCount.put(letter, charCount.get(letter) + 1);
            }
        }


        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}