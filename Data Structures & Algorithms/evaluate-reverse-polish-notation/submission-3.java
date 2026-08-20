class Solution {
    public int evalRPN(String[] tokens) {

        String operations = "+-*/";
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (String t : tokens) {

            if (!operations.contains(t)) {
                stack.push(Integer.parseInt(t));
            } else {
                int a = stack.pop();
                int b = stack.pop();

                switch (t) {
                    case "+" -> stack.push(b + a);
                    case "-" -> stack.push(b - a);
                    case "*" -> stack.push(b * a);
                    case "/" -> stack.push(b / a);
                }
            }
        }

        return stack.pop();
    }
}