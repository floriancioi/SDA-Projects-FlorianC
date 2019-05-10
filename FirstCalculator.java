import java.util.Scanner;

public class FirstCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti primul numar :");

        String nr1 = sc.nextLine();
        System.out.println("Alegeti operatiunea ( +,-,*,/)");
        String o = sc.nextLine();
        System.out.println("Introudceti al doilea nr:");
        String nr2 = sc.nextLine();
        double v1=Double.parseDouble(nr1);
        double v2=Double.parseDouble(nr2);
        do {

            if (o.equals("+")) {
                v1 = v1 + v2;
            } else if (o.equals("-")) {
                v1 = v1 - v2;

            } else if (o.equals("*")) {
                v1 = v1 * v2;

            } else if (o.equals("/")) {
                v1 = v1 / v2;

            }

            System.out.println("Rezultaul este:" + v1);

            System.out.println("Alegeti operatiunea ( +,-,*,/)");
            o = sc.nextLine();

            if (o.equals("exit")){
                break;

            }
            System.out.println("Introudceti al doilea nr:");
            nr2 = sc.nextLine();
            if (!nr2.equals("exit")){
                v2=Double.parseDouble(nr2);
            }


        }while (!nr2.equals("exit"));

        }

   }




