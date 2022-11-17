import java.util.Scanner;

public class evenNumber {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int sum=0,count=0;
            for(int i=0;i<n;i++){
                if(i%12==0) { //3 ve 4 e bolunen 12
                    System.out.println("bolunen: " + i);
                    sum += i;
                    count++;
                }
            }
            System.out.println("ortalama: "+sum/count);
        }

}
