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
            String[] strings = input.split(" [\\+|-] ");
            String string1 = strings[0];
            String string2 = strings[1];
            if (input.contains("+")){
                sum(string1, string2);
            }else if (input.contains("-")){
                subs(string1, string2);
            }
        }
    }


    public static void sum(String string1, String string2) {
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = string1.length() - 1; i >= 0; i--) {
            number1.add(string1.charAt(i) - '0');
        }
        for (int i = string2.length() - 1; i >= 0; i--) {
            number2.add(string2.charAt(i) - '0');
        }
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
        Collections.reverse(result);
        for (Integer integer : result) {
            System.out.print(integer);
        }
        System.out.println();

    }

    public static void subs(String string1, String string2) {
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();

        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        int length;
        String number1 = string1, number2 = string2;
        boolean sign = false;
        if (string1.length() < string2.length()) {
            number1 = string2;
            number2 = string1;
            sign = true;
        }
        length = number1.length();
        while (number2.length() != number1.length()) {
            number2 = "0" + number2;
        }
        for (int i = length - 1; i >= 0; i--) {
            num1.add(number1.charAt(i) - '0');
            num2.add('9' - number2.charAt(i));
        }

        int carry = 0;
        for (int i = 0; i < length; i++) {
            int digit1 = 0, digit2 = 0;
            try {
                digit1 = num1.get(i);
            } catch (Exception e) {
            }
            try {
                digit2 = num2.get(i);
            } catch (Exception e) {
            }
            int set = digit1 + digit2 + carry;
            temp.add(set % 10);
            carry = set / 10;
        }
        for (int i = 0; i < length; i++) {
            int set = temp.get(i) + carry;
            result.add(set % 10);
            carry = set / 10;
        }

        int index = 0;
        while (result.get(index) == 0){
            result.remove(index);
        }
        if (sign) {
            System.out.print("-");
        }

        int counter = result.size() - 1;
        for (int i = result.size() - 1; i >= 0; i--) {
            if (result.get(i) != 0) {
                break;
            }
            counter--;
        }
        for (; counter >= 0; counter--) {
            System.out.print(result.get(counter));
        }
        System.out.println();
    }
}
