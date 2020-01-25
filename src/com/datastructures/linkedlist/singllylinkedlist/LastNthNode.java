package com.datastructures.linkedlist.singllylinkedlist;

public class LastNthNode {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node head;
    int nthNode;

    void getLastNthNode(Node head, int n){
        if(head == null)
            return;

        getLastNthNode(head.next, n);

        if(nthNode-- == 1){
            System.out.println(head.data);
            System.exit(1);
        }
    }

    void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LastNthNode list = new LastNthNode();

        list.head = list.new Node(1);
        list.head.next = list.new Node(2);
        list.head.next.next = list.new Node(3);
        list.head.next.next.next = list.new Node(4);
        list.head.next.next.next.next = list.new Node(5);

        list.print(list.head);

        System.out.println();
        list.nthNode = 4;
        System.out.println("Nth node from end of the list is ");
        list.getLastNthNode(list.head, 4);
    }
}
