import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

lowest = 100000
n = int(input())  # the number of temperatures to analyse
if(n == 0):
    print(0)
else:
    for i in input().split():
        # t: a temperature expressed as an integer ranging from -273 to 5526
        t = abs(int(i))
        if t < abs(lowest):
            lowest = int(i)
        elif t == abs(lowest):
            if int(i) > 0:
                lowest = int(i)

    # Write an action using print
    # To debug: print("Debug messages...", file=sys.stderr)

    print(lowest)
