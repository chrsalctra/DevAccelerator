from seasons import _dob

def main ():
    test_birth()

def test_birth():
    assert _dob("1997-11-11") != "Invalid Format"
    
if __name__ == "__main__":
    main()
