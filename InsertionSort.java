

public class InsertionSort {
    public static void sort(int[] arr)
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int j = i;

            while (j > 0 && arr[j-1] > arr[j])
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j = j-1;
            }
        }
    }

    static void print(int[] arr)
    {
        for (int j : arr) System.out.print(j + " ");

        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] arr = {2, 7, 5, 21, 13};
        sort(arr);
        print(arr);
    }
}