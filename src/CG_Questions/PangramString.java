package CG_Questions;

import java.util.Scanner;

public class PangramString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        boolean flag = true;
        String s = "abcdefghijklmnopqrstuvwxyz"; // a - z

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!str.contains(String.valueOf(c))) {
                flag = false;
                break;
            }
        }

        if(flag) {
            System.out.println("Pangram");
        }
        else {
            System.out.println("Not Pangram");
        }


    }
}
