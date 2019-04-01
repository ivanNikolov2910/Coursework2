package program;

import java.util.Scanner;

public class IndexOfWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().toLowerCase();
        String[] word = string.split("");
        int counter = 0;
        for (int i = 0; i < word.length; i++) {
            counter = 0;
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (word[i].equals(String.valueOf(ch))) {
                    System.out.println(ch + " -> " + counter);
                } else {
                    counter++;
                }
            }
        }
    }
}


