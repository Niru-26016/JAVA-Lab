
import java.util.Scanner;

// Fibonacci  series using non-recursive
class EX1B {

    public static void main(String[] args) {

        int a = 0, b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int n = sc.nextInt();
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {

            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        sc.close();
    }
}
