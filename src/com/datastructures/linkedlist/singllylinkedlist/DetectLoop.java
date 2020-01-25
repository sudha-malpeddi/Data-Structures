package com.datastructures.linkedlist.singllylinkedlist;

//Implement to detect loop in SLL and it's length
public class DetectLoop {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node head;
    int loop_len;

    void countNodes(Node node){
        int index = 1;
        Node temp = node;

        while(temp.next != node){
            ++index;
            temp = temp.next;
        }

        loop_len = index;
    }

    boolean detectLoop(Node node){
        Node slwptr = node;
        Node fastptr = node;
        while(slwptr != null && fastptr != null && fastptr.next != null){
            slwptr = slwptr.next;
            fastptr = fastptr.next.next;

            if(fastptr == slwptr) {
                countNodes(slwptr);
                return true;
            }
        }
        return false;
    }

    int getLength(){
        return loop_len;
    }

    public static void main(String[] args) {
        DetectLoop list = new DetectLoop();

        list.head = list.new Node(1);
        list.head.next = list.new Node(2);
        list.head.next.next = list.new Node(3);
        list.head.next.next.next = list.new Node(4);

        //Create loop
        list.head.next.next.next.next = list.head.next;

        //list.print(list.head);
        //System.out.println();
        if(list.detectLoop(list.head)) {
            System.out.print("Loop found");
            //find length
            System.out.println();
            System.out.println("And the length on the loop is :: " + list.getLength());
        }
        else
            System.out.print("No loop");
    }
}
