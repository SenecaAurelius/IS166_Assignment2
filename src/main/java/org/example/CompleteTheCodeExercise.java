package org.example;

public class CompleteTheCodeExercise {
    public static void main(String[] args) {

        String inputString1 = "the the cat"; // "the cat"
        String inputString2 = "bar far cat cat hat cat"; // "bar far cat hat cat"
        String result1 = removeRepeatedWords(inputString1);
        System.out.println(result1);
        System.out.println(removeRepeatedWords(inputString2));
    }

    public static String removeRepeatedWords(String inputString) {
        inputString = inputString.trim();
        String result = "", currentWord = "", nextWord = "";
        int stringLength = inputString.length();
        int stringIndex = 0;

        while(stringIndex < stringLength) {
            //get next word in inputString
            while(stringIndex < stringLength && (inputString.charAt(stringIndex) != ' ')){
                nextWord = nextWord + inputString.charAt(stringIndex);
                stringIndex++;
            }

            //Check if nextWord is same as currentWord
            if(!nextWord.equals(currentWord)){
                result = result + nextWord + " ";
            }
            stringIndex++;
            currentWord = nextWord;
            nextWord = "";
        }
        return result.trim();
    }
}
