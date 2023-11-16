
def main():
    jar = Jar()
    jar.deposit(3)
    jar.withdraw(1)
    print(jar)

class Jar:
    def __init__(self, capacity=12):
        if capacity < 0:
            raise ValueError("Value error: less than zero")
        self._capacity = capacity
        self._size = 0

    def __str__(self):
        return ("🍪" * self.size)

    def deposit(self, n):
        if (n + self.size > 12):
            raise ValueError ("Value error: exceeded capacity")
        else:
            self._size += n

    def withdraw(self, n):
        if (self.size < n):
            raise ValueError ("Value error: under capacity")
        else:
            self._size -= n

    @property
    def capacity(self):
        return self._capacity

    @property
    def size(self):
        return self._size

if __name__ == "__main__":
    main()
