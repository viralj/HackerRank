#!/bin/python3

import sys
from dateutil import parser

def timeConversion(s):
    # Complete this function
    d = parser.parse(s)
    return d.strftime("%T")

s = input().strip()
result = timeConversion(s)
print(result)
