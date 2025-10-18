
import java.util.Scanner;

// Fibonacci  series using non-recursive
class EX1B {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {

            System.out.println(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}
