package dsalgo.interviewbits;

/**
 * Created by ngupta on 4/11/2019 AD.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 6, 9, 0, -1};
        for (int num : arr)
            System.out.print(num + ", ");
        insertionSort(arr);

        System.out.println();
        for (int num : arr)
            System.out.print(num + ", ");
    }

    private static void insertionSort(int[] arr) {
        if (arr == null || arr.length <= 0)
            return;

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
