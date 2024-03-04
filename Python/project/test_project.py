import pytest
from project import insertionSort
from project import quickSort
from project import noInp


def test_insertionSort():
    assert insertionSort([1,2,3,1,9,2,7]) == [1,1,2,2,3,7,9]
def test_quickSort():
    assert quickSort([1,2,3,1,9,2,7]) == [1,1,2,2,3,7,9]

def test_noInp():
    assert noInp("") == ""
