package com.datastructures.queue;

import java.util.ArrayDeque;

//Implement queue using only one stack
public class QueueUsingStack {

    static int deque_result;

    static class Queue {
        ArrayDeque<Integer> stack;
    }

    static void push(ArrayDeque<Integer> stack, int data){
        stack.push(data);
    }

    static void enqueue(Queue q, int data){
        push(q.stack,data);
    }

    static int dequeue(Queue q){
       if(q.stack.isEmpty()){
           System.out.print("Queue is Empty :: ");
           return -1;
       }

       return recursive(q);
    }

    static int recursive(Queue q){
        int x;
        if(q.stack.size() == 1) {
            deque_result =q.stack.pop();
            return deque_result;
        }

        x = q.stack.pop();
        recursive(q);
        push(q.stack, x);

        return deque_result;
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.stack = new ArrayDeque<Integer>();

        enqueue(q, 1);
        enqueue(q, 2);
        enqueue(q, 3);
        enqueue(q, 4);
        enqueue(q, 5);


        System.out.println(dequeue(q));
        System.out.println(dequeue(q));
        System.out.println(dequeue(q));
        System.out.println(dequeue(q));
        System.out.println(dequeue(q));
        System.out.println(dequeue(q));

        enqueue(q, 6);
        enqueue(q, 7);
        enqueue(q, 8);
        enqueue(q, 9);

        System.out.println(dequeue(q));
        System.out.println(dequeue(q));

    }

}
