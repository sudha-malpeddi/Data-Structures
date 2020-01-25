package com.datastructures.linkedlist.singllylinkedlist;

import java.util.HashMap;

//Remove duplicates from sorted and unsorted SLL
public class RemoveDuplicates {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node head;
    Node head1;

    void removeDupFromSortedList(Node head){
        Node temp = head;

        while(temp != null && temp.next != null){
            if(temp.data == temp.next.data){
                Node dummy = temp.next;
                temp.next = dummy.next;
                dummy = null;
            }
            temp = temp.next;
        }
    }

    void removeDupFromUnSortedList(Node head){
        Node curr = head;
        Node temp = head;
        HashMap<Integer, Integer> map = new HashMap<>();

        while(curr != null){
            if(map.containsKey(curr.data)){
                Node dummy = curr;
                temp.next = curr.next;
                curr = curr.next;
                dummy = null;
            }else{
                map.put(curr.data, curr.data);
                temp = curr;
                curr = curr.next;
            }
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
        RemoveDuplicates list = new RemoveDuplicates();

        list.head = list.new Node(1);
        list.head.next = list.new Node(1);
        list.head.next.next = list.new Node(3);
        list.head.next.next.next = list.new Node(4);
        list.head.next.next.next.next = list.new Node(4);

        System.out.print("Original sorted list :: ");
        list.print(list.head);
        System.out.println();

        list.removeDupFromSortedList(list.head);
        System.out.print("After removing duplicates from sorted list :: ");
        list.print(list.head);

        list.head1= list.new Node(13);
        list.head1.next = list.new Node(12);
        list.head1.next.next = list.new Node(13);
        list.head1.next.next.next = list.new Node(4);
        list.head1.next.next.next.next = list.new Node(12);
        list.head1.next.next.next.next.next = list.new Node(12);
        list.head1.next.next.next.next.next.next = list.new Node(12);

        System.out.println(" ");
        System.out.print("Original unsorted list :: ");
        list.print(list.head1);
        System.out.println();

        list.removeDupFromUnSortedList(list.head1);
        System.out.print("After removing duplicates from unsorted list :: ");
        list.print(list.head1);
    }
}
