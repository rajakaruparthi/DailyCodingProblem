package com.daily.coding;

/*

This problem was asked by Google.

Given a singly linked list and an integer k, remove the kth last element from the list.

k is guaranteed to be smaller than the length of the list.

The list is very long, so making more than one pass is prohibitively expensive.

Do this in constant space and in one pass.
 */
class SinglyLinkedList {
    Node head;

    static class Node {

        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    void addToTheNode(Node node){
        if(head == null){
            head = node;
        }
        else{
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list = populateList(list);
        int k =8;
        int kthElement = findKthElement(list, 8);
        System.out.println(kthElement);
    }

    private static int findKthElement(SinglyLinkedList list, int k) {
        Node node = list.head;
        int i = 1;
        while(i != k){
            System.out.println("inside while --> "+node.next.val);
            node = node.next;
            i++;
        }
        return node.val;
    }

    private static SinglyLinkedList populateList(SinglyLinkedList list) {

        Node head = new Node(5);
        list.head = head;
        list.addToTheNode(new Node(6));
        list.addToTheNode(new Node(7));
        for(int i=8;i<100; i++){
            list.addToTheNode(new Node(i));
        }
        return list;
    }
}

public class Problem26 {

    public static void main(String[] args) {

    }
}
