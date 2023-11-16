from twttr import shorten
import sys
import pytest


def main():
    try:
       # x = input("Input: ")
        test_word()

        print("Good!")
    except AssertionError:
        print("FAIL! (AssertionError!)")
        pass



def test_word():
    assert shorten("twitter") == "twttr"
    assert shorten("TWITTER") == "TWTTR"
    assert shorten("TwitTeR") == "TwtTR"

def test_numbers():
    assert shorten("1234") == "1234"
def test_punc():
    assert shorten("!") == "!"

if __name__ == "__main__":
    main()
