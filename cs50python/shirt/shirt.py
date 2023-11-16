from PIL import Image, ImageOps
import sys


def main():
    check_cmd()
    formats = [".jpg", ".jpeg", ".png"]
    input = sys.argv[1].split('.')
    output = sys.argv[2].split('.')
    if input[1].lower() != output[1].lower():
        sys.exit("Input and output have different extensions")
    else:
        photo_edit(sys.argv[1], sys.argv[2])


def check_cmd():
    if len(sys.argv) < 3:
        sys.exit("Too few command-line arguments")
    if len(sys.argv) > 3:
        sys.exit("Too many command-line arguments")

def photo_edit(input, output):
    try:
        shirt = Image.open("shirt.png")
        with Image.open(input) as input:
            input_cropped = ImageOps.fit(input, shirt.size)
            input_cropped.paste(shirt, mask = shirt)
            input_cropped.save(output)
    except FileNotFoundError:
        sys.exit(f"Input does not exist")



if __name__ == "__main__":
    main()
