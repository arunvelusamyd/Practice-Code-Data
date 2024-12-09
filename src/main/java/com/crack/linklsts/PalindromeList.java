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
        System.out.println("is ["+rootNode+"] a  palindrome? "+palindromeList.isPalindrome_1(rootNode));
        System.out.println("is ["+rootNode+"] a  palindrome? "+palindromeList.isPalindrome_2(rootNode,rootNode.getLength()).result);
    }

    private class ResultNode {
        Node linkedListNode;
        boolean result;
        public ResultNode(Node linkedListNode, boolean result) {
            this.linkedListNode = linkedListNode;
            this.result = result;
        }
    }

    private ResultNode isPalindrome_2(Node head, int length) {
        if(head == null || length <= 0)
            return new ResultNode(head, true);
        else if(length == 1)
            return new ResultNode(head.next, true);
        ResultNode res = isPalindrome_2(head.next, length-2);
        if(!res.result||res.linkedListNode==null)
            return res;
        res.result = (head.data==res.linkedListNode.data);
        res.linkedListNode = res.linkedListNode.next;
        return res;
    }

    private boolean isPalindrome_1(Node node) {
        Node reverse = cloneAndReverse(node);
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
