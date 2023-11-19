package org.example;
import java.util.Scanner;

import static org.example.RemoveRepeatedWords.removeRepeatedWords;

public class RemoveCompletedWordsApp {

    public static void main(String[] args) {
        System.out.println("Enter the string with repeated words to remove : ");
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        System.out.println(removeRepeatedWords(inputString));

    }
}
