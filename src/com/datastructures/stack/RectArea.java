package com.datastructures.stack;

import java.util.ArrayDeque;

//Given histogram, find maximum rectangular area
public class RectArea {

    static int getMaxArea(int hist[], int n){
        int max_area =0 , i = 0;
        int top;
        int area_with_top;
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        while(i < n){
            if(stack.isEmpty() || hist[stack.peek()] <= hist[i] )
                stack.push(i++);
            else{
                top = stack.pop();

                area_with_top = hist[top] * (stack.isEmpty() ? i : (i-stack.peek()-1));

                if(max_area < area_with_top)
                    max_area = area_with_top;
            }
        }

        while(stack.isEmpty() == false){
            top = stack.pop();

            area_with_top = hist[top] * (stack.isEmpty() ? i : (i - stack.peek() - 1));

            if(max_area < area_with_top)
                max_area = area_with_top;
        }

        return max_area;
    }

    public static void main(String[] args) {
        int hist[] = { 1, 2, 3, 4, 5, 3, 3, 2};
        System.out.println("Maximum area is "+getMaxArea(hist, hist.length));
    }
}
