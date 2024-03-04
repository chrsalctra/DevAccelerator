import validators

def main():
    print(validate(input("Email?:").strip()))

def validate(address):
    if validators.email(address):
        return "valid"
    else:
        return "invalid"

if __name__ == "__main__":
    main()
