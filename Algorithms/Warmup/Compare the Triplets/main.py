#!/bin/python3

import sys

def solve(a0, a1, a2, b0, b1, b2):
    # Complete this function
    
    alice_points = 0
    bob_points = 0
    for a_val, b_val in zip([a0, a1, a2],[b0, b1, b2]):
        if a_val < b_val:
            bob_points += 1
        elif a_val > b_val:
            alice_points += 1

    return alice_points, bob_points

a0, a1, a2 = input().strip().split(' ')
a0, a1, a2 = [int(a0), int(a1), int(a2)]
b0, b1, b2 = input().strip().split(' ')
b0, b1, b2 = [int(b0), int(b1), int(b2)]
result = solve(a0, a1, a2, b0, b1, b2)
print (" ".join(map(str, result)))
