package CG_Questions;

public class GCD_LCM {

    public static int GCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static int LCM(int a, int b) {
        return ((a * b) / GCD(a, b));
    }

    public static void main(String[] args) {
        int a = 44, b = 12;

        System.out.println("GCD : " + GCD(a, b));
        System.out.println("LCM : " + LCM(a, b));
    }
}
