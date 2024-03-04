import requests
import sys


def bitcoin(n):
    try:
        o = requests.get("https://api.coindesk.com/v1/bpi/currentprice.json").json()
        return (o["bpi"]["USD"]["rate_float"]) * n
    except requests.RequestException:
        print("Something went wrong with this request!")
        pass
    return 0


def main():
    if len(sys.argv) <= 1:
        print("Missing command-line argument")
        sys.exit(1)
    elif len(sys.argv) > 2:
        print("Too many arguments")
        sys.exit(1)
    else:
        try:
            n = float(sys.argv[1])
        except:
            print("Command-line argument is not a number")
            sys.exit(1)
        print(f"${bitcoin(n):,.4f}")


if __name__ == "__main__":
    main()
