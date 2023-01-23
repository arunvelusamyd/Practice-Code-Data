package com.te.sorting;

import com.sun.source.tree.Tree;

import java.util.Arrays;

public class TreeSort {

    private class Node {
        int value;
        Node leftNode;
        Node rightNode;
    }

    public int[] doTreeSort(int arr[]) {
        Node node = createBST(arr);
        sortArrayFromBST(node, arr, 0);
        return arr;
    }

    private Node createBST(int[] arr) {
        Node node = null;
        for(int i=0;i<arr.length;i++) {
            node = addNodeToBST(node,arr[i]);
        }
        return node;
    }

    private Node addNodeToBST(Node node, int val) {
        if(node == null) {
            node = new Node();
            node.value = val;
        } else {
            if(val > node.value)
                node.rightNode = addNodeToBST(node.rightNode, val);
            else
                node.leftNode = addNodeToBST(node.leftNode, val);
        }
        return node;
    }

    private int sortArrayFromBST(Node node, int[] arr, int idx) {
        if(node.leftNode != null)
            idx = sortArrayFromBST(node.leftNode, arr, idx);
        arr[idx++] = node.value;
        if(node.rightNode != null)
            idx = sortArrayFromBST(node.rightNode, arr, idx);
        return idx;
    }

}
