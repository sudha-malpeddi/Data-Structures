package com.datastructures.linkedlist.singllylinkedlist;

import javax.sound.midi.MidiDevice;

public class MiddleNode {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node head;

    void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }

    int getMiddle(Node head){
        Node slowptr = head;
        Node fastptr = head;
        if(head != null) {
            while (fastptr != null && fastptr.next != null) {
                slowptr = slowptr.next;
                fastptr = fastptr.next.next;
            }
        }
        return slowptr.data;
    }

    int middleNode(Node head){
        int count = 0;
        Node mid = head;
        while (head != null)
        {
            // update mid, when count is odd number
            if (count % 2 != 0)
                mid = mid.next;
            ++count;
            head = head.next;
        }

        // if empty list is provided
        if (mid != null)
           return mid.data;
        return -1;
    }

    public static void main(String[] args) {
        MiddleNode list = new MiddleNode();

        list.head = list.new Node(1);
        list.head.next = list.new Node(2);
        list.head.next.next = list.new Node(3);
        list.head.next.next.next = list.new Node(4);
        list.head.next.next.next.next = list.new Node(5);
        list.head.next.next.next.next.next = list.new Node(6);
        list.head.next.next.next.next.next.next = list.new Node(7);


        list.print(list.head);

        System.out.println();
        System.out.println("Middle node of the list is "+list.getMiddle(list.head));
        System.out.println("Middle node of the list is "+list.middleNode(list.head));
    }
}
