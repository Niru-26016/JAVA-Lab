
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        currency cur = new currency();
        int choose = 0;
        int select = 0;
        int ammount;
        while (choose != 4) {
            System.out.println("Choose option 1 to 3:");
            System.out.println("1.Currency Converter");
            System.out.println("2.Distance Converter");
            System.out.println("3.Time Converter");
            System.out.println("4.Exit");
            choose = sc.nextInt();

            switch (choose) {
                case 1 -> {
                    while (select != 7) {
                        System.out.println("Choose option 1 to 3:");
                        System.out.println("1.USD To INR");
                        System.out.println("2.EUR To INR");
                        System.out.println("3.YEN To INR");
                        System.out.println("4.INR To USD");
                        System.out.println("5.INR To EUR");
                        System.out.println("6.INR To YEN");
                        System.out.println("7.Back");
                        select = sc.nextInt();
                        switch (select) {
                            case 1 -> {
                                System.out.println("Enter the Ammount: ");
                                cur.USDtoINR();
                            }
                            case 2 -> {
                                System.out.println("Enter the Ammount: ");
                                cur.EURtoINR();
                            }
                            case 3 -> {
                                System.out.println("Enter the Ammount: ");
                                cur.YENtoINR();
                            }
                            case 4 -> {
                                System.out.println("Enter the Ammount: ");
                                cur.INRtoUSD();
                            }
                            case 5 -> {
                                System.out.println("Enter the Ammount: ");
                                cur.INRtoEUR();
                            }
                            case 6 -> {
                                System.out.println("Enter the Ammount: ");
                                cur.INRtoYEN();
                            }
                            case 7 -> {
                                ammount = 4;
                            }
                        }

                    }
                }
                case 2 ->
                    System.out.println("case 1");
                case 3 ->
                    System.out.println("case 1");
                case 4 -> {
                    choose = 4;
                    System.out.println("Exited");
                }
            }

        }
    }
}
