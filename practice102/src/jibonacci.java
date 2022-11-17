import java.util.Scanner;

public class jibonacci {

    static int fib(int n)
    {
        if(n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayý giriniz : ");
        int value = input.nextInt();

        System.out.println(fib(value));
    }

}