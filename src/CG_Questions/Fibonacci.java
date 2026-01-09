package CG_Questions;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;

        int first = 0, second = 1;
        System.out.print(first + " " + second + " ");

        for(int i=2; i<n; i++) {
            int num = first + second;
            System.out.print(num + " ");
            first = second;
            second = num;
        }
    }
}
