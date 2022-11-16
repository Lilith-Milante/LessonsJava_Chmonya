package HW5;

// 3. Реализовать алгоритм пирамидальной сортировки (HeapSort).

import java.util.logging.Logger;

public class HomeWork5Task3 {
    public static void main(String[] args) {
        int arr[] = {14, 666, 52, 98, 5, 21, 3, 121};

        Logger logger4 = Logger.getAnonymousLogger();
        logger4.info(arrToString((arr)));
        toSort(arr);
        logger4.info("Heap sort is done!");
        logger4.info(arrToString((arr)));
    }

    public static void toSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    static void heapify(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
    public static String arrToString(int[] array) { // метод дпо переводу массива в строку для вывода
        StringBuilder strArr = new StringBuilder();
        for (int i = 0; i < array.length - 1; i++) {
            strArr.append(array[i]);
            strArr.append(", ");
        }
        return strArr.toString();
    }
}