import math
left = 50
while True:
    deposit = int(input("Insert Coin: "))
    if (deposit == 25 or deposit == 10 or deposit == 5):
        left -= deposit
        if (left > 0):
            print(f'Amount Due: {left}')
        if left <= 0:
            print(f'Change Owed: {abs(left)}')
            break
    else:
        print(f'Amount Due: {abs(left)}')





