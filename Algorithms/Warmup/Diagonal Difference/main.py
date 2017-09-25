#!/bin/python3

import sys


n = int(input().strip())
a = []
for a_i in range(n):
    a_t = [int(a_temp) for a_temp in input().strip().split(' ')]
    a.append(a_t)

b = c = d = 0    
for x in range(0,n):
    b += a[x][x]
    
for x in range(n,0,-1):
    c += a[x-1][d]
    d += 1
    
print(abs(b-c))
