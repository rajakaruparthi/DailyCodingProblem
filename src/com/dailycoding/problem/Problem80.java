package com.daily.coding;

/*

This problem was asked by Google.

Given the root of a binary tree, return a deepest node. For example, in the following tree, return d.

*/

public class Problem80 {

    static int result = 0;
    static int maxlevel = -1;

    static class Node {

        int key;
        Node left, right;

        Node(int item) {
            key = item;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {
        Node n = new Node(1);
        n.left = new Node(2);
        n.left.left = new Node(7);
        n.left.left.left = new Node(9);
        n.left.left.right = new Node(10);
        n.left.right = new Node(8);
        n.right = new Node(3);
        n.right.right = new Node(5);
        n.right.right.right = new Node(11);
        n.right.right.right.left = new Node(19);
        n.right.left = new Node(4);

        findDeepestNode(n);
    }

    private static void findDeepestNode(Node n) {
        findNode(n, 0);
        System.out.println(result);
    }

    private static void findNode(Node root, int level) {

        if(root != null) {
            findNode(root.left, ++level);
            if(level > maxlevel) {
                maxlevel = level;
                result = root.key;
            }
            findNode(root.right, level);
        }

    }

}
