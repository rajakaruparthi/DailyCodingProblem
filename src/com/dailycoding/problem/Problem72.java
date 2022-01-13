package com.daily.coding;

/*
Given the head of a singly linked list, reverse it in-place
*/

public class Problem72 {

}

class LinkedList {

    void addNodeToList(Node n){

    }

    static class Node {

        Node next;
        int data;

        // Singly linked list
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        Node n = new Node(1);
        Node n1 = n.next;
        n1.data = 2;
        n1.next.data = 3;

    }

}
