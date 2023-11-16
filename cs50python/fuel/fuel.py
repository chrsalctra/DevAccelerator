def convert (prompt):
    while True:
        try:
            inp = str(input(prompt)).split("/")
            x,y = int(inp[0]), int(inp[1])
            if x > y or y == 0:
                continue
        except ValueError:
            pass
        except IndexError:
            pass
        else:
            div = x/y
            div = round(div *100)
            return (div)

def main ():
    gage = convert("Fraction? Format: X/Y: ")
    if gage >= 99:
        gage = 'F'
        print (f'{gage}')
    elif gage <=1:
        gage = 'E'
        print (f'{gage}')
    else:
        print (f'{gage}%')

main()