package com.datastructures.stack;

//Implement two stacks in single array
public class TwoStacks {
    int top1, top2, size, arr[];

    TwoStacks(int size){
        top1 = -1;
        top2 = size;
        arr = new int[size];
    }

    public void push1(int data){
        if(top1 < top2-1){
            arr[++top1] = data;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public void push2(int data){
        if(top1 < top2-1){
            arr[--top2] = data;
        }else{
            System.out.println("Stack Overflow");
        }
    }

    public int pop1(){
        if(top1 == -1){
            System.out.println("Stack underflow");
            return -1;
        }else{
            return arr[top1--];
        }
    }

    public int pop2(){
        if(top2 == size){
            System.out.println("Stack underflow");
            return -1;
        }else{
            return arr[top2++];
        }
    }

    public static void main(String[] args) {
        TwoStacks s = new TwoStacks(5);

        s.push1(1);
        s.push1(2);
        s.push2(4);
        s.push2(3);

        System.out.println("Pop from stack1 :: " +s.pop1());
        System.out.println("Pop from stack1 :: " +s.pop2());
    }
}
