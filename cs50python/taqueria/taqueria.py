menu = {
    "Baja Taco": 4.00,
    "Burrito": 7.50,
    "Bowl": 8.50,
    "Nachos": 11.00,
    "Quesadilla": 8.50,
    "Super Burrito": 8.50,
    "Super Quesadilla": 9.50,
    "Taco": 3.00,
    "Tortilla Salad": 8.00
}

total=0

while True:
    try:
        inp = str(input("Item: ")).lower().title()
        if inp in menu:
            total += menu[inp]
            print("Total: ${:0.2f}".format(total))
    except EOFError:
        print()
        break
    except ValueError:
        pass
    except NameError:
        pass
    except TypeError:
        pass
    except KeyError:
        pass
