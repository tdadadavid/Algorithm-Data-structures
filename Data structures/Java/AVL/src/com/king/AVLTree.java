package com.king;

public class AVLTree {

    private AVLNode givenRoot;

    public static class AVLNode {
        public int value;
        public int height;
        public AVLNode leftChild;
        public AVLNode rightChild;

        public AVLNode(int value){
            this.value = value;
            this.leftChild = null;
            this.rightChild = null;
        }

        public boolean isLeafNode(){
            return this.leftChild == null && this.rightChild == null;
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

        if (isEmpty()) return new AVLNode(val);

        if (currentRootNode == null) return newNode;

        if (val >= currentRootNode.value)
            currentRootNode.rightChild = insert(val, currentRootNode.rightChild);
        else
            currentRootNode.leftChild = insert(val, currentRootNode.leftChild);

        currentRootNode.height = height(currentRootNode);

        // balance factor
        if (isLeftHeavy(currentRootNode)) System.out.println(currentRootNode.value+ " is LEFT HEAVY");
        else if (isRightHeavy(currentRootNode)) System.out.println(currentRootNode.value + " is RIGHT HEAVY");
        else System.out.println(currentRootNode.value+ " is balanced");

        return currentRootNode;
    }

    private boolean isLeftHeavy(AVLNode node){
        return balanceFactor(node) > 1;
    }

    private boolean isRightHeavy(AVLNode node){
        return balanceFactor(node) < -1;
    }

    private int balanceFactor(AVLNode node){
        return height(node.leftChild) - height(node.rightChild);
    }


    private int height(AVLNode givenRoot){
        // return -1 for an empty tree.
        if (givenRoot == null) return -1;

        if (givenRoot.isLeafNode()) return 0;

        return 1 + Math.max(height(givenRoot.leftChild), height(givenRoot.rightChild));
    }

    public void insert(int val){
        root = insert(val, root);
    }

    public boolean isEmpty(){
        return root == null;
    }

}
