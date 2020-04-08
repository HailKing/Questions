/*
################################################################################################################################
############## Question's name: Alarm Clock
############## From: The Huxley
############## Author: Hércules de Sousa
############## Email: herculesdeso@gmail.com
############## Data: 06/04/2020
################################################################################################################################
*/

import java.util.Scanner;

public class Alarm_Clock {

    public static int func(int h1, int m1, int h2, int m2){
        return ((h2 - h1) * 60) + (m2 - m1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h1, h2, m1, m2, result = 0;
        String entrance;
        String[] e;
        entrance = s.nextLine();
        while(!entrance.equals("0 0 0 0")){
            e = entrance.split(" ");
            h1 = Integer.parseInt(e[0]);
            m1 = Integer.parseInt(e[1]);
            h2 = Integer.parseInt(e[2]);
            m2 = Integer.parseInt(e[3]);

            if(h1 == 0) h1 = 24;
            if(h2 == 0) h2 = 24;

            if(h1 < h2){
                result = func(h1, m1, h2, m2);
            }
            if(h1 > h2){
                result = func(0, m1, 24 - (h1 - h2), m2);
            }
            if(h1 == h2){
                if(m1 == m2) result = 0;
                if(m1 > m2) result = func(0, m1, 24, m2);
                else result = func(h1, m1, h2, m2);
            }
            System.out.println(result);
            entrance = s.nextLine();
        }
    }
}
