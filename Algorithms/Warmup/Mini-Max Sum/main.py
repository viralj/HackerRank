#!/bin/python3

import sys

arr = list(map(int, input().strip().split(' ')))
x = sum(arr)
print(x - (max(arr)), x - (min(arr)))
