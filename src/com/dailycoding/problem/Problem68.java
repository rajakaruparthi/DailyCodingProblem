package com.daily.coding;

/*
On our special chessboard, two bishops attack each other if they share the same diagonal.

This includes bishops that have another bishop located between them, i.e. bishops can attack through pieces.

You are given N bishops, represented as (row, column) tuples on a M by M chessboard.

Write a function to count the number of pairs of bishops that attack each other.

The ordering of the pair doesn't matter: (1, 2) is considered the same as (2, 1).

For example, given M = 5 and the list of bishops:

(0, 0)
(1, 2)
(2, 2)
(4, 0)
The board would look like this:

[b 0 0 0 0]
[0 0 b 0 0]
[0 0 b 0 0]
[0 0 0 0 0]
[b 0 0 0 0]
You should return 2, since bishops 1 and 3 attack each other, as well as bishops 3 and 4.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem68 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix size should be greater than 4");
        int m = sc.nextInt();
        int[][] bishopsLocation = {{0, 0}, {0, 1}, {1, 2}, {2, 2}, {4, 0}};
        Problem68 p = new Problem68();
        int count = p.compute(m, bishopsLocation);
        System.out.println("Total kills --> "+count);
    }

    private int compute(int m, int[][] bishopsLocation) {
        int count = 0;
        for (int i = 0; i < bishopsLocation.length-1; i++) {
            int row = bishopsLocation[i][0];
            int column = bishopsLocation[i][1];
            List<int[]> diagonalElements = getDiagonalElements(m, row, column);

            for (int j = i + 1; j < bishopsLocation.length; j++) {
                int comp_row = bishopsLocation[j][0];
                int comp_column = bishopsLocation[j][1];
                for (int[] each: diagonalElements) {
                    if(comp_row == each[0] && comp_column == each[1]) {
                        System.out.println("("+ row+", "+ column+") -- kills -- "+"("+ comp_row+", "+ comp_column+")");
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private List<int[]> getDiagonalElements(int m, int row_ini, int column_ini){
        List<int[]> diagonalElems = new ArrayList<>();
        int row = row_ini;
        int column = column_ini;
        while (column != m-1 && row != m-1) {
            column = column + 1;
            row = row + 1;
            int[] ary = {row, column};
            diagonalElems.add(ary);
        }

        row = row_ini;
        column = row_ini;
        while (column != 0 && row != 0) {
            column = column - 1;
            row = row - 1;
            int[] ary = {row, column};
            diagonalElems.add(ary);
        }

        row = row_ini;
        column = row_ini;
        while (row != 0 && column != m-1) {
            column = column + 1;
            row = row - 1;
            int[] ary = {row, column};
            diagonalElems.add(ary);
        }

        row = row_ini;
        column = row_ini;
        while (column != 0 && row != m-1) {
            column = column - 1;
            row = row + 1;
            int[] ary = {row, column};
            diagonalElems.add(ary);
        }

        return diagonalElems;
    }
}
