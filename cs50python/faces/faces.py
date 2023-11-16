def main ():
    x = str(input())
    print(convert(x))
def convert (str):
    str = str.replace (":)", "🙂")
    str = str.replace (":(", "🙁")
    return str
main()