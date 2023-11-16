import inflect
p = inflect.engine()
list_names = []

while True:
    try:
        name = input("Name: ")
        list_names.append(name)
    except EOFError:
        print()
        break
output = p.join(list_names)
print(f'Adieu, adieu, to {output}')