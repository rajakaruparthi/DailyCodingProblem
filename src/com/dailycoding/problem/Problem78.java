package com.daily.coding;

/*

Given k sorted singly linked lists,

write a function to merge all the lists into one sorted singly linked list.

*/

public class Problem78 {}

class LinkedListClass {

    public void mergeLists(Node head, Node head2) {
        LinkedListClass newList = new LinkedListClass();

        Node newHead = null;
        Node list1;
        Node list2;

        if (head.val < head2.val) {
            newHead = new Node(head.val);
            newList.addToPrevNode(newHead);
            list1 = head.next;
            list2 = head2;
        } else {
            newHead = new Node(head2.val);
            newList.addToPrevNode(newHead);
            list1 = head;
            list2 = head2.next;
        }

        while (list1 != null || list2 != null) {
            if ((list1 != null && list2 != null) && list1.val < list2.val) {
                newList.addToPrevNode(new Node(list1.val));
                list1 = list1.next;
            } else {
                newList.addToPrevNode(new Node(list2.val));
                list2 = list2.next;
            }
        }
        printLinkedList(newHead);
    }

    private Node head;

    static class Node {
        private int val;
        private Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    void addToPrevNode(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = node;
        }
    }

    private void printLinkedList(Node head) {
        System.out.println(" --------- printing linked list ----------- ");
        while (head != null) {
            System.out.print(head.val + ", ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        LinkedListClass list1 = new LinkedListClass();
        Node head = new Node(1);
        list1.addToPrevNode(head);
        list1.addToPrevNode(new Node(2));
        list1.addToPrevNode(new Node(3));
        list1.addToPrevNode(new Node(4));
        list1.addToPrevNode(new Node(6));
        list1.addToPrevNode(new Node(7));
        list1.addToPrevNode(new Node(9));

        LinkedListClass list2 = new LinkedListClass();
        Node head2 = new Node(5);
        list2.addToPrevNode(head2);
        list2.addToPrevNode(new Node(6));
        list2.addToPrevNode(new Node(8));
        list2.addToPrevNode(new Node(10));
        list2.addToPrevNode(new Node(11));
        list2.addToPrevNode(new Node(16));
        list2.addToPrevNode(new Node(18));
        list2.addToPrevNode(new Node(20));
        list2.addToPrevNode(new Node(21));

        Problem78 p = new Problem78();
        list1.mergeLists(head, head2);
    }
}
