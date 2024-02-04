import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Baek_4949 {
    private static final String VALID = "yes";
    private static final String INVALID = "no";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String s = br.readLine();
            if (s.equals(".")) break; // 종료 조건문
            sb.append(isBalanced(s)).append('\n');
        }
        System.out.println(sb);
    }

    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !matchBrackets(stack, '(')) {
                return INVALID;
            } else if (c == ']' && !matchBrackets(stack, '[')) {
                return INVALID;
            }
        }
        return stack.empty() ? VALID : INVALID;
    }

    private static boolean matchBrackets(Stack<Character> stack, char openingBracket) {
        return !stack.isEmpty() && stack.pop() == openingBracket;
    }
}
