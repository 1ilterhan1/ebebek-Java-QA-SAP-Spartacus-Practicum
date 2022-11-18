
public class avg {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0,Mean;
        for (int x : numbers) {
            sum += 1d/x;
        }
        Mean = numbers.length/sum;
        System.out.println("Ortalama : " + Mean);
    }

}