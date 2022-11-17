
import java.util.Scanner;

public class minmax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, value ,max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
        System.out.print("Ka� tane say� gireceksiniz : ");
        n = input.nextInt();

        for(int i = 1; i <= n; i++)
        {
            System.out.print(i + ". Say�y� giriniz : ");
            value = input.nextInt();

            if (value < min)
                min = value;
            if (value > max)
                max = value;
        }

        System.out.println("En b�y�k say�: " + max + "\nEn k���k say�: " + min);




    }

}