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


def encrypt(text):
    return second(first(text)[::-1])


def reversed_second(t):
    new = str()

    for i in range(len(t)):
        if i < int(len(t) / 2):
            new += t[i]
        else:
            num = ord(t[i]) + 1
            new += chr(num)
    return new


def reversed_first(t):
    new = str()
    for i in t:
        if 62 <= ord(i) <= 93:
            number = ord(i) - 3
            new += chr(number)
        elif 94 <= ord(i) <= 125:
            number = ord(i) - 3
            new += chr(number)
        else:
            new += i
    return new


def decrypt(text):
    return reversed_first(reversed_second(text)[::-1])
