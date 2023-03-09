package com.king;

public class AVLTree {

    public static class AVLNode {
        public int value;
        public AVLNode leftChild;
        public AVLNode rightChild;

        public AVLNode(int value){
            this.value = value;
            this.leftChild = null;
            this.rightChild = null;
        }

        @Override
        public String toString() {
            return "AVLNode{" +
                    "value=" + value +
                    '}';
        }
    }

    public AVLNode root;

    /**
     * if the root is null, insert val as the root.
     * if the val is greater than the parent node, insert to the right
     * if the val is less than parent node, insert to the left.
     */
    private AVLNode insert(int val, AVLNode currentRootNode){
        AVLNode newNode = new AVLNode(val);

        if (currentRootNode == null)
            return newNode;


        if (val >= currentRootNode.value)
            currentRootNode.rightChild = insert(val, currentRootNode.rightChild);
        else
            currentRootNode.leftChild = insert(val, currentRootNode.leftChild);


        return currentRootNode;
    }

    public void insert(int val){
        if (isEmpty()) {
            root = new AVLNode(val);
            return;
        };

        insert(val, root);
    }

    public boolean isEmpty(){
        return root == null;
    }

}
