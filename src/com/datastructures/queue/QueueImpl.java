package com.datastructures.queue;

import java.util.ArrayDeque;

//Implement Queue using Stack(s)
public class QueueImpl {

    static class Queue {
        ArrayDeque<Integer> stack1;
        ArrayDeque<Integer> stack2;
    }

    static void push(ArrayDeque<Integer> top_ref, int new_data)
    {
        // Push the data onto the stack
        top_ref.push(new_data);
    }

    /* Method to pop an item from stack*/
    static int pop(ArrayDeque<Integer> top_ref)
    {
        /*If stack is empty then error */
        if (top_ref.isEmpty()) {
            System.out.println("Stack Underflow");
            System.exit(0);
        }

        // pop the data from the stack
        return top_ref.pop();
    }

    // Method to enqueue an item to the queue
    static void enQueue(Queue q, int x)
    {
        push(q.stack1, x);
    }

    /* Method to deQueue an item from queue */
    static int deQueue(Queue q)
    {
        int x;

        /* If both stacks are empty then error */
        if (q.stack1.isEmpty() && q.stack2.isEmpty()) {
            System.out.println("Q is empty");
            System.exit(0);
        }

        /* Move elements from stack1 to stack 2 only if stack2 is empty */
        if (q.stack2.isEmpty()) {
            while (!q.stack1.isEmpty()) {
                x = pop(q.stack1);
                push(q.stack2, x);
            }
        }
        x = pop(q.stack2);
        return x;
    }

    public static void main(String args[])
    {
        Queue q = new Queue();
        q.stack1 = new ArrayDeque<>();
        q.stack2 = new ArrayDeque<>();

        /*Enqueue items */
        enQueue(q, 0);
        enQueue(q, 1);
        enQueue(q, 2);
      /*  enQueue(q, 3);
        enQueue(q, 4);
        enQueue(q, 5);*/

        /* Dequeue items */
        System.out.print(deQueue(q) + " ");
        System.out.print(deQueue(q) + " ");
        System.out.println(deQueue(q) + " ");
        System.out.println(deQueue(q) + " ");
        System.out.println(deQueue(q) + " ");
    }
}
