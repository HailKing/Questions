################################################################################################################################
############## Question's name: Criptografia
############## Question's number: 1024
############## From: URI Online Judge
############## Author: Hércules de Sousa
############## Email: herculesdeso@gmail.com
############## Data: 20/04/2020
################################################################################################################################

times = int(input())


def first(t):
    new = str()
    for i in t:
        if 65 <= ord(i) <= 90:
            number = ord(i) + 3
            new += chr(number)
        elif 97 <= ord(i) <= 122:
            number = ord(i) + 3
            new += chr(number)
        else:
            new += i
    return new


def second(t):
    new = str()
    for i in range(len(t)):
        if i < int(len(t) / 2):
            new += t[i]
        else:
            num = ord(t[i]) - 1
            new += chr(num)
    return new


for i in range(times):
    t = input()
    t = first(t)[::-1]
    print(second(t))
