
import java.util.Scanner;

public class currency {

    Scanner sc = new Scanner(System.in);
    double ammount;
    double USD = 87.8;
    double EUR = 102.3;
    double YEN = 0.58;

    void USDtoINR() {
        ammount = sc.nextDouble();
        System.out.printf("%.3f INR\n", ammount * USD);
    }

    void EURtoINR() {
        ammount = sc.nextDouble();
        System.out.printf("%.3f INR\n", ammount * EUR);
    }

    void YENtoINR() {
        ammount = sc.nextDouble();
        System.out.printf("%.3f INR\n", ammount * YEN);
    }

    void INRtoUSD() {
        ammount = sc.nextDouble();
        System.out.printf("%.3f USD\n", ammount / USD);
    }

    void INRtoEUR() {
        ammount = sc.nextDouble();
        System.out.printf("%.3f EUR\n", ammount / EUR);
    }

    void INRtoYEN() {
        ammount = sc.nextDouble();
        System.out.printf("%.3f YEN\n", ammount / YEN);
    }

}
