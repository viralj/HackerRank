n = int(input())
A = list(map(int, input().split()))

print(n - max([A.count(t) for t in set(A)]))
