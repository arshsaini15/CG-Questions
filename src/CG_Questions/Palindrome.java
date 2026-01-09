package CG_Questions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int temp = n, num = 0;

        while(temp != 0) {
            num = num * 10 + temp % 10;
            temp /= 10;
        }

        if(num == n)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
