import java.util.Scanner;

public class Burc {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int day, month,sumDay = 0;
        String result;

        System.out.print("Doğduğunuz ayı giriniz : ");
        month = input.nextInt();
        System.out.print("Doğduğunuz günü giriniz : ");
        day = input.nextInt();

        switch (month)
        {
            case 1: if(day <= 31) sumDay = day;break;
            case 2: if(day <= 28) sumDay = day + 31;break;
            case 3: if(day <= 31) sumDay = day + 59;break;
            case 4: if(day <= 30) sumDay = day + 90;break;
            case 5: if(day <= 31) sumDay = day + 120;break;
            case 6: if(day <= 30) sumDay = day + 151;break;
            case 7: if(day <= 31) sumDay = day + 181;break;
            case 8: if(day <= 31) sumDay = day + 212;break;
            case 9: if(day <= 30) sumDay = day + 243;break;
            case 10: if(day <= 31) sumDay = day + 273;break;
            case 11: if(day <= 30) sumDay = day + 304;break;
            case 12: if(day <= 31) sumDay = day + 334;break;
            default:  break;
        }

        if(sumDay != 0)
        {
            if(sumDay <= 21) result = "Oğlak";
            else if(sumDay <= 50) result = "Kova";
            else if(sumDay <= 79) result = "Balık";
            else if(sumDay <= 110) result = "Koç";
            else if(sumDay <= 141) result = "Boğa";
            else if(sumDay <= 173) result = "İkizler";
            else if(sumDay <= 203) result = "Yengeç";
            else if(sumDay <= 234) result = "Aslan";
            else if(sumDay <= 265) result = "Başak";
            else if(sumDay <= 295) result = "Terazi";
            else if(sumDay <= 325) result = "Akrep";
            else if(sumDay <= 355) result = "Yay";
            else result = "Oğlak";

            System.out.println("Burcunuz : "+result);
        }

        else
        {
            System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz.");
        }

    }
}
