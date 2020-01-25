package com.datastructures.stack;

import java.util.ArrayDeque;

//Implement stack with getMin() in constant time
public class GetMinInStack {

    static int minEle;
    static class Stack{
        ArrayDeque<Integer> stack;
    }

    static int min = Integer.MAX_VALUE;

    static void push(Stack stack, int new_data){

        if(stack.stack.isEmpty()){
            stack.stack.push(new_data);
            minEle = new_data;
        } else{
            if(minEle > new_data){
                int temp = new_data;
                new_data = temp - minEle;
                minEle = temp;
            }
            stack.stack.push(new_data);
        }
    }

    static int pop(Stack stack){
        int temp = -1;
        if(stack.stack.isEmpty()){
            System.out.println("Stack underflow...");
            minEle = temp;
        }else {
            if(stack.stack.peek() < minEle){
                temp = minEle;
                minEle = minEle - stack.stack.peek();
                stack.stack.pop();
            }else{
                temp = stack.stack.pop();
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.stack = new ArrayDeque<Integer>();

        push(stack, 24);
        push(stack, 2);
        push(stack, 13);
        push(stack, 7);
        push(stack, 6);
        push(stack, 32);
        push(stack, 1);
        push(stack, 0);

        System.out.println("min element ::" + minEle);

        System.out.println("pop ::" + pop(stack));
        System.out.println("pop ::" +  pop(stack));
        System.out.println("pop ::" +  pop(stack));

        System.out.println("min element ::" + minEle);
    }
}
