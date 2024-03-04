import emoji

def main ():
    ask = input("Input: ")
    print("Output: " + emoji.emojize(ask, language='alias'))



if __name__ == "__main__":
    main()