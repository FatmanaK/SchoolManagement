public class StackExercises {

    public static void main(String[] args) {
        // Reverse
        System.out.println("Reverse:");
        System.out.println(
          "12345 => " + reverse("12345") + '\n' +
          "randy => " + reverse("randy") + '\n' +
          "2 => "     + reverse("2")
        );

        // Parens
        System.out.println("Parenthesis:");
        System.out.println(
          "(()) is balanced? "    + isBalanced("(())") + '\n' + // should be true
          ")))) is balanced? "    + isBalanced("))))") + '\n' + // should be false
          "()()((( is balanced? " + isBalanced("()()(((")       // should be false
        );
    }

    /**
     *  Write a function that takes a string returns its reverse.
     *  ex
     *    "army" => "ymra"
     *    "4321" => "1234"
     */
    private static String reverse(String string) {
        Stack<Character> stack = new ListBasedStack<>();
        for(int i = 0 ; i < string.length() ; ++i) {
            stack.push(string.charAt(i));
        }
        String reverse = "";
        for(int i = 0 ; i < string.length() ; ++i) {
            reverse += stack.pop();
        }
        return reverse;
    }

    /**
     *  Write a function that takes a string and uses a stack to determine
     *  whether its parentheses are properly balanced.
     *  ex
     *    "()()(((())))" => true
     *    ")))(((" => false
     */
    private static boolean isBalanced(String s) {
        Stack<Character> stack = new ListBasedStack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }
}