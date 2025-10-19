
import java.util.Scanner;

class EX1A {

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        n = sc.nextInt();
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }

    }

}
