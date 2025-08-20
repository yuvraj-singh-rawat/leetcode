class Solution {
    public int calculate(String s) {
        int n = s.length();
        int res = 0, sign = 1;
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            
            if (Character.isDigit(c)) {
                int num = 0;
                while (i < n && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--; // step back after number
                res += sign * num;
            } 
            else if (c == '+') {
                sign = 1;
            } 
            else if (c == '-') {
                sign = -1;
            } 
            else if (c == '(') {
                stack.push(res);
                stack.push(sign);
                res = 0;
                sign = 1;
            } 
            else if (c == ')') {
                int prevSign = stack.pop();
                int prevRes = stack.pop();
                res = prevRes + prevSign * res;
            }
        }
        
        return res;
    }
}