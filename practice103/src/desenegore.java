

import java.util.Scanner;

public class desenegore {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N Sayisi : ");
        int n = input.nextInt();

        foo(n);

    }

    static void foo(int n)
    {
        if(n < 1)
        {
            System.out.print(n+" ");
            return;
        }

        System.out.print(n+" ");
        foo(n-5);
        System.out.print(n + " ");
    }

}