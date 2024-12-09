package com.crack.linklsts;

public class LinkedListInsection {

    public static void main(String[] args) {
        int[] arr_1 = {3,1,5,2,7,6,4,10};
        int[] arr_2 = {9,8};

        System.out.println("Creating Linked List");
        Node rootNode_1 = new Node(arr_1[0]);
        for(int i=1;i<arr_1.length;i++) {
            rootNode_1.appendToTrail(arr_1[i]);
        }
        System.out.println(rootNode_1.toString());

        Node rootNode_2 = new Node(arr_2[0]);
        rootNode_2.appendToTrail(arr_2[1]);
        rootNode_2.next.next = rootNode_1.next.next.next.next;
        System.out.println(rootNode_2.toString());
        System.out.println();

        LinkedListInsection linkedListInsection = new LinkedListInsection();
        Node node = linkedListInsection.findIntersection(rootNode_1, rootNode_2);
        System.out.println(node);
    }

    private Node findIntersection(Node node1, Node node2) {
        Result r1 = getTailAndSize(node1);
        Result r2 = getTailAndSize(node2);

        Node longerList = r1.size>r2.size? node1:node2;
        Node shorterList = r1.size<r2.size? node1:node2;
        int sizeDiff = Math.abs(r1.size - r2.size);
        for(int i=0;i<sizeDiff;i++) {
            longerList = longerList.next;
        }
        while (longerList != shorterList) {
            longerList = longerList.next;
            shorterList = shorterList.next;
        }
        return longerList;
    }

    private  class Result {
        Node tail;
        int size;
        public Result(Node tail, int size) {
            this.tail = tail;
            this.size = size;
        }
    }
    private Result getTailAndSize(Node node) {
        int size = 1;
        while(node.next != null) {
            size++;
            node = node.next;
        }
        Result result = new Result(node, size);
        return result;
    }

}
