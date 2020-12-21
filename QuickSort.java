
public class QuickSort {

    public static void main(String[] args) {
        //int[] ar = {2,4,6,8,10,12,14,16,18,20};
        int[] ar = {8, 6, 3, 1, 4, 2, 7, 5};
        quickSort(ar, 0, ar.length - 1);
        printArray(ar);
    }

    public static void quickSort(int[] ar, int start, int end) {
        if (start < end) {
            int p = partition(ar, start, end);
            quickSort(ar, 0, p - 1);
            quickSort(ar, p + 1, end);
        }
    }

    public static int partition(int[] ar, int start, int end) {
        int pivot = ar[end];
        int i = start;
        for (int j = start; j < end; j++) {
            if (ar[j] < pivot) {
                int temp1 = ar[j];
                ar[j] = ar[i];
                ar[i] = temp1;
                i++;
            }
        }
        int temp2 = ar[i];
        ar[i] = ar[end];
        ar[end] = temp2;

        return i;
    }

    static void printArray(int arr[])
    {
        for (int j : arr) System.out.println(j);
        System.out.println();
    }
}