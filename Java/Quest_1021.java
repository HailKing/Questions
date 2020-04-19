/*
################################################################################################################################
############## Question's name: Notas e moedas
############## Question's number: 1021
############## From: URI Online Judge
############## Author: Hércules de Sousa
############## Email: herculesdeso@gmail.com
############## Data: 19/04/2020
################################################################################################################################
*/

import java.util.Locale;
import java.util.Scanner;

public class Quest_1021 {

    public static double convert(double n, double d){
        return Double.parseDouble(String.format("%.2f", n - (d * (int)(n / d))));
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        String e;
        double n1 = 0;
        n1 = s.nextDouble();

        System.out.println("NOTAS:");

        System.out.printf("%d nota(s) de R$ 100.00\n", ((int) n1 / 100));
        n1 = convert(n1, 100);

        System.out.printf("%d nota(s) de R$ 50.00\n", ((int) n1 / 50));
        n1 = convert(n1, 50);

        System.out.printf("%d nota(s) de R$ 20.00\n", ((int) n1 / 20));
        n1 = convert(n1, 20);

        System.out.printf("%d nota(s) de R$ 10.00\n", ((int) n1 / 10));
        n1 = convert(n1, 10);

        System.out.printf("%d nota(s) de R$ 5.00\n", ((int) n1 / 5));
        n1 = convert(n1, 5);

        System.out.printf("%d nota(s) de R$ 2.00\n", ((int) n1 / 2));
        n1 = convert(n1, 2);

        System.out.println("MOEDAS:");

        System.out.printf("%d moeda(s) de R$ 1.00\n", ((int) n1));
        n1 = convert(n1, 1);

        System.out.printf("%d moeda(s) de R$ 0.50\n", ((int) (n1 / 0.5)));
        n1 = convert(n1, 0.5);

        System.out.printf("%d moeda(s) de R$ 0.25\n", ((int) (n1 / 0.25)));
        n1 = convert(n1, 0.25);

        System.out.printf("%d moeda(s) de R$ 0.10\n", ((int) (n1 / 0.1)));
        n1 = convert(n1, 0.1);

        System.out.printf("%d moeda(s) de R$ 0.05\n", ((int) (n1 / 0.05)));
        n1 = convert(n1, 0.05);

        System.out.printf("%d moeda(s) de R$ 0.01\n", ((int) (n1 / 0.01)));
        n1 = convert(n1, 0.01);

        s.close();
    }
}
