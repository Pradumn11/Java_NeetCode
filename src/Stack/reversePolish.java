package Stack;

import java.util.Stack;


//Question
//https://leetcode.com/problems/evaluate-reverse-polish-notation/description/
@SuppressWarnings("unused")
public class reversePolish {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String str:tokens){
            if(("-+*/".contains(str))){
                stack.push(evaluate(stack.pop(),stack.pop(),str));
            }else{
                stack.push(Integer.valueOf(str));
            }
        }
        return stack.pop();
    }

    public int evaluate(int b,int a, String str){
        if(str.equals("+"))return a+b;
        if(str.equals("*"))return a*b;
        if(str.equals("-"))return a-b;
        return a/b;
    }
}


