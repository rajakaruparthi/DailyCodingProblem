package com.daily.coding;


/*There is a fence with n posts, each post can be painted with one of the k colors.
You have to paint all the posts such that no more than two adjacent fence posts have the same color.
Return the total number of ways you can paint the fence.

 */

public class Lintcode1 {

    public static void main(String[] args) {
        Lintcode1 l = new Lintcode1();
        int k = 2;
        int n = 3;
        l.findTotalWays(n, k);
    }

    private void findTotalWays(int n, int k) {
        int count = 0;
        for (int i=0; i<n; i++){
            if(i % 3 == 0){

            }
            count += 2;
        }
    }
}
