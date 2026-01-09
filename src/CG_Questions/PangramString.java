package CG_Questions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        if (str == null || str.length() < 26) {
            System.out.println("Not Pangram");
        }

        Set<Character> letters = new HashSet<>();

        for (char c : str.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letters.add(c);
            }
        }

        System.out.println("Is Pangram : " + (letters.size() == 26));
    }
}
