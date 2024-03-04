import random


def main():
    lvl = get_level()
    score = 0
    tries = 3
    for i in range (10):
        x, y = generate_integer(lvl)
        tries = 3
        while tries > 0:
            print(f'{x} + {y} = ', end="")
            answer = int(input())
            if answer == x+y:
                score +=1
                break
            else:
                tries -= 1
                print ("EEE")
                if (tries == 0):
                    print(f'{x} + {y} = ', int(x+y))
    print("Score: ", score)




def get_level():
    while True:
        try:
            lvl = int(input("Level: "))
            if lvl in [1,2,3]:
                break
        except:
            pass
    return lvl



def generate_integer(level):
    if level == 1:
        x = random.randint(0,9)
        y = random.randint(0,9)
    elif level == 2:
        x = random.randint(10,99)
        y = random.randint(10,99)
    else:
        x = random.randint(100,999)
        y = random.randint(100,999)
    return x, y


if __name__ == "__main__":
    main()
