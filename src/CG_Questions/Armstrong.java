package CG_Questions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 153, digits = 3;
        int temp = number, n = 0;

        while(temp != 0) {
            n += (int) (Math.pow(temp % 10, digits));
            temp /= 10;
        }

        System.out.println(n == number);
    }
}
