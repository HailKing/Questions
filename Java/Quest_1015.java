/*
################################################################################################################################
############## Question's name: 1015
############## Question's number: Distância Entre Dois Pontos
############## From: URI Online Judge
############## Author: Hércules de Sousa
############## Email: herculesdeso@gmail.com
############## Data: 11/04/2020
################################################################################################################################
*/

import java.util.Scanner;

public class Quest_1015 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        String[] entrance = s1.nextLine().split(" ");

        double x1;
        double y1;

        x1 = Double.parseDouble(entrance[0]);
        y1 = Double.parseDouble(entrance[1]);
        entrance = s1.nextLine().split(" ");

        double x2;
        double y2;

        x2 = Double.parseDouble(entrance[0]);
        y2 = Double.parseDouble(entrance[1]);

        double result = Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));

        System.out.printf("%.4f\n", result);

        s.close();
        s1.close();
    }
}
