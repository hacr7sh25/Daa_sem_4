# Sorting Algorithms in Java

This project contains implementations of **QuickSort** and **MergeSort** algorithms in Java. Both programs sort an array using efficient divide-and-conquer approaches and print both the original (unsorted) and sorted arrays.

## 📌 Project Details
- **Repository Name:** daa_sem_4
- **Language Used:** Java
- **Algorithms Implemented:** QuickSort, MergeSort

## 📜 Code Explanation
The project consists of two Java files:

### 1️⃣ `QuickSortExample.java`
Implements the **QuickSort algorithm** with the following methods:

- **`quickSort(int[] arr, int low, int high)`**
  - Recursively sorts the array by partitioning it into smaller subarrays.
- **`partition(int[] arr, int low, int high)`**
  - Selects a pivot and arranges elements such that smaller elements are to the left and larger ones to the right.

### 2️⃣ `MergeSortExample.java`
Implements the **MergeSort algorithm** with the following methods:

- **`mergeSort(int[] arr, int left, int right)`**
  - Recursively divides the array into halves and sorts them.
- **`merge(int[] arr, int left, int mid, int right)`**
  - Merges two sorted halves into a single sorted array.

## 📥 How to Run the Programs
1. Clone this repository:
   ```sh
   git clone https://github.com/your-username/daa_sem_4.git
   ```
2. Navigate to the project folder:
   ```sh
   cd daa_sem_4
   ```
3. Compile the Java programs:
   ```sh
   javac QuickSortExample.java MergeSortExample.java
   ```
4. Run the Java programs:
   ```sh
   java QuickSortExample
   java MergeSortExample
   ```

## 📌 Expected Output
### QuickSort Output:
```
Original array: [38, 27, 43, 3, 9, 82, 10]
Sorted array: [3, 9, 10, 27, 38, 43, 82]
```

### MergeSort Output:
```
Original array: [38, 27, 43, 3, 9, 82, 10]
Sorted array: [3, 9, 10, 27, 38, 43, 82]
```

## 📝 Notes
- **QuickSort** has an average time complexity of **O(n log n)** but can degrade to **O(n²)** in the worst case.
- **MergeSort** has a consistent time complexity of **O(n log n)** and is stable but requires extra space.
- Both are efficient **divide-and-conquer sorting algorithms**.

## 📚 References
- [QuickSort - GeeksforGeeks](https://www.geeksforgeeks.org/quick-sort/)
- [MergeSort - GeeksforGeeks](https://www.geeksforgeeks.org/merge-sort/)
- [Sorting Algorithms - Wikipedia](https://en.wikipedia.org/wiki/Sorting_algorithm)

## 📌 Author
- **Harsh**
- **Jain University**

Happy Coding! 🚀

