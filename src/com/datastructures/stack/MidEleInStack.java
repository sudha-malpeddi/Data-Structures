package com.datastructures.stack;


import java.util.Comparator;
import java.util.HashMap;

public class MidEleInStack {
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int new_data){
            data = new_data;
            next = prev = null;
        }
    }

    int count = 0;
    Node middleEle;
    Node top;

    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = top;
        count += 1;

        if(count == 1){
            middleEle = new_node;
        }else {
            top.prev = new_node;
            if((count%2) != 0)
                middleEle = middleEle.prev;
        }

        top = new_node;
    }

    public int pop(){
        int poppedEle = -1;
        if(top == null) {
            middleEle = null;
            System.out.println("stack underflow");
        }else{
            count -= 1;
            poppedEle = top.data;
            top = top.next;
            top.prev = null;
            if(count%2 == 0)
                middleEle = middleEle.next;
        }
        return poppedEle;
    }

    public void traverse(Node temp){
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        MidEleInStack stack = new MidEleInStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);

        stack.traverse(stack.top);
        System.out.println("middle ele :: "+stack.middleEle.data);

        System.out.println("popped element :: "+stack.pop());
        System.out.println("popped element :: "+stack.pop());
        stack.traverse(stack.top);
        System.out.println("middle ele :: "+stack.middleEle.data);

    }
}
