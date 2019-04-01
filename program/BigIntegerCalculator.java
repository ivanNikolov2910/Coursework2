package program;

import java.util.*;

public class BigIntegerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")){
                System.out.println("BYE");
                break;
            }
            String[] strings = input.split(" \\+ ");
            String string1 = strings[0];
            String string2 = strings[1];

            ArrayList<Integer> result = sum(string1, string2);
            print(result);
        }
    }


    public static ArrayList<Integer> sum(String string1, String string2) {
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        parseStringToArrayList(number1, string1);
        parseStringToArrayList(number2, string2);

        int length;
        if (string1.length() > string2.length()) {
            length = string1.length();
        } else {
            length = string2.length();
        }

        int naUm = 0;
        for (int i = 0; i < length; i++) {
            int digit1 = 0, digit2 = 0;
            try {
                digit1 = number1.get(i);
            } catch (Exception e) {
            }
            try {
                digit2 = number2.get(i);
            } catch (Exception e) {
            }
            int set = digit1 + digit2 + naUm;
            result.add(set % 10);
            naUm = set / 10;
        }
        if (naUm > 0) {
            result.add(naUm % 10);
        }
        return result;
    }






    public static void print(ArrayList<Integer> arrayList) {
        System.out.print("Sum = ");
        Collections.reverse(arrayList);
        for (int digit : arrayList) {
            System.out.print(digit);
        }
        System.out.println("\n");
    }

    public static void parseStringToArrayList(ArrayList<Integer> number, String string) {
        for (int i = string.length() - 1; i >= 0; i--) {
            number.add(string.charAt(i) - '0');
        }
    }
}
