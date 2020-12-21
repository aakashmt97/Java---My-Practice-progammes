import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindPalindromeUsingQueue {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        checkPalindrome(inputString);
    }

    static void checkPalindrome(String str) {
        int length = str.length();
        Queue<Character> queue = new LinkedList<>();
        int j, m = length-1, mid=length/2;
        if (length%2 == 0) {
            j = mid;
        }
        else {
            j=mid+1;
        }

        for (int i = 0; i < mid; i++) {
            queue.add(str.charAt(i));
        }

        while (m >= j) {
            if (queue.peek() != str.charAt(m)) {
                break;
            }
            else {
                queue.remove();
            }
            m--;
        }

        if (queue.isEmpty()) {
            System.out.println("The given input is a palindrome.");
        }
        else {
            System.out.println("The given input is not a palindrome.");
        }
    }
}
