import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double perKm=2.20,openingPrice=10.0,sum=0.0;
        int km;
        System.out.println("Mesafeyi km cinsinden giriniz: ");
        km=scan.nextInt();
        sum += (km*perKm)+openingPrice;
        sum = sum<20?20:sum;
        System.out.println("Ucretiniz: "+sum);

    }
}