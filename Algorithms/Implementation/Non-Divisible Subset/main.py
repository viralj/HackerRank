n, k = map(int, input().strip().split(" "))
nums = map(int, input().strip().split(" "))

cs = [0] * k
for num in nums:
    cs[num % k] += 1

c = min(cs[0], 1)
for i in range(1, k // 2 + 1):
    if i != k - i:
        c += max(cs[i], cs[k - i])
if k % 2 == 0:
    c += 1

print(c)
