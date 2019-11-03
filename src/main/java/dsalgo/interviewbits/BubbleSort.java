package dsalgo.interviewbits;

/**
 * Created by ngupta on 3/11/2019 AD.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 6, 9, 0, -1};
        for (int num : arr)
            System.out.print(num + ", ");
        bubbleSort(arr);

        System.out.println();
        for (int num : arr)
            System.out.print(num + ", ");
    }

    private static void bubbleSort(int[] arr) {
        if (arr == null)
            return;

        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }
}
