import sys
"""
program that: sys.argv v to take python project.py some_number_here_sep_by_spaces typeofsorthere
"""

def main():
	if len(sys.argv) <2:
			sys.exit("No commands entered!")
	lst = []
	try:
		for _ in range(1, len(sys.argv)-1):
			lst.append(sys.argv[_])
		type_lst = str(sys.argv[-1])
		if type_lst.upper() == "INSERTION":
			print("\nRUNNING INSERTION SORT\n")
			print(insertionSort(lst))
		elif type_lst.upper() == "QUICK":
			print('\nRUNNING QUICK SORT\n')
			print(quickSort(lst))
		else:
			print("unknown sort type...", lst)
	except:
		sys.exit("Invalid list or could not sort")

def quickSort(seq):
	length=len(seq)
	if length <= 1:
		return seq
	else:
		pivot=seq.pop()
	left = []
	right=[]
	for item in seq:
		if item > pivot:
			right.append(item)
		else:
			left.append(item)
	return quickSort(left) + [pivot] + quickSort(right)


def insertionSort(seq):
	n = len(seq)
	if n <= 1:
		return
	for i in range(1, n):
		key = seq[i]
		j = i-1
		while j >= 0 and key < seq[j]:
			seq[j+1] = seq[j]
			j -= 1
		seq[j+1] = key
	return seq

def noInp(string_name):
	return string_name

if __name__ == "__main__":
	main()

