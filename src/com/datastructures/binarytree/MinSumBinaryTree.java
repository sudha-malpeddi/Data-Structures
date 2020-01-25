package com.datastructures.binarytree;

import java.util.LinkedList;

class Node {
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class MinSumBinaryTree {
    Node root;
    Node leafNode = null;
    int min = Integer.MAX_VALUE;

    boolean printPath(Node node, Node target_leaf)
    {
        if (node == null)
            return false;

        if (node == target_leaf || printPath(node.left, target_leaf) || printPath(node.right, target_leaf)) {
            System.out.print(node.data + " ");
            return true;
        }
        return false;
    }

    void getLeafNode(Node node, int minSum, int curr_sum)
    {
        if (node == null)
            return;

        curr_sum = curr_sum + node.data;

        if (node.left == null && node.right == null) {
            if (curr_sum < minSum) {
                min = curr_sum;
                leafNode = node;
            }
        }

        getLeafNode(node.left, min, curr_sum);
        getLeafNode(node.right, min, curr_sum);
    }

    int minSumPath()
    {
        if (root == null)
            return 0;

        getLeafNode(root, min, 0);
        printPath(root, leafNode);

        return min;
    }

    public static void main(String args[])
    {
        MinSumBinaryTree tree = new MinSumBinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.left.right = new Node(7);
        tree.root.left.left.left = new Node(12);
        tree.root.right = new Node(4);
        tree.root.right.right = new Node(20);

        System.out.println("Sum of nodes is : " + tree.minSumPath());
    }
}
