package com.crack.linklsts;

public class SumList {

    public static void main(String[] args) {
        int[] arr_1 = {7,1,6,1,2};
        int[] arr_2 = {5,9,2};

        //Creating Linked List
        System.out.println("Creating Linked List");
        Node rootNode_1 = new Node(arr_1[0]);
        for(int i=1;i<arr_1.length;i++) {
            rootNode_1.appendToTrail(arr_1[i]);
        }
        System.out.println(rootNode_1.toString());
        System.out.println();

        System.out.println("Creating Linked List");
        Node rootNode_2 = new Node(arr_2[0]);
        for(int i=1;i<arr_2.length;i++) {
            rootNode_2.appendToTrail(arr_2[i]);
        }
        System.out.println(rootNode_2.toString());
        System.out.println();
        //Sum digits in reverse order
        SumList sumList = new SumList();
        Node sum= sumList.sumDigitsInReverseOrder(rootNode_1, rootNode_2, 0);
        System.out.println("Sum digits in reverse order");
        System.out.println(sum.toString());
        //Sum digits in forward order
        sum = sumList.sumDigitsInForwardOrder(rootNode_1, rootNode_2);
        System.out.println("Sum digits in forward order");
        System.out.println(sum.toString());
    }

    private Node sumDigitsInReverseOrder(Node num1, Node num2, int carry) {
        if(num1 == null && num2 == null)
            return null;
        int val = carry;
        if(num1 != null)
            val += num1.data;
        if(num2 != null)
            val += num2.data;
        Node sum = new Node(val%10);
        sum.next = sumDigitsInReverseOrder(num1!= null?num1.next:null,
                                            num2!=null?num2.next:null,
                                            val>=10?1:0);
        return sum;
    }

    private Node sumDigitsInForwardOrder(Node num1, Node num2) {
        int noOfDigits_1 = num1.getLength();
        int noOfDigits_2 = num2.getLength();
        int numOfDigits = 0;
        if(noOfDigits_1 > noOfDigits_2) {
            numOfDigits = noOfDigits_1;
            num2 = addNodesInFront(num2, noOfDigits_1-noOfDigits_2, 0);
        } else {
            numOfDigits = noOfDigits_2;
            num1 = addNodesInFront(num1, noOfDigits_2-noOfDigits_1, 0);
        }
        return sumDigits(num1, num2);
    }

    private Node sumDigits(Node num1, Node num2) {
        Node nextNode = null;
        int carry = 0;
        if(num1.next != null && num2.next!=null) {
            nextNode = sumDigits(num1.next, num2.next);
            carry = nextNode.data>=10?1:0;
            nextNode.data = nextNode.data%10;
        }
        Node sum = new Node(num1.data + num2.data+carry);
        sum.next = nextNode;
        return sum;
    }

    private Node addNodesInFront(Node num, int numOfNodes, int val) {
        for(int i=0;i<numOfNodes;i++) {
            Node node = new Node(val);
            node.next = num;
            num = node;
        }
        return num;
    }
}
