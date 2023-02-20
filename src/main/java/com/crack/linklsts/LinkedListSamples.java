package com.crack.linklsts;

public class LinkedListSamples {

    public static void main(String[] args) {
        int[] arr = {34, 57, 48, 39, 63, 51, 27, 55, 61, 53};
        LinkedListSamples linkedListSamples = new LinkedListSamples();

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
        System.out.println(rootNode.t-oString());

        //Remove Duplicates from Linked List
    }

}
