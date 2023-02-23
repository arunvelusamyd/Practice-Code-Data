package com.crack.linklsts;

public class PalindromeList {

    public static void main(String[] args) {
        int[] arr = {5,9,2,1,2,9,5};
        //int[] arr = {5,9,2,1,1,2,9,5};
        //int[] arr = {1,5,9,2,1,2,2,9,5};
        //int[] arr = {1,2,3,4,5,6,7};

        System.out.println("Creating Linked List");
        Node rootNode = new Node(arr[0]);
        for(int i=1;i<arr.length;i++) {
            rootNode.appendToTrail(arr[i]);
        }
        System.out.println(rootNode.toString());
        System.out.println();

        PalindromeList palindromeList = new PalindromeList();
        System.out.println("is ["+rootNode+"] a  palindrome? "+palindromeList.isPalindrome(rootNode));
    }

    private boolean isPalindrome(Node node) {

        Node reverse = cloneAndReverse(node);

        System.out.println(node);
        System.out.println(reverse);

        while(node != null) {
            if(node.data != reverse.data)
                return false;
            node = node.next;
            reverse = reverse.next;
        }
        return true;
    }

    private Node cloneAndReverse(Node node) {
        Node reverseNode = null;

        Node head = new Node(node.data);
        Node runningNode = node.next;

        while(runningNode != null) {
            reverseNode = new Node((runningNode.data));
            reverseNode.next = head;
            head = reverseNode;
            runningNode = runningNode.next;
        }
        return head;
    }

}
