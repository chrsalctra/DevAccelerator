import random


def main ():
    while True:
        try:
            lev = int(input("Level: "))
            if lev > 0:
                break
        except:
            pass

    random_num = random.randint(1, lev)
    while True:
        try:
            guess = int(input("Guess: "))
            if guess > 0:
                if guess < random_num: print("Too small!")
                elif guess > random_num: print("Too large!")
                else:
                    print ("Just right!")
                    break
        except:
            pass




if __name__ == "__main__":
    main()