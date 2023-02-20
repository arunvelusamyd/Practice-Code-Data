package com.crack.linklsts;

public class Node {

    Node next;
    int data;

    public Node(int data) {
        this.data = data;
    }

    public void appendToTrail(int data) {
        Node newNode = new Node(data);
        Node currentNode = this;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void deleteNode(int data) {
        Node currentNode = null;
        Node previousNode = null;

        if(this.data == data) {
            if(this.next !=null) {
                this.data = this.next.data;
                this.next = this.next.next;
            } else {
                this.data = 0;
                this.next = null;
            }
            return;
        } else {
            previousNode = this;
            currentNode = this.next;
        }

        while (currentNode.next != null) {
            if(currentNode.data == data) {
                previousNode.next = currentNode.next;
                return;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        if(currentNode.data == data)
            previousNode.next = null;
        return;
    }

    @Override
    public String toString() {
        String printString = "|"+this.data+"|";
        if(this.next != null) {
            printString = printString+this.next.data+"|"+"->"+this.next.toString();
        } else {
            printString = printString+null+"|";
        }
        return printString;
    }
}
