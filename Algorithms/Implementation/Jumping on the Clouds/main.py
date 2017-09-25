import sys


n = int(input().strip())
c = [int(c_temp) for c_temp in input().strip().split(' ')]

z = -1
i = 0
while i < n:
    if i < n - 2 and c[i + 2] == 0: i += 1
    z += 1
    i += 1
print(z)
