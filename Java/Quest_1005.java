/*
################################################################################################################################
############## Question's name: Média 1
############## Question's number: 1005
############## From: URI Online Judge
############## Author: Hércules de Sousa
############## Email: herculesdeso@gmail.com
############## Data: 18/04/2020
################################################################################################################################
*/

import java.util.Locale;
import java.util.Scanner;

public class Quest_1005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        double a, b, MEDIA;
        a = s.nextDouble();
        b = s.nextDouble();
        MEDIA = ((a * 3.5) + (b * 7.5)) / 11;
        System.out.printf("MEDIA = %.5f%n", MEDIA);
        s.close();
    }
}
