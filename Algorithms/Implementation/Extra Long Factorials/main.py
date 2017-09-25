# Enter your code here. Read input from STDIN. Print output to STDOUT

n = int(input().strip())


def fact(n):
    if (n == 1):
        return 1
    return n * fact(n - 1)


print(fact(n))
