import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r,x;
        double pi=3.14,alan=0;
        System.out.println("Dairenin yaricapini giriniz: ");
        r=scan.nextInt();
        if(r<0){
            System.out.println("gecerli aci giriniz!");
            System.exit(0);
        }
        System.out.println("merkez acisini giriniz(0<x<=360):");
        x=scan.nextInt();
        if(x>360||x<0){
            System.out.println("gecerli aci giriniz!");
            System.exit(0);
        }
        alan=(pi*r*r*x)/360;
        System.out.println("Dairenin Alani: "+alan);

    }
}