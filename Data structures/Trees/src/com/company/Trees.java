package com.company;


public class Trees {
    private Node root;

    public void insert(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
            return;
        }

        Node currentNode = root;

        while (true) {
            if (value < currentNode.value) {
                if (currentNode.leftChild == null) {
                    currentNode.leftChild = newNode;
                    break;
                }
                currentNode = currentNode.leftChild;
            } else {
                if (currentNode.rightChild == null) {
                    currentNode.rightChild = newNode;
                    break;
                }
                currentNode = currentNode.rightChild;
            }
        }
    }

    public boolean contains(int value) {
        Node currentNode = root;
        while (currentNode != null) {
            if (value < currentNode.value)
                currentNode = currentNode.leftChild;
            else if (value > currentNode.value)
                currentNode = currentNode.rightChild;
            else
                return true;
        }
        return false;
    }

    public void preOrderTransversal() {
        transversePreOrder(root);
    }

    private void transversePreOrder(Node node) {
        if (node == null)
            return;

        System.out.println(node.value);
        transversePreOrder(node.leftChild);
        transversePreOrder(node.rightChild);
    }

    public void postOrderTransversal() {
        transversePostOrder(root);
    }

    private void transversePostOrder(Node node) {
        if (node == null)
            return;

        transversePostOrder(node.leftChild);
        transversePostOrder(node.rightChild);
        System.out.println(node.value);
    }

    public void inOrderTransversal() {
        transverseInOrder(root);
    }

    private void transverseInOrder(Node node) {
        if (node == null)
            return;

        transverseInOrder(node.leftChild);
        System.out.println(node.value);
        transverseInOrder(node.rightChild);
    }

    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null)
            return -1;

        if (node.leftChild == null && node.rightChild == null)
            return 0;

        return 1 + Math.max(height(node.leftChild), height(node.rightChild));
    }

    public int depth() {
        return depth(root);
    }

    private int depth(Node node) {
        if (node == null)
            return -1;

        if (node.rightChild == null && node.leftChild == null)
            return 0;

        return 1 + Math.max(depth(node.rightChild), depth(node.leftChild));
    }

    public Object minimum() {
        return minimum(root);
    }

    private int minimum(Node node) {

        if (node == null)
            return -1;

        if (node.leftChild == null)
            return node.value;

        return minimum(node.leftChild);
    }

    public Object maximum() {
        return maximum(root);
    }

    private Object maximum(Node node) {
        if (node == null)
            return -1;

        if (node.rightChild == null)
            return node.value;

        return maximum(node.rightChild);
    }

    public boolean equals(Trees other) {
        if (other == null)
            throw new NullPointerException("Cannot compare a null tree");

        return equals(this.root, other.root);
    }


    // work on it

    private boolean equals(Node firstTreeNode, Node secondTreeNode) {
        if (firstTreeNode == null && secondTreeNode == null)
            return true;


        if (firstTreeNode != null && secondTreeNode != null)
            return firstTreeNode.value == secondTreeNode.value &&
                    equals(firstTreeNode.leftChild, secondTreeNode.leftChild) &&
                    equals(firstTreeNode.rightChild, secondTreeNode.rightChild);


        return false;
    }

    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node = " + value;
        }
    }

    //My own way(which is awful)
//    public boolean contains(int value) throws IllegalArgumentException {
//        boolean flag = false;
//        Node currentNode = root;
//
//        if (isEmpty())
//            throw new IllegalArgumentException("Tree is empty");
//
//
////        while (true){
////            if (value < currentNode.value) {
////                if (currentNode.leftChild != null) {
////                    flag = currentNode.leftChild.value == value;
////                    if (!flag)
////                        currentNode = currentNode.leftChild;
////                    else
////                        break;
////                }
////            }
////            else {
////                if (currentNode.rightChild != null) {
////                    flag = currentNode.rightChild.value == value;
////                    if (!flag)
////                        currentNode = currentNode.rightChild;
////                    else
////                        break;
////                }
////            }
////        }
//
//        return flag;
//    }
}