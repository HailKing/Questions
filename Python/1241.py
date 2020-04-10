################################################################################################################################
############## Question's name: Encaixa ou Não II
############## Question's number: 1241
############## From: URI Online Judge
############## Author: Hércules de Sousa
############## Email: herculesdeso@gmail.com
############## Data: 08/04/2020
################################################################################################################################

for i in range(int(input())):
    entrance = input().split()
    first = entrance[0]
    second = entrance[1]
    if len(first) < len(second):
        print("nao encaixa")
    else:
        if first == second:
            print("encaixa")
        else:
            if first[-len(second):] == second:
                print("encaixa")
            else:
                print("nao encaixa")