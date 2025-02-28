package kivi.test;

import kivi.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);


        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
    }
}
