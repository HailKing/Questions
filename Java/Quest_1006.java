/*
################################################################################################################################
############## Question's name: Média 2
############## Question's number: 1006
############## From: URI Online Judge
############## Author: Hércules de Sousa
############## Email: herculesdeso@gmail.com
############## Data: 18/04/2020
################################################################################################################################
*/

import java.util.Locale;
import java.util.Scanner;

public class Quest_1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        double a, b, c, MEDIA;
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        MEDIA = ((a * 2) + (b * 3) + (c * 5)) / 10;
        System.out.printf("MEDIA = %.1f%n", MEDIA);
    }
}
