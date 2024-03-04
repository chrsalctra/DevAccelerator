def convert (prompt):
    while True:
        try:
            inp = prompt
            x,y = int(inp[0]), int(inp[1])
            if x > y or y == 0:
                continue
        except ValueError:
            raise ValueError
        except IndexError:
            raise IndexError
        except ZeroDivisionError:
            raise ZeroDivisionError
        else:
            div = x/y
            div = round(div *100)
            return (div)

def main():
    ans = input("Fraction? Format: X/Y: ").split('/')
    gage = convert(ans)
    print(gauge(gage))


def gauge(percentage):
    if percentage >= 99:
        return 'F'
    elif percentage <=1:
        return 'E'
    else:
        return f'{percentage}%'



if __name__ == "__main__":
    main()