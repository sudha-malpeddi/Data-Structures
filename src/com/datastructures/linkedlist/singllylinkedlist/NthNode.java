package com.datastructures.linkedlist.singllylinkedlist;

//get nth node in SLL
public class NthNode {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node head;

    int getNthNode(Node head, int n){
        int index = 1;
        Node temp = head;

        while (temp != null){
            if(index == n)
                return temp.data;
            index++;
            temp = temp.next;
        }
        return -1;
    }

    void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        NthNode list = new NthNode();

        list.head = list.new Node(1);
        list.head.next = list.new Node(2);
        list.head.next.next = list.new Node(3);
        list.head.next.next.next = list.new Node(4);
        list.head.next.next.next.next = list.new Node(5);

        list.print(list.head);

        System.out.println();
        System.out.println("Nth node of the list is "+list.getNthNode(list.head, 3));
    }
}
