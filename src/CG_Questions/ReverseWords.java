package CG_Questions;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        String[] s = str.split("\\s+");

        for (String s1 : s) {
            for(int i=s1.length()-1; i>=0; i--) {
                System.out.print(s1.charAt(i));
            }
            System.out.print(" ");
        }
    }
}
