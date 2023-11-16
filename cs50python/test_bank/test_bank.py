from bank import value

def test_value():
    assert value("hello") == 0
def test_val2():
    assert value("How are you doing?") == 20
def test_val3():
    assert value("What's happening?") == 100


