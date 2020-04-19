/*
################################################################################################################################
############## Question's name:
############## Question's number: 1252
############## From: URI Online Judge
############## Author: Hércules de Sousa
############## Email: herculesdeso@gmail.com
############## Data: 08/04/2020
################################################################################################################################
*/

import java.util.Scanner;

public class Quest_1007 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c, d, DIFERENCA;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = s.nextInt();
        DIFERENCA = ((a * b) - (c * d));
        System.out.printf("DIFERENCA = %d\n", DIFERENCA);
    }
}
