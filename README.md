# QuickSort Implementation in Java

This project contains an implementation of the **QuickSort algorithm** in Java. The program sorts an array using the divide-and-conquer approach and prints both the original (unsorted) and sorted arrays.

## 📌 Project Details
- **Repository Name:** daa_sem_4
- **Language Used:** Java
- **Algorithm Implemented:** QuickSort

## 📜 Code Explanation
The project consists of a single Java file: `QuickSortExample.java`, which implements QuickSort with the following methods:

1. **`quickSort(int[] arr, int low, int high)`**
   - Recursively sorts the array by partitioning it into smaller subarrays.

2. **`partition(int[] arr, int low, int high)`**
   - Selects a pivot and arranges elements such that smaller elements are to the left and larger ones to the right.

## 📥 How to Run the Program
1. Clone this repository:
   ```sh
   git clone https://github.com/your-username/daa_sem_4.git
   ```
2. Navigate to the project folder:
   ```sh
   cd daa_sem_4
   ```
3. Compile the Java program:
   ```sh
   javac QuickSortExample.java
   ```
4. Run the Java program:
   ```sh
   java QuickSortExample
   ```

## 📌 Expected Output
```
Original array: [38, 27, 43, 3, 9, 82, 10]
Sorted array: [3, 9, 10, 27, 38, 43, 82]
```

## 📝 Notes
- QuickSort has an **average time complexity of O(n log n)**.
- It is an **in-place sorting algorithm**.
- The worst-case complexity is **O(n²)** when the pivot selection is poor.

## 📚 References
- [QuickSort - GeeksforGeeks](https://www.geeksforgeeks.org/quick-sort/)
- [QuickSort - Wikipedia](https://en.wikipedia.org/wiki/Quicksort)

## 📌 Author
- **Harsh Vardhan Jaiswal**
- **Jain University**

Happy Coding! 🚀

