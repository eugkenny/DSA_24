public class InfixEval {
    public static void main(String[] args) {
        String expr = "( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )";

        Stack<Integer> values = new ArrayStack<>();
        Stack<Character> ops = new ArrayStack<>();

        for (int i = 0; i < expr.length(); i++){
            if(expr.charAt(i) == ' ' || expr.charAt(i) =='(');

            else if(expr.charAt(i) == '+' || expr.charAt(i) == '-' || expr.charAt(i) == '*' || expr.charAt(i) == '/'){
                ops.push(expr.charAt(i));
            }
            else if(expr.charAt(i) == ')') {
                char op = ops.pop();
                if (op == '+') {
                    values.push(values.pop() + values.pop());
                } else if (op == '-') {
                    values.push(values.pop() - values.pop());
                } else if (op == '*') {
                    values.push(values.pop() * values.pop());
                } else if (op == '/') {
                    values.push(values.pop() / values.pop());
                }
            }
            else{
                values.push((int)expr.charAt(i));
            }

            System.out.println(expr + " = " + values.pop());
        }
    }
}
