import java.util.Arrays;

public class QuickSortExample {
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        
        // Print the original array
        System.out.println("Original array: " + Arrays.toString(arr));
        
        // Perform QuickSort
        quickSort(arr, 0, arr.length - 1);
        
        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
