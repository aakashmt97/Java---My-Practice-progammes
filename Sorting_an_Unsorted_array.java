
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorting_an_Unsorted_array {

    // NEEDS MORE IMPROVEMENTS
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int[] array1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            array1[i] = s.nextInt();
        }

        int n2 = s.nextInt();
        int[] array2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            array2[i] = s.nextInt();
        }
        
        s.close();

        int m=0, index=0;
        for(int i=1; i<n1-1;i++) {
            if (array1[i] < array1[i-1]) {
                m = array1[i];
                index = i;
                break;
            }
        }

        ArrayList<Integer> replaceList = new ArrayList<>();
        if (array2.length == 0) {
            System.out.println("Not Possible");
        }
        else {
            for (int j = 0; j < n2; j++) {
                if ((array2[j] > m) && (array2[j] < array1[index + 1])) {
                    replaceList.add(array2[j]);
                }
            }
            if (replaceList.size() == 0) {
                System.out.println("Not Possible");
            }
            else {
                System.out.println(Collections.max(replaceList));
            }
        }

    }
}
