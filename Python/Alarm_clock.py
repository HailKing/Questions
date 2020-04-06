################################################################################################################################
############## Question's name: Alarm Clock
############## From: The Huxley
############## Author: Hércules de Sousa
############## Email: herculesdeso@gmail.com
############## Data: 15/10/2019 
################################################################################################################################

def simplifying(arr):
    hours = arr[2] - arr[0]
    minutes = arr[3] - arr[1]
    print(hours * 60 + minutes)

while True:
    entry = input()
    if(entry == '0 0 0 0'): break
    entry = entry.split()
    for x in range(len(entry)):
        entry[x] = int(entry[x])
        if(entry[0] == 0): entry[0] = 24
        if(entry[2] == 0): entry[2] = 24
    if(entry[2] > entry[0]):
        simplifying(entry)
    elif(entry[2] == entry[0] and entry[1] > entry[3]):
        hours = 24 * 60
        minutes = entry[3] - entry[1]
        print(hours + minutes)
    elif(entry[2] == entry[0] and entry[1] == entry[3]):
        print(0)
    elif(entry[0] == entry[2]):
        simplifying(entry)
    else:
        hours = 24 - (entry[0] - entry[2])
        minutes = entry[3] - entry[1]
        print(hours * 60 + minutes)