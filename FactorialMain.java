import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Enter a number: ");
        for (int i = 1; i <= n; i++) {
            System.out.println("Factorial of "+i+" = "+getFactorial(i));
        }
    }

    private static long getFactorial(final int n) {
        int su = 1;
        for (int j = 1; j <= n; j++){
            su = su*j;
        }
        return su;
    }
}
