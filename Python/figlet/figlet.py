from pyfiglet import Figlet
import sys
import random

figlet = Figlet()

def seeFont(str):
    for item in figlet.getFonts():
        if item == str:
            return True
    return false

def main ():
    if len(sys.argv) == 1:
        my_font = random.choice(figlet.getFonts())
        figlet.setFont(font=my_font)
    elif len(sys.argv) == 3 and (sys.argv[1] == "-f" or sys.argv[1] == "--font") and (seeFont(sys.argv[2]) == True):
        figlet.setFont(font=sys.argv[2])
    else:
        print("Invalid!")
        sys.exit(1)

    ask = input("Input: ")
    print(figlet.renderText(ask))



if __name__ == "__main__":
    main()