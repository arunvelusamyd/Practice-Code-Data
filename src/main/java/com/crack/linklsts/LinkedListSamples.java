package com.crack.linklsts;

import java.util.HashSet;

public class LinkedListSamples {

    public static void main(String[] args) {
        int[] arr = {34, 57, 48, 39, 63, 51, 48, 39, 27, 55, 55, 61, 53};

        //Creating Linked List
        Node rootNode = new Node(arr[0]);
        for(int i=1;i<arr.length;i++) {
            rootNode.appendToTrail(arr[i]);
        }
        System.out.println(rootNode.toString());

        //Deleting node from Linked List
        rootNode.deleteNode( 51);
        rootNode.deleteNode( 34);
        rootNode.deleteNode( 53);
        System.out.println(rootNode.toString());

        //Append to Linked List
        rootNode.appendToTrail(51);
        rootNode.appendToTrail(34);
        rootNode.appendToTrail(53);
        System.out.println(rootNode.toString());

        //Remove Duplicates from Linked List
        int[] arr_2 = {34, 57, 48, 39, 63, 51, 48, 39, 27, 55, 55, 61, 53};
        LinkedListSamples linkedListSamples = new LinkedListSamples();
        linkedListSamples.removeDuplicates_sample_1(arr_2);
        int[] arr_3 = {34, 53,34, 57, 48, 39, 63, 51, 48, 39, 63, 51, 27, 55, 55, 61, 53, 61};
        linkedListSamples.removeDuplicates_sample_2(arr_3);
        //|34|57|->|57|48|->|48|39|->|39|63|->|63|51|->|51|27|->|27|55|->|55|61|->|61|53|->|53|null|
        //|34|53|->|53|57|->|57|48|->|48|39|->|39|63|->|63|51|->|51|27|->|27|55|->|55|61|->|61|61|->|61|null|
        //|34|53|->|53|57|->|57|48|->|48|39|->|39|63|->|63|51|->|51|27|->|27|55|->|55|61|->|61|null|
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
