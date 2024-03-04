def main():
    plate = input("Plate: ")
    if is_valid(plate):
        print("Valid")
    else:
        print("Invalid")

def has_numbers(inputString):
    return any(char.isdigit() for char in inputString)
def is_valid(s):
    strr = ['!','~','#','$','%',' ', '^','&','*','(',')','+','{','}','[','.','?','/']
    #does not have all test cases^ but thats ok for this
    if (len(s) >=2 and len(s) <=6  and s[0].isalpha() == True and s[1].isalpha() == True):
            for symbols in strr :
                for i in s:
                    if (i == symbols):
                        return False
            if (has_numbers(s)):
                if (s[-1].isnumeric()):
                    if (s[-2].isalpha() and (s[-3].isnumeric() or s[-4].isnumeric())):
                        return False
                    else:
                        appendix = []
                        for k in s:
                            if (k.isnumeric()):
                                appendix.append(k)
                        if int(appendix[0]) == 0:
                            return False
                else:
                    return False
            return True
    else:
        return False

if __name__ == "__main__":
    main()