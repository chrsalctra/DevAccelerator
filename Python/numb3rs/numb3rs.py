def main():
    inp = input("IPv4 Address: ").strip()
    print(str(validate(inp)))


def validate(inp):
    try:
        ip_div = inp.split(".")
        if len(ip_div) < 4 or len(ip_div) > 4:
            return False
        for s in ip_div:
            if int(s) > 255:
                return False
    except ValueError:
        return False
    return True

if __name__ == "__main__":
    main()
