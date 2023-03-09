package com.king;

public class AVLTree {

    public class AVLNode {
        public int value;
        public AVLNode leftChild;
        public AVLNode rightChild;

        public AVLNode(int value){
            this.value = value;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    public AVLNode root;

    /**
     * if the root is null, insert val as the root.
     * if the val is greater than the parent node, insert to the right
     * if the val is less than parent node, insert to the left.
     */
    public AVLNode insert(int val, AVLNode currentRootNode){
        AVLNode newNode = new AVLNode(val);

        if (isEmpty())
            root = newNode;

        if (currentRootNode == null)
            return newNode;


        if (val >= currentRootNode.value){
            currentRootNode.rightChild = insert(val, currentRootNode.rightChild);
            return currentRootNode;
        }

        currentRootNode.leftChild = insert(val, currentRootNode.leftChild);
        return currentRootNode;

    }

    public void insert(int val){
        insert(val, root);
    }

    public boolean isEmpty(){
        return root == null;
    }

}
