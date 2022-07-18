package util;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        System.out.println("Welcome to the battle of the lord");
        System.out.println("enter a word");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        boolean isGamveOver = false;
        char[] palabraGuiones= getWordsDivede(word);


        do {
            System.out.println("enter a character");
            char character = sc.nextLine().charAt(0);

        } while (!isGamveOver);

    }

    public static char[] getWordsDivede(String palabra) {
        int nLetters = palabra.length();
        char[] letters = new char[nLetters];

        for (int i = 0; i <letters.length; i++) {
            letters[i] ='_';
        }
        return letters;
    }

}
