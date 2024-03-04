dates = [
    "January",
    "February",
    "March",
    "April",
    "May",
    "June",
    "July",
    "August",
    "September",
    "October",
    "November",
    "December"
]

while True:
    try:
        inp = input("Date: ").strip()
        if inp[0].isnumeric():
            inp = inp.split("/")
            if len(inp) > 3 or len(inp) < 3: continue
            if int(inp[0]) > 12 or int(inp[0]) < 1: continue
            if int(inp[1]) > 31 or int(inp[1]) < 1: continue
            if int(inp[1]) <= 0: continue
        else:
            inp = inp.title().split(" ")
            if ',' not in inp[1]: continue
            inp[1] = inp[1].strip(',')
            if len(inp) > 3 or len(inp) < 2: continue
            if inp[0] not in dates: continue
            if int(inp[1]) < 1 or int(inp[1]) > 31: continue
            if int(inp[2]) < 0: continue
    except ValueError: pass
    except NameError: pass
    except TypeError: pass
    except KeyError: pass
    except IndexError: pass
    else:
        if inp[0].isnumeric():
            print(f'{inp[2]}-{int(inp[0]):02d}-{int(inp[1]):02d}')
            break
        else:
            print(f'{inp[2]}-{((dates.index(inp[0])) + 1):02d}-{int(inp[1]):02d}')
            break