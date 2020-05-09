/*
################################################################################################################################
############## Question's name: Cálculo Simples
############## Question's number: 1010
############## From: URI Online Judge
############## Author: Hércules de Sousa
############## Email: herculesdeso@gmail.com
############## Data: 09/05/2020
################################################################################################################################
*/

import java.util.Locale;
import java.util.Scanner;

public class Quest_1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s1 = new Scanner(System.in);
        float value, result = 0;
        int times;
        String[] entrance = s1.nextLine().split(" ");
        times = Integer.parseInt(entrance[1]);
        value = Float.parseFloat(entrance[2]);
        result += times * value;
        entrance = s1.nextLine().split(" ");
        times = Integer.parseInt(entrance[1]);
        value = Float.parseFloat(entrance[2]);
        result += times * value;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", result);
        s1.close();
    }
}
