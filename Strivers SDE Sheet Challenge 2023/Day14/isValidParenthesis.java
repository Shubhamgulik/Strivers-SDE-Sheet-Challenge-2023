import java.util.Stack;

public class Solution {
    public static boolean isValidParenthesis(String s) {
        // Write your code here.
        Stack<Character> stack=new Stack<>();

        int n = s.length();

        for(int i=0; i<n; i++){
            if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }else if(stack.isEmpty()) return false;
            else if(s.charAt(i) == '}' && stack.peek() == '{'){
                stack.pop();
            }else if(s.charAt(i) == ']' && stack.peek() == '['){
                stack.pop();
            }else if(s.charAt(i) == ')' && stack.peek() == '('){
                stack.pop();
            }else return false;
        }

        return stack.isEmpty();
    }
}
