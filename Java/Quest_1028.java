/*
################################################################################################################################
############## Question's name: Figurinhas
############## Question's number: 1028
############## From: URI Online Judge
############## Author: Hércules de Sousa
############## Email: herculesdeso@gmail.com
############## Data: 12/04/2020
################################################################################################################################
*/

import java.util.Scanner;

public class Quest_1028 {

    public static int GCD(int n1, int n2){
        if(n2 == 0) return n1;
        return GCD(n2, n1 % n2);
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        int i, times = s1.nextInt();
        String[] entrance;

        for(i = 0; i < times; ++i){
            entrance = s2.nextLine().split(" ");
            System.out.println(GCD(Integer.parseInt(entrance[0]), Integer.parseInt(entrance[1])));
        }
    }
}
