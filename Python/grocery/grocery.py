dict = {}
order=[]
while True:
    try:
        inp = str(input()).upper().strip()
        if inp in dict:
            dict[inp] += 1
        else:
            dict[inp] = 1
    except EOFError:
        for re_order in dict:
            order.append(re_order)
            order = sorted(order)
        for item in order:
            print(dict[item], item)
        break
    except ValueError:
        pass
    except NameError:
        pass
    except TypeError:
        pass
    except KeyError:
        pass