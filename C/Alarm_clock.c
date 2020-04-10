/*
################################################################################################################################
############## Question's name: Alarm Clock
############## From: The Huxley
############## Author: Hércules de Sousa
############## Email: herculesdeso@gmail.com
############## Data: 08/04/2020 
################################################################################################################################
*/

#include<stdio.h>

int calculate(int h1, int m1, int h2, int m2){
  return (h2 - h1) * 60 + (m2 - m1);
}

int main(){
    int h1, m1, h2, m2;

    while(1){
      scanf("%d %d %d %d", &h1, &m1, &h2, &m2);

      if(h1 == 0 && h2 == 0 && m1 == 0 && m2 == 0) break;

      if(h1 == 0) h1 = 24;
      if(h2 == 0) h2 = 24;

      if(h1 < h2){
        printf("%d\n", calculate(h1, m1, h2, m2));
      }
      if(h2 < h1){
        printf("%d\n", calculate(0 , m1, 24 - (h1 - h2), m2));
      }
      if(h1 == h2){
        if(m1 == m2) printf(0);
        if(m1 > m2) printf("%d\n", calculate(0, m1, 24, m2));
        if(m1 < m2) printf("%d\n", calculate(h1, m1, h2, m2));
      }
    }
    
    return 0;
}