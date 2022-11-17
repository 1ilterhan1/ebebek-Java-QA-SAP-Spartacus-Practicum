
import java.util.Scanner;

public class atm {

    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullan�c� Ad�n�z :");
            userName = input.nextLine();
            System.out.print("Parolan�z : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankas�na Ho�geldiniz!");
                do {
                    System.out.println("1-Para yat�rma\n" +
                            "2-Para �ekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-��k�� Yap");
                    System.out.print("L�tfen yapmak istedi�iniz i�lemi se�iniz : ");
                    select = input.nextInt();

                    int price;
                    switch (select)
                    {
                        case 1:
                            System.out.print("Para miktar� : ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktar� : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            } break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }

                } while (select != 4);
                System.out.println("Tekrar g�r��mek �zere.");
                break;
            } else {
                right--;
                System.out.println("Hatal� kullan�c� ad� veya �ifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesab�n�z bloke olmu�tur l�tfen banka ile ileti�ime ge�iniz.");
                } else {
                    System.out.println("Kalan Hakk�n�z : " + right);
                }
            }
        }

    }

}