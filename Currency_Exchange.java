import java.util.Scanner;

public class Currency_Exchange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose one from the following options");
        System.out.println("1)USD($) to Euro(£)");
        System.out.println("2)Euro(€) to USD($)");
        System.out.println("3)Pounds(£) to USD($)");
        System.out.println("4)Euro(€) to Pounds(£)");
        System.out.println("5)Pounds(£) to Euros(€)");

        int exchange = sc.nextInt();
        switch (exchange) {
            case 1: {
                System.out.println("Enter the Number of USD");

                double usd = sc.nextDouble();

                if (usd >= 0) {
                    System.out.println(usd + "USD is " + usd * 0.908 + "£. ");

                } else {
                    System.out.println("Please put in positive numbers of USD");
                }
            }

                break;

            case 2: {
                System.out.println("Enter the Number of €");
                double euro = sc.nextDouble();

                if (euro >= 0) {
                    System.out.println(euro + "Euro(€) is " + euro * 0.908 + "USD. ");

                } else {
                    System.out.println("Please put in positive numbers of Euro (€)");
                }
            }
                break;

            case 3: {
                System.out.println("Enter the Number of Pounds(£)");
                double pounds = sc.nextDouble();

                if (pounds >= 0) {
                    System.out.println(pounds + "Pounds(£) is " + pounds * 1.220 + "USD. ");

                } else {

                    System.out.println("Please put in positive Number of Pounds(£)");
                }
            }
                break;
            case 4: {
                System.out.println("Enter the Number of Euros(€)");
                double eurotp = sc.nextDouble();

                if (eurotp >= 0) {

                    System.out.println(eurotp + "Euros(€) is    " + eurotp * 0.860 + "Pounds(£). ");
                } else {
                    System.out.println("Please put in positive Number of Euros(€)");
                }
            }
                break;
            case 5: {
                System.out.println("Enter the Number of Pounds(£)");
                double poundte = sc.nextDouble();

                if (poundte >= 0) {

                    System.out.println(poundte + "Pounds(£) is " + poundte * 1.12 + "Euros(€). ");
                } else {

                    System.out.println("Please put in positive Number of Pounds(£)");
                }
            }

        }
        sc.close();

    }
}
