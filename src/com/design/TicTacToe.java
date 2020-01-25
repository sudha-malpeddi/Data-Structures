package com.design;

import java.util.Scanner;

public class TicTacToe {
    int a[][];
    int playerType;

    TicTacToe(){
        a = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                a[i][j] = -1;
            }
        }
    }

    void set(int a[][], int position){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(position == 0) {
                    a[i][j] = playerType;
                    return;
                }
                position--;
            }
        }
    }

    boolean isWin(){
        //horizontal check
        if((a[0][0] == a[0][1]) && (a[0][1] == a[0][2]))
            return true;
        if((a[1][0] == a[1][1]) && (a[1][1] == a[1][2]))
            return true;
        if((a[2][0] == a[2][1]) && (a[2][1] == a[2][2]))
            return true;

        //vertical check
        if((a[0][0] == a[1][0]) && (a[1][0] == a[2][0]))
            return true;
        if((a[0][1] == a[1][1]) && (a[1][1] == a[2][1]))
            return true;
        if((a[0][2] == a[1][2]) && (a[1][2] == a[2][2]))
            return true;

        //diagonal check
        if((a[0][0] == a[1][1]) && (a[1][1] == a[2][2]))
            return true;
        if((a[0][2] == a[1][1]) && (a[1][1] == a[2][0]))
            return true;
        return false;
    }

    void print(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
    }

    int get(){
        return 0;
    }

    public static void main(String[] args) {
        TicTacToe toe = new TicTacToe();
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 9; i++) {
            System.out.print("Enter an position : ");
            int position = input.nextInt();

            toe.playerType = i % 2;

            toe.set(toe.a, position - 1);
            toe.print();
            if(toe.isWin())
                return;
        }
    }
}
