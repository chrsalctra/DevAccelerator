def main():
    sn_ake = str(input ("camelCase: "))
    for characters in sn_ake:
        if characters.isupper()== True:
            print("_", end="")
            print (characters.lower(), end="")
        else:
            print(characters, end="")
    print("\n")
main()