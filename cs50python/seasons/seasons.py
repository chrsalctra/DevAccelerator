import sys
import datetime
import inflect
p = inflect.engine()

def main():
    dob = input("DOB?: ")
    birth_date = _dob(dob)
    today_date = datetime.date.today()
    diff_days = (today_date - birth_date)
    total_mins = diff_days.days * 24 * 60
    words = p.number_to_words(total_mins, andword="")
    print (words.capitalize() + " minutes")

def _dob (dob):
    try:
        date = datetime.datetime.strptime(dob, '%Y-%m-%d').date()
        return date
    except:
        sys.exit("Invalid Format")



if __name__  == "__main__":
    main()
