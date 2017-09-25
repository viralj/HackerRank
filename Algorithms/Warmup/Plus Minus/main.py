#!/bin/python3

import sys


n = int(input().strip())
arr = [int(arr_temp) for arr_temp in input().strip().split(' ')]

print(format(len([x for x in arr if x > 0]) / n, ".6f"))
print(format(len([x for x in arr if x < 0]) / n, ".6f"))
print(format(len([x for x in arr if x == 0]) / n, ".6f"))
