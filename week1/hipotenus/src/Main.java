import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b,c,u,alan;
        Scanner scan=new Scanner(System.in);
        System.out.print("İlk kenar uzunluğunu giriniz: ");
        a = scan.nextDouble();
        System.out.print("İkinci kenar uzunluğunu giriniz: ");
        b = scan.nextDouble();
        System.out.print("Üçüncü kenar uzunluğunu giriniz: ");
        c = scan.nextDouble();
        u = (a + b +c) / 2;
        alan = u * (u - a) * (u - b) * (u - c);
        System.out.print("Ucgenin alani :" +  Math.sqrt(alan));

    }
}