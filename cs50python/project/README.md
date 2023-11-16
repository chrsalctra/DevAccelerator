# SORT ALGS
    #### Video Demo:  <"https://www.youtube.com/watch?v%253D6pgodt1mezg">
    #### Description:
    a program that takes sys arguments starting with python, name of the file, then any amount of numbers and the name
    of two algorithms, quick or insertion after the numbers. the program returns the sorted list and type of sort its running
    it will be invalid if the conditions are not met. For example, python project.py 1 2 3 4 5 6 7 insertion is a valid input
    and so as python project.py 1 2 6 3 9 7 4 quick but python project.py or python project.py cat is NOT valid.

    The quicksort is a sorting method that has the divide-and-conquer strategy.
    It starts by selecting a pivot element from the list, then rearranges the list so that the elements
    smaller than the pivot are on the left, and elements greater than the pivot are on the right.
    This process is recursively applied to the sub-arrays on both sides of the pivot until the base case
    is met (when a sub-list has 0 or 1 elements, it is considered sorted). While the basic implementation
    involves selecting the first element as the pivot, variations exist to optimize performance, taking into
    account factors such as pivot selection and positioning. The provided Python code is a simple implementation
    of the quicksort algorithm showcasing the essential steps of partitioning and recursion.

    The insertion sort is a technique that builds the final sorted list one element at a time.
    It iterates through the input list, considering one element at a time and efficiently placing
    it in its correct position relative to the already sorted elements. The algorithm maintains
    a growing sorted region and repeatedly compares the current element with those in the sorted part,
    moving elements to make space for the current element until it finds its proper place.
    This process continues until all elements are sorted. Its time complexity grows
    with the size of the input array, making it less efficient for large datasets
    compared to more advanced sorting algorithms.
