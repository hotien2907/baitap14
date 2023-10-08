package baitap3;

public class SortStrings {

    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "orange", "grape", "pear"};

        System.out.println("Mảng ban đầu:");
        printArray(arr);

        selectionSort(arr);
        System.out.println("\nMảng sau khi sắp xếp bằng Selection Sort:");
        printArray(arr);

        insertionSort(arr);
        System.out.println("\nMảng sau khi sắp xếp bằng Insertion Sort:");
        printArray(arr);

        bubbleSort(arr);
        System.out.println("\nMảng sau khi sắp xếp bằng Bubble Sort:");
        printArray(arr);
    }

    private static void printArray(String[] arr) {
        for (String str : arr) {
            System.out.print(str + " ");
        }
    }

    private static void selectionSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    private static void insertionSort(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && key.compareTo(arr[j]) < 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    private static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

