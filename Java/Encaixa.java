/*
################################################################################################################################
############## Question's name: Encaixa ou Não II
############## Question's number: 1241
############## From: URI Online Judge
############## Author: Hércules de Sousa
############## Email: herculesdeso@gmail.com
############## Data: 08/04/2020
################################################################################################################################

*/

import java.util.Scanner;

public class Encaixa {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        int times = s1.nextInt();
        String[] entrance;
        for(int i = 0; i < times; i++){
            entrance = s2.nextLine().split(" ");
            if(entrance[0].length() < entrance[1].length()) System.out.println("nao encaixa");
            else{
                if(entrance[0].length() == entrance[1].length()){
                    if(entrance[0].equals(entrance[1])) System.out.println("encaixa");
                    else System.out.println("nao encaixa");
                }
                else{
                    if(entrance[1].equals(entrance[0].substring(entrance[0].length() - entrance[1].length()))) System.out.println("encaixa");
                    else System.out.println("nao encaixa");
                }
            }
        }
    }
}
