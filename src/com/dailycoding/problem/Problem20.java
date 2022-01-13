package com.daily.coding;

/*

Given two singly linked lists that intersect at some point, find the intersecting node. The lists are non-cyclical.

For example, given A = 3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10, return the node with value 8.

In this example, assume nodes with the same value are the exact same node objects.

Do this in O(M + N) time (where M and N are the lengths of the lists) and constant space.

 */

public class Problem20 {

}

class LinkedListCls{

    private Node head;

    static class Node {

        int val;
        Node next;

        Node(int x) {
            val = x;
            next = null;
        }
    }

    private void addToTheLastNode(Node node){
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

        LinkedListCls l1 = new LinkedListCls();
        Node head = new Node(6);
        l1.addToTheLastNode(head);
        l1.addToTheLastNode(new Node(5));
        l1.addToTheLastNode(new Node(4));
        l1.addToTheLastNode(new Node(3));
        l1.addToTheLastNode(new Node(7));

        LinkedListCls l2 = new LinkedListCls();
        Node head2 = new Node(1);
        l2.addToTheLastNode(head);
        l2.addToTheLastNode(new Node(2));
        l2.addToTheLastNode(new Node(3));
        l2.addToTheLastNode(new Node(7));

        l1.findIntersection(head, head2);
    }

    private Node findIntersection(Node head, Node head2) {

        Node list1 = head;
        Node list2 = head2;

        int totalList1Nodes = 0, totalList2Nodes = 0;

        while (list1 != null){
            totalList1Nodes++;
            list1 = list1.next;
        }

        while (list2 != null){
            totalList2Nodes++;
            list2 = list2.next;
        }

        // Difference between length of two nodes
        Node ptr1 = list1;
        Node ptr2 = list2;
        int difference;

        if(totalList1Nodes > totalList2Nodes){
            difference = totalList1Nodes-totalList2Nodes;
            int i=0;
            while(i<difference){
                ptr1 = ptr1.next;
                i++;
            }
        }else{
            difference = totalList2Nodes-totalList1Nodes;
            int i=0;
            while(i<difference){
                ptr2 = ptr2.next;
                i++;
            }
        }

        while (ptr1 != null && ptr2 != null) {
            if(ptr1 == ptr2){
                return ptr1;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return null;
    }
}



