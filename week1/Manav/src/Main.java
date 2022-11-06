import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double Armut = 2.14;
        double Elma =3.67;
        double Domates = 1.11;
        double Muz =0.95;
        double Patlican =5.0;
        double sum=0;
        int kg;
        System.out.print("Armut Kac kilo: ");
        kg= scan.nextInt();
        sum+=kg*Armut;
        System.out.print("Elma Kac kilo: ");
        kg= scan.nextInt();
        sum+=kg*Elma;
        System.out.print("Domates Kac kilo: ");
        kg= scan.nextInt();
        sum+=kg*Domates;
        System.out.print("Muz Kac kilo: ");
        kg= scan.nextInt();
        sum+=kg*Muz;
        System.out.print("Patlican Kac kilo: ");
        kg= scan.nextInt();
        sum+=kg*Patlican;
        System.out.println("Toplam tutar: "+sum+" TL0");

    }
}