import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar;
        double kdvOrani=0;
        double kdvTutari;
        double kdvliTutar;
        boolean kdvDurumu;

        Scanner scan = new Scanner(System.in);

        System.out.println("Ucret tutari giriniz: ");
        tutar = scan.nextDouble();
        if (tutar < 0){
            System.out.println("Gecereli tutar giriniz.");
            System.exit(0);
        }
        else if(tutar>1000)
            kdvOrani=0.08;
        else
            kdvOrani=0.18;

        kdvTutari=tutar*kdvOrani;
        kdvliTutar=kdvTutari+tutar;

        System.out.println(" KDV'siz Tutar: "+tutar);
        System.out.println(" KDV oranı    : "+kdvOrani);
        System.out.println(" KDV Tutarı   : "+kdvTutari);
        System.out.println(" KDV'li Tutar: "+kdvliTutar);
    }
}