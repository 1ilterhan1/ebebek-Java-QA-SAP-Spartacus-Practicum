

import java.util.Scanner;

public class asalsayi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Say� Giriniz : ");
        int value = input.nextInt();

        System.out.println(value + " say�s� ASAL" + ((isPrime(value,2)) ? "DIR !" : " de�ildir !"));
    }

    static boolean isPrime(int value, int count)
    {
        if(count*count <= value)
            return (value % count != 0) && (isPrime(value,count+1));
        return true;
    }
}