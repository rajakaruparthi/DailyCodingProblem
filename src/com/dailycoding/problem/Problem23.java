package com.daily.coding;

/*

You are given an M by N matrix consisting of booleans that represents a board. Each True boolean represents a wall.

Each False boolean represents a tile you can walk on.

Given this matrix, a start coordinate, and an end coordinate, return the minimum number of steps
required to reach the end coordinate from the start. If there is no possible path, then return null.
You can move up, left, down, and right. You cannot move through walls. You cannot wrap around the edges of the board.

For example, given the following board:

[[f, f, f, f],
[t, t, f, t],
[f, f, f, f],
[f, f, f, f]]

and start = (3, 0) (bottom left) and end = (0, 0) (top left), the minimum number of steps required to reach the end is 7,
since we would need to go through (1, 2) because there is a wall everywhere else on the second row.
 */
public class Problem23 {

    static char[][] input = {{'f', 'f', 'f', 'f'},{'t', 't', 'f', 't'},{'f', 'f', 'f', 'f'}, {'f', 'f', 'f', 'f'}};

    public static void main(String[] args) {
        System.out.println("Minimum steps required --> "+findTotalStepsToTake(input));

    }

    private static int findTotalStepsToTake(char[][] input) {
        int startIndex = input.length-1;
        int stepCount = 0;
        // in this case it is 3 0
        char start = input[startIndex][0];

        // if only one row is present in the input
        if(startIndex == 1){
            return 1;
        }

        // if the start has a wall
        if(start == 't'){
            return 0;
        }

        int currentRow = startIndex;
        int currentColumn = 0;

        while(currentRow != 0 || currentColumn!= 0){
            //check up value
            if(currentRow > 0 && input[currentRow-1][currentColumn] == 'f') {
                System.out.println(currentRow);
                currentRow  = goUp(currentRow);
                stepCount++;
            } else if(currentColumn>0 && input[currentRow][currentColumn-1] == 'f'){ // check left value
                currentColumn--;
                stepCount++;
            } else if(currentColumn < input.length-1 && input[currentRow][currentColumn+1] == 'f') { // check right value
                currentColumn = goRight(currentColumn);
                stepCount++;
            } else if(currentRow < input.length-1 && input[currentRow+1][currentColumn] == 'f'){
                currentRow  = goDown(currentRow);
                stepCount++;
            } else {
                return 0;
            }
            input[currentRow][currentColumn]  = '^';

            for (int i = 0; i < input.length; i++) {
                for (int j = 0; j < input[i].length; j++) {
                    System.out.print(input[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("----------------------");
        }
        return stepCount;
    }

    private static int goDown(int currentRow) {
        if(currentRow != input.length-1)
            return currentRow+1;
        return 0;
    }

    private static int goRight(int currentColumn) {
        if(currentColumn != input.length-1){
            currentColumn++;
        }
        return currentColumn;
    }

    private static int goUp(int currentRow) {
        if(currentRow != 0)
            return currentRow-1;
        return 0;
    }
}
