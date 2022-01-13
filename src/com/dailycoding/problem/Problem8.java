package com.dailycoding.problem;

/*
A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.

Given the root to a binary tree, count the number of unival subtrees.

For example, the following tree has 5 unival subtrees:
 */

class Node {

    int value;
    Node right, left;

    public Node(int val) {
        this.value = val;
        right = left = null;
    }
}

class BinarySearchTree {

    Node root;

}

public class Problem8 {

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new Node(5);
        tree.root.left = new Node(4);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(4);
        tree.root.right.right = new Node(5);
    }
}
