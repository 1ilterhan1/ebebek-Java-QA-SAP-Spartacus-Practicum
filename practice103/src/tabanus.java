

import java.util.Scanner;

public class tabanus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base,exponent;
        System.out.print("Taban de�erini giriniz : ");
        base = input.nextInt();
        System.out.print("�s de�erini giriniz : ");
        exponent = input.nextInt();

        System.out.println(expRecursive(base,exponent));

    }

    static long expRecursive(int base, int exponent)
    {
        if(exponent == 0)
            return 1;
        return expRecursive(base,exponent-1) * base;
    }

}