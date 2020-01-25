package com.datastructures.linkedlist.singllylinkedlist;

//Search the value in SLL
public class SearchNode {
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
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    boolean iterativeSearch(Node head, int searchEle){
        Node temp = head;

        while(temp != null){
            if(temp.data == searchEle)
                return true;
            temp = temp.next;
        }
        return false;
    }

    boolean recurrsiveSearch(Node node, int searchEle){
        if(node == null )
            return false;

        if(node.data == searchEle)
            return true;

        return recurrsiveSearch(node.next, searchEle);
    }

    public static void main(String[] args) {
        SearchNode list = new SearchNode();

        list.head = list.new Node(1);
        list.head.next = list.new Node(2);
        list.head.next.next = list.new Node(3);
        list.head.next.next.next = list.new Node(4);
        list.head.next.next.next.next = list.new Node(5);

        list.print(list.head);

        boolean result = list.iterativeSearch(list.head, 13);

        if(result)
            System.out.println("Searched using iterative :: Element Found");
        else
            System.out.println("Searched using iterative :: Element not found");

        result = list.recurrsiveSearch(list.head, 3);

        if(result)
            System.out.println("Searched using recurrsive :: Element Found");
        else
            System.out.println("Searched using recurrsive :: Element not found");
    }

}
