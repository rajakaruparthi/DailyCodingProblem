package com.daily.coding;

/*
Given an array of time intervals (start, end) for classroom lectures (possibly overlapping),

find the minimum number of rooms required.

For example, given [(30, 75), (0, 50), (60, 150)], you should return 2.
 */

public class Problem21 {

    public static void main(String[] args) {
        int[][] input = {{30, 75}, {0, 50}, {60, 150}, {10, 60}};
        int minRooms = calculateMinRooms(input);
        System.out.println(minRooms);
    }

    private static int calculateMinRooms(int[][] input) {
        int min_rooms = 0; boolean came = false;

        if(input.length == 1){
            return 1;
        }

        if(input.length == 0){
            return 0;
        }

        if(input.length == 2){
            if(input[0][0] < input[1][0]
                    && input[0][1] > input[1][1]){
                return 2;
            }
        }

        for (int i=0; i< input.length; i++){
            int u = input[i][1], l = input[i][0];
            for (int j=1; j< input.length; j++) {
                int u1 = input[j][1], l1 = input[j][0];
                if((l1 > l && l1 < u) || (u1 > l && u1 < u)) {
                    came = true;
                }
            }
            if(came){
                min_rooms++;
                came = false;
            }
        }
        return min_rooms;
    }
}
