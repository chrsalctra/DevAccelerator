import math

x,y,z = input("Interpreter: ").split()
x,y,z = int(x),str(y),int(z)
ans = 0.0

if y == "/":
    ans = float(x/z)
    print(ans)
elif y == "+":
    ans = x + z
    print(float(ans))
elif y == "*":
    ans = float(x*z)
    print(ans)
elif y == "-":
    ans = float(x-z)
    print(ans)
else:
    print("Error")
