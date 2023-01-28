package Stack;

import java.util.Stack;

//Question
//https://leetcode.com/problems/min-stack/description/
public class MinStack {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> min_val = new Stack<Integer>();
    public MinStack() {

    }

    public void push(int val) {
        if (min_val.isEmpty() || val <= min_val.peek()) min_val.push(val);

        stack1.push(val);
    }
    public void pop() {
        if (stack1.peek().equals(min_val.peek())) min_val.pop();
        stack1.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int getMin() {
        return min_val.peek();
    }
}


