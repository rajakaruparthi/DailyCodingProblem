package com.daily.coding;

/*

You are given an N by M 2D matrix of lowercase letters. Determine the minimum number of columns that
can be removed to ensure that each row is ordered from top to bottom lexicographically.
That is, the letter at each column is lexicographically later as you go down each row.
It does not matter whether each row itself is ordered lexicographically.

For example, given the following table:

cba
daf
ghi

As another example, given the following table:

zyx
wvu
tsr
Your function should return 3, since we would need to remove all the columns to order it.

 */
public class Problem76 {

    public static void main(String[] args) {
        Problem76 p = new Problem76();
        char[][] input = {{'c', 'b', 'a'}, {'d', 'a', 'f'}, {'g', 'h', 'i'}};
        char[][] input2 = {{'z', 'y', 'x'}, {'w', 'v', 'u'}, {'t', 's', 'r'}};

        int count = p.compute(input);
        int count2 = p.compute(input2);
        System.out.println(count);
        System.out.println(count2);
    }

    private int compute(char[][] input) {
        int count = 0;
        if(input.length == 1 || input.length == 0){
            return 0;
        }
        for( int j=0; j< input.length; j++) {

            for(int i=0; i<input[i].length-1; i++) {

                int first_char = (int) input[i][j];
                int next_char = (int) input[i+1][j];
                if(next_char < first_char) {
                    System.out.println("index --- "+ i+ ", j --"+ j);
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
