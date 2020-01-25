package com.datastructures.binarytree;

public class BuildPostOrderBT {
    public static int preIndex;

    public static void printPostOrder(int[] pre, int[] in, int fromIndex, int endIndex){
        if(fromIndex > endIndex)
            return;

        int inIndex = search(in,  fromIndex, endIndex, pre[preIndex++]);

        printPostOrder(pre, in, fromIndex, inIndex - 1);

        printPostOrder(pre, in, inIndex+1, endIndex);

        System.out.println(" " + in[inIndex] + " ");
    }

    static int search(int[] in, int start, int end, int data){
        for(int i = start; i <= end; i++){
            if(in[i] == data)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] pre = {1, 2, 3};
        int[] in = {2, 1, 3};

        int len = in.length;

        printPostOrder(pre, in, 0, len-1);
    }
}
