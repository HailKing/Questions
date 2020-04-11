/*
################################################################################################################################
############## Question's name: Distância Entre Dois Pontos
############## Question's number: 1015
############## From: URI Online Judge
############## Author: Hércules de Sousa
############## Email: herculesdeso@gmail.com
############## Data: 11/04/2020
################################################################################################################################
*/



#include<stdio.h>
#include<math.h>

int main(){

  double x1, x2, y1, y2, result;

  scanf("%lf %lf", &x1, &y1);
  scanf("%lf %lf", &x2, &y2);

  result = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));

  printf("%.4lf\n", result);

  return 0;
}