#!/bin/python3

import sys


n, k, q = input().strip().split(' ')
n, k, q = [int(n), int(k), int(q)]
a = [int(a_temp) for a_temp in input().strip().split(' ')]

z = []
for a0 in range(q):
    z.append(int(input().strip()))
    
if k > len(a):
    for x in range(k):
        a = a[-1:] + a[:-1]
else:
    a = a[len(a) - k:] + a[:len(a) - k]

for t in z:
    print(a[t])
