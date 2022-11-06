import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your math grade: ");
        int math = scan.nextInt();

        System.out.print("Please enter your physics grade: ");
        int physics = scan.nextInt();

        System.out.print("Please enter your chemistry grade: ");
        int chemistry = scan.nextInt();

        System.out.print("Please enter your Turkish grade: ");
        int turkish = scan.nextInt();

        System.out.print("Please enter your history grade: ");
        int history = scan.nextInt();

        System.out.print("Please enter your music grade: ");
        int music = scan.nextInt();

        int total = (math + physics + chemistry + turkish + history + music);
        int average = (total / 6);

        System.out.println("Your average grade is: " + average);

        System.out.println(average>60?"Sinifi Gecti":"Sinifta Kaldi");



    }
}