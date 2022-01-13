package com.daily.coding;

public class Combinations {

    public static void main(String[] args) {
        int input[] = {1,2,3,4,5};
        int n = input.length;
        int k = 3;
        Combinations c = new Combinations();
        c.printCombinations(input, n, k);
    }

    private void printCombinations(int[] input, int n, int k) {

        int data[] = new int[k];
        combinationCompute(input, data, 0, n-1, 0, k);
    }

    private void combinationCompute(int[] input, int[] data, int start, int end, int index, int r) {
        if (index == r)
        {
            for (int j=0; j<r; j++)
                System.out.print(data[j]+" ");
            System.out.println("");
            return;
        }
        System.out.println("---");


        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = input[i];
            combinationCompute(input, data, i+1, end, index+1, r);
        }
    }
}
