import java.util.Scanner;
import java.text.DecimalFormat; 

public class MathMain {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter a begin number: ");
       int begin = scanner.nextInt();

       System.out.println("Enter an end number: ");
       int end = scanner.nextInt();

       long sum = getSumBetween(begin, end);
       System.out.printf("Sum between %d and %d : %,d%n" , begin, end, sum);

       long product = getProductBetween(begin, end);
       System.out.printf("Product between %d and %d : %,d%n", begin, end, product);
    }

    private static long getSumBetween(final int beg, final int ed) {
        long sum = 0L;
        for (int i = beg; i <= ed; i++)
            sum += i;

        return sum;
    }

    private static long getProductBetween(final int beg, final int ed) {
        long prod = 1L;
        for (int j = beg; j <= ed; j++)
            prod *= j;

        return prod;
    }
}
