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

//        currentRootNode.height = height(currentRootNode);

//        balance(currentRootNode);

        return currentRootNode;
    }


    public int maximumDepth(){
        return 1 + this.maximumDepth(root, 0,0);
    }

    private int maximumDepth(AVLNode node, int currentDepth, int maximumDepth){

        // check if the current is null
        if (node == null) return maximumDepth;

        if (currentDepth > maximumDepth)
            maximumDepth = currentDepth;

        int leftDepth = maximumDepth(node.leftChild, currentDepth+1, maximumDepth);
        int rightDepth = maximumDepth(node.rightChild, currentDepth+1, maximumDepth);

        return Math.max(leftDepth, rightDepth);
    }


    private void balance(AVLNode node){
        // balance factor
        if (isLeftHeavy(node)) {
            if (balanceFactor(node.leftChild) > 0)
                System.out.println("Right Rotate " + node.leftChild.value);
            System.out.println("Left Rotate " + node.value);
        }
        else if (isRightHeavy(node)) {
            if (balanceFactor(node.rightChild) > 0)
                System.out.println("Left Rotate " + node.rightChild.value);
            System.out.println("Right Rotate " + node.value);
        }
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
