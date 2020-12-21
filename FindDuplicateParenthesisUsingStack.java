import java.util.Scanner;
import java.util.Stack;

public class FindDuplicateParenthesisUsingStack {

    public static String findDuplicateParenthesis(String inputString) {
        //write your code here
        Stack<Character> newStack=new Stack<>();
        for(int i=0;i<inputString.length();i++) {
            char ch = inputString.charAt(i);
            if (ch != ')') {
                newStack.push(ch);
            }
            else {
                char top = newStack.peek();
                newStack.pop();
                int flag = 0;
                while (top != '(') {
                    top = newStack.peek();
                    newStack.pop();
                    flag++;
                }
                if (flag <= 1) {
                    return "Input string contains duplicate parenthesis";
                }
            }
        }
        return "Input string does not contain duplicate parenthesis";

    }


    public static void main(String[] args){
        String inputString = new String();
        Scanner in = new Scanner(System.in);
        inputString = in.nextLine();
        System.out.println(findDuplicateParenthesis(inputString));

    }
}
