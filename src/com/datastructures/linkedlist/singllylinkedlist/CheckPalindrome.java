package com.datastructures.linkedlist.singllylinkedlist;

public class CheckPalindrome {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node head;
    Node temp;

    boolean isPalindrome(Node node){
        temp = head;
        if(node == null)
            return true;

        boolean result = isPalindrome(node.next);

        if(result == false)
            return false;

        boolean result1 = (node.data == temp.data);
        temp = temp.next;

        return result1;
    }

    void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        CheckPalindrome list = new CheckPalindrome();

        list.head = list.new Node(1);
        list.head.next = list.new Node(2);
        list.head.next.next = list.new Node(3);
        list.head.next.next.next = list.new Node(2);
        list.head.next.next.next.next = list.new Node(1);

        list.print(list.head);
        System.out.print(" :: ");
        if(list.isPalindrome(list.head))
            System.out.print("It is palindrome");
        else
            System.out.print("It is not a palindrome");
    }
}
