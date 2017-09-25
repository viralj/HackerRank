#!/bin/python3

import sys


n = int(input().strip())
[print(("#" * f).rjust(n)) for f in range(1, n + 1)]
