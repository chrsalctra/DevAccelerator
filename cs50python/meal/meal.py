def main ():
    time = input("What time is it?: ")
    numberOfHours = convert(time)
    if numberOfHours >= 7.0 and numberOfHours<= 8.0:
        print("breakfast time")
    elif numberOfHours >=12.0 and numberOfHours <= 13.0:
        print("lunch time")
    elif numberOfHours >= 18.0 and numberOfHours <= 19.0:
        print("dinner time")
    else:
        print("no time to eat")
def convert(time):
    hours, minutes = time.split(":")
    time = int(hours) + (int(minutes)/60)
    return time

if __name__ == "__main__":
    main()

    