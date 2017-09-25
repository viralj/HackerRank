# Enter your code here. Read input from STDIN. Print output to STDOUT

s = input().strip()
t = input().strip()
k = int(input().strip())
for ol in reversed(range(1, k + 1)):
    if s == t[:len(s)] and len(t) - len(s) == ol or len(s) == 0:
        break
    s = s[:-1]
print("Yes" if len(t) - len(s) <= ol else "No")
