package com.datastructures.binarytree;

//delete node in binary tree where node data match with x
public class DeleteLeaf {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int item)
        {
            data = item;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    void print(Node root){
        if(root == null)
            return;
        System.out.print(" "+root.data);
        print(root.left);
        print(root.right);
    }

    Node deleteNode(Node root, int tobeDeleted){
        if(root == null)
            return null;

        root.left = deleteNode(root.left, tobeDeleted);
        root.right = deleteNode(root.right, tobeDeleted);

        if((root.left == null && root.right == null)&& root.data == tobeDeleted ){
            return null;
        }
        return root;
    }

    public static void main(String[] args) {

        DeleteLeaf tree  = new DeleteLeaf();

        tree.root = tree.new Node(1);
        tree.root.left = tree.new Node(2);
        tree.root.left.left = tree.new Node(3);
        tree.root.left.left.right = tree.new Node(7);//leaf
        tree.root.left.left.left = tree.new Node(12);//leaf
        tree.root.right = tree.new Node(4);
        tree.root.right.right = tree.new Node(20);//leaf

        System.out.print("Tree nodes are :: ");

        tree.print(tree.root);

        tree.deleteNode(tree.root, 20);

        System.out.print("\nTree nodes after deleting 20 :: ");

        tree.print(tree.root);
    }


}
