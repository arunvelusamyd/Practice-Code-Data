package com.crack.linklsts;

import java.util.HashSet;

public class LinkedListSamples {

    public static void main(String[] args) {
        int[] arr = {34, 57, 48, 39, 63, 51, 48, 39, 27, 55, 55, 61, 53};

        //Creating Linked List
        System.out.println("Creating Linked List");
        Node rootNode = new Node(arr[0]);
        for(int i=1;i<arr.length;i++) {
            rootNode.appendToTrail(arr[i]);
        }
        System.out.println(rootNode.toString());
        System.out.println();

        //Deleting node from Linked List
        System.out.println("Deleting node from Linked List");
        rootNode.deleteNode( 51);
        rootNode.deleteNode( 34);
        rootNode.deleteNode( 53);
        System.out.println(rootNode.toString());

        //Append to Linked List
        System.out.println("Append to Linked List");
        rootNode.appendToTrail(51);
        rootNode.appendToTrail(34);
        rootNode.appendToTrail(53);
        System.out.println(rootNode.toString());
        System.out.println();

        //Remove Duplicates from Linked List
        System.out.println("Remove Duplicates from Linked List");
        int[] arr_2 = {34, 57, 48, 39, 63, 51, 48, 39, 27, 55, 55, 61, 53};
        LinkedListSamples linkedListSamples = new LinkedListSamples();
        linkedListSamples.removeDuplicates_sample_1(arr_2);
        int[] arr_3 = {34, 53,34, 57, 48, 39, 63, 51, 48, 39, 63, 51, 27, 55, 55, 61, 53, 61};
        linkedListSamples.removeDuplicates_sample_2(arr_3);
        System.out.println();

        //Return Kth to Last element
        int[] arr_4 = {34, 57, 48, 39, 63, 51, 48, 39, 27, 55, 55, 61, 53};
        System.out.print("Printing the Kth to Last Element:\t");
        Node rootNode_2 = new Node(arr_4[0]);
        for(int i=1;i<arr_4.length;i++) {
            rootNode_2.appendToTrail(arr_4[i]);
        }
        Node nodeWithLastKElement = linkedListSamples.returnKthToLastElement(rootNode_2, 9);
        System.out.println(nodeWithLastKElement);

        linkedListSamples.printKthToLastElement(rootNode_2, 9);
        System.out.println();


        //Delete the middle element
        System.out.println("Deleting the middle element");
        System.out.println(rootNode_2);
        Node nodeMiddleElementDeleted = linkedListSamples.deleteMiddleElement(rootNode_2);
        System.out.println(nodeMiddleElementDeleted);
        System.out.println();

        //Partition
        System.out.println("Parition the Linked list");
        int[] arr_5 = {3, 5, 8, 5, 10, 2, 1};
        Node rootNode_3 = new Node(arr_5[0]);
        for(int i=1;i<arr_5.length;i++) {
            rootNode_3.appendToTrail(arr_5[i]);
        }
        System.out.println(rootNode_3);
        System.out.println("Patition Value: "+ 5);
        System.out.println(linkedListSamples.partitionTheList(rootNode_3, 5));

        int[] arr_6 = {3, 5, 8, 5, 10, 2, 1};
        Node rootNode_4 = new Node(arr_6[0]);
        for(int i=1;i<arr_6.length;i++) {
            rootNode_4.appendToTrail(arr_6[i]);
        }
        System.out.println(rootNode_4);
        System.out.println("Patition Value: "+ 8);
        System.out.println(linkedListSamples.partitionTheList(rootNode_4, 8));

        int[] arr_7 = {3, 5, 8, 5, 10, 2, 1};
        Node rootNode_5 = new Node(arr_7[0]);
        for(int i=1;i<arr_7.length;i++) {
            rootNode_5.appendToTrail(arr_7[i]);
        }
        System.out.println(rootNode_5);
        System.out.println("Patition Value: "+ 2);
        System.out.println(linkedListSamples.partitionTheList(rootNode_5, 2));

        System.out.println();
    }

    private Node partitionTheList(Node node, int x) {
        Node head = node;
        Node tail = node;
        while(node != null) {
            Node nextNode = node.next;
            if(node.data < x) {
                node.next = head;
                head = node;
            } else {
                tail.next = node;
                tail = node;
            }
            node = nextNode;
        }
        tail.next = null;
        return head;
    }

    private Node deleteMiddleElement(Node n) {
        Node runningNode = n;
        int length = 0;
        while(runningNode != null) {
            runningNode = runningNode.next;
            length++;
        }
        //System.out.println("Length of the list is "+length);
        runningNode = n;
        Node previousNode = runningNode;
        for(int i=0;i<length/2;i++) {
            previousNode = runningNode;
            runningNode = runningNode.next;
        }
        previousNode.next = runningNode.next;
        return n;
    }

    private int  printKthToLastElement(Node n, int k) {
        if(n == null) {
            return 0;
        }
        int i = printKthToLastElement(n.next, k) + 1;
        if(i == k)
            System.out.println(i+"th to Last element:\t\t\t\t"+n);
        return i;
    }

    private Node returnKthToLastElement(Node n, int k) {
        Node p1 = n;
        Node p2 = n;
        for(int i=0;i<k;i++) {
            if(p1 == null || p1.next == null) {
                return null;
            }
            p1 = p1.next;
        }
        while(p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }



    private void removeDuplicates_sample_2(int[] arr) {
        Node rootNode = new Node(arr[0]);
        for(int i=1;i<arr.length;i++) {
            rootNode.appendToTrail(arr[i]);
        }
        System.out.println(rootNode.toString());
        removeDuplicates_2(rootNode);
        System.out.println(rootNode.toString());
    }

    private void removeDuplicates_2(Node rootNode) {
        Node currentNode = rootNode;
        while(currentNode != null) {
            Node previousNode = currentNode;
            Node runningNode = currentNode.next;
            while (runningNode != null) {
                if(currentNode.data == runningNode.data) {
                    previousNode.next = runningNode.next;
                }
                previousNode = runningNode;
                runningNode = runningNode.next;
            }
            currentNode = currentNode.next;
        }
    }

    private void removeDuplicates_sample_1(int[] arr) {
        Node rootNode = new Node(arr[0]);
        for(int i=1;i<arr.length;i++) {
            rootNode.appendToTrail(arr[i]);
        }
        System.out.println(rootNode.toString());
        removeDuplicates_1(rootNode);
        System.out.println(rootNode.toString());
    }

    private void removeDuplicates_1(Node rootNode) {
        HashSet<Integer> integerHashSet = new HashSet<>();
        Node currentNode = rootNode;
        Node previousNode = currentNode;
        while(currentNode != null) {
            if(integerHashSet.contains(currentNode.data)) {
                previousNode.next = currentNode.next;
            } else {
                integerHashSet.add(currentNode.data);
                previousNode = currentNode;
            }
            currentNode = currentNode.next;
        }
    }

}
