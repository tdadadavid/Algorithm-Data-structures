package com.company;

public class Tree_Main {

    public static void main(String[] args) {

        Trees tree = new Trees();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);

        Trees secondTree = new Trees();
        secondTree.insert(7);
        secondTree.insert(4);
        secondTree.insert(9);
        secondTree.insert(1);
        secondTree.insert(6);
        secondTree.insert(8);
        secondTree.insert(10);


        System.out.println(secondTree.contains(10));
        System.out.println("1.Pre-order transversal");
        secondTree.preOrderTransversal();

        System.out.println();
        System.out.println("*********");
        System.out.println();

        System.out.println("2.Post-order transversal");
        secondTree.postOrderTransversal();

        System.out.println();
        System.out.println("*********");
        System.out.println();

        System.out.println("3.In-order transversal");
        secondTree.inOrderTransversal();

        System.out.println();
        System.out.println("*********");
        System.out.println();

        System.out.println("4.Height of a Tree");
        System.out.println(secondTree.height());


        System.out.println();
        System.out.println("*********");
        System.out.println();

        System.out.println("5.Depth of a Tree");
        System.out.println(secondTree.depth());

        System.out.println();
        System.out.println("*********");
        System.out.println();

        System.out.println("6.Smallest number in the Tree");
        System.out.println(secondTree.minimum());


        System.out.println();
        System.out.println("*********");
        System.out.println();

        System.out.println("7.Highest number in the Tree");
        System.out.println(secondTree.maximum());

        System.out.println();
        System.out.println("*********");
        System.out.println();

        System.out.println("7.Equality of two Trees");
        System.out.println(tree.equals(secondTree));
    }
}

