import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double boy,kilo=0,res;
        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy = scan.nextDouble();
        System.out.print("Lutfen kilonuzu giriniz: ");
        kilo = scan.nextDouble();
        res=kilo/(boy*boy);
        System.out.print("Vucut kitle Indeksiniz: "+res);
    }
}