class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> curr = new Stack<>();
        for (String c : tokens) {
            if(c.equals("+")){
                int a = curr.pop();
                int b = curr.pop();
                curr.push(a+b);
            }
            else if(c.equals("-")){
                int a = curr.pop();
                int b = curr.pop();
                curr.push(b-a);
            }
            else if(c.equals("/")){
                int a = curr.pop();
                int b = curr.pop();
                curr.push(b/a);
            }
            else if(c.equals("*")){
                int a = curr.pop();
                int b = curr.pop();
                curr.push(a*b);
            }
            else{
                curr.push(Integer.parseInt(c));
            }
        }
        return curr.pop();
    }
}
