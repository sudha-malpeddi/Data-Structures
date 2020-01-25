package com.datastructures.queue;

//Implement LRUCache, such that, get(k), put(k,v) in O(1)

import java.util.HashMap;

public class LRUCache {
    class Node{
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    HashMap<Integer, Node> map;
    int cache_capacity;
    Node head, tail;
    int count;

    LRUCache(int capacity){
        cache_capacity = capacity;
        map = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
        head.prev = null;
        tail.next = null;
        count = 0;
    }

    void addNodeToHead(Node node){
        node.next = head.next;
        node.next.prev = node;
        node.prev = head;
        head.next = node;
    }

    void deleteNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    int get(int key){
        if (map.get(key) != null) {
            Node node = map.get(key);
            int result = node.value;
            deleteNode(node);
            addNodeToHead(node);
            System.out.println("Got the value : " +
                    result + " for the key: " + key);
            return result;
        }
        System.out.println("Did not get any value" +
                " for the key: " + key);
        return -1;
    }

    void set(int key, int value){
        if (map.get(key) != null) {
            Node node = map.get(key);
            node.value = value;
            deleteNode(node);
            addNodeToHead(node);
        }
        else {
            Node node = new Node(key, value);
            map.put(key, node);
            if (count < cache_capacity) {
                count++;
                addNodeToHead(node);
            }
            else {
                map.remove(tail.prev.key);
                deleteNode(tail.prev);
                addNodeToHead(node);
            }
        }
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);

        cache.set(1, 1);
        cache.set(2, 2);
        cache.get(1);       // returns 1
        cache.set(3, 3);    // evicts key 2
        cache.get(2);       // returns -1 (not found)
        cache.set(4, 4);    // evicts key 1
        cache.get(1);       // returns -1 (not found)
        cache.get(3);       // returns 3
        cache.get(4);       // returns 4

    }

}
