import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(')
                    return false;
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[')
                    return false;
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{')
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        String str = "()";
        System.out.println(vp.isValid(str));
        str = "()[]{}";
        System.out.println(vp.isValid(str));
        str = "(]";
        System.out.println(vp.isValid(str));
        str = "([)]";
        System.out.println(vp.isValid(str));
        str = "{[]}";
        System.out.println(vp.isValid(str));
    }
}
