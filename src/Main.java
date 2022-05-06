/**This problem was asked by Facebook.

 Given a string of round, curly, and square open and closing brackets, return whether the brackets are balanced (well-formed).

 For example, given the string "([])[]({})", you should return true.

 Given the string "([)]" or "((()", you should return false.
 **/
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String brace = scan.nextLine();

        boolean found;
        found = areTheBracesBalanced(brace);

        System.out.println(found);

    }

    private static boolean areTheBracesBalanced(String brace) {
        Stack<Character> stack = new Stack<>();
        for(int i =0 ; i<brace.length();i++){
            char c = brace.charAt(i);
            if(c=='('|| c=='{'|| c=='['){
                stack.push(c);
            } else if (c==')') {
                if(stack.isEmpty() || stack.pop()!='(')
                    return false;
            } else if (c=='}') {
                if(stack.isEmpty() || stack.pop()!='{')
                    return false;
            }
            else{
                if(stack.isEmpty() || stack.pop()!='[')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
