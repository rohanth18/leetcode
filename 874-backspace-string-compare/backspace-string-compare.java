import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            else {
                stack.push(s.charAt(i));
            }
        }

        StringBuilder s1 = new StringBuilder();

        for (int i = 0; i < stack.size(); i++) {
            s1.append(stack.get(i));
        }

        Stack<Character> stack1 = new Stack<>();

        for (int i = 0; i < t.length(); i++) {

            if (t.charAt(i) == '#') {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            }
            else {
                stack1.push(t.charAt(i));
            }
        }

        StringBuilder s2 = new StringBuilder();

        for (int i = 0; i < stack1.size(); i++) {
            s2.append(stack1.get(i));
        }

        return s1.toString().equals(s2.toString());
    }
}