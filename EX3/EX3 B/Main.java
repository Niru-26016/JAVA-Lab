
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int Numerator;
        int Denominator;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter Numerator: ");
            Numerator = sc.nextInt();
            System.out.println("Enter Denominator: ");
            Denominator = sc.nextInt();
            System.out.printf("%d / %d = %d",Numerator,Denominator,Numerator/Denominator);
        }
        catch(ArithmeticException e){
            System.out.println("Can not Divide by 0");
        }
    }
}
