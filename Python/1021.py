################################################################################################################################
############## Question's name: Notas e Moedas
############## Question's number: 1021
############## From: URI Online Judge
############## Author: Hércules de Sousa
############## Email: herculesdeso@gmail.com
############## Data: 19/04/2020
################################################################################################################################


n = float(input())

print("NOTAS:")

print("{} nota(s) de R$ 100.00".format(int(n / 100)))
n -= 100 * int(n / 100)

print("{} nota(s) de R$ 50.00".format(int(n / 50)))
n -= 50 * int(n / 50)

print("{} nota(s) de R$ 20.00".format(int(n / 20)))
n -= 20 * int(n / 20)

print("{} nota(s) de R$ 10.00".format(int(n / 10)))
n -= 10 * int(n / 10)

print("{} nota(s) de R$ 5.00".format(int(n / 5)))
n -= 5 * int(n / 5)

print("{} nota(s) de R$ 2.00".format(int(n / 2)))
n -= 2 * int(n / 2)

print("MOEDAS:")

n *= 100

print("{} moeda(s) de R$ 1.00".format(int(n / 100)))
n -= 100 * int(n / 100)

print("{} moeda(s) de R$ 0.50".format(int(n / 50)))
n -= 50 * int(n / 50)

print("{} moeda(s) de R$ 0.25".format(int(n / 25)))
n -= 25 * int(n / 25)

print("{} moeda(s) de R$ 0.10".format(int(n / 10)))
n -= 10 * int(n / 10)

print("{} moeda(s) de R$ 0.05".format(int(n / 5)))
n -= 5 * int(n / 5)

print("{} moeda(s) de R$ 0.01".format(int(n)))