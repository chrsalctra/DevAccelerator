import sys
import csv

def main():
    check_cmd()
    newcsvlist = []
    try:
        with open(sys.argv[1], "r") as file:
            read = csv.DictReader(file)
            for row in read:
                last,first = row['name'].split(', ')
                house = row['house']
                newcsvlist.append({'first': first, 'last' : last, 'house': house})
        with open(sys.argv[2],'w') as outfile:
            write = csv.DictWriter(outfile,fieldnames=['first','last','house'])
            write.writeheader()
            for row in newcsvlist:
                write.writerow(row)
    except FileNotFoundError:
        sys.exit("File does not exist")


def check_cmd():
    if len(sys.argv) < 3:
        sys.exit("Too few command-line arguments")
    if len(sys.argv) > 3:
        sys.exit("Too many command-line arguments")
    if ".csv" not in sys.argv[1]:
        sys.exit("Not a csv file")

if __name__ == "__main__":
    main()
