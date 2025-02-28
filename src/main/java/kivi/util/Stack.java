package kivi.util;

public class Stack {
    private int capacity;
    private int topOfStack;
    private int[] array;

    public Stack() {
    }

    public Stack(int size) {
        capacity = size;
        array = new int[size];
        topOfStack = -1; //список пуст
    }

    public boolean isEmpty() {
        return topOfStack == -1;
    }

    public boolean isFull() {
        return topOfStack == capacity - 1;
    }

    public void push(int value) {
        if (isFull()){
            System.out.println("Stack is full");
        }
        topOfStack++;
        array[topOfStack] = value;
    }

    public int pop() {
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int value = array[topOfStack];
        topOfStack--;
        return value;
    }

    public Integer top(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return array[topOfStack];
    }

}
