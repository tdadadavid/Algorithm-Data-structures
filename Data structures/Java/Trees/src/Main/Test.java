package Main;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    Trees tree = new Trees();
    tree.insert(940);
    tree.insert(1000);
    tree.insert(100);
    tree.insert(170);
    tree.insert(40);
    tree.insert(230);
    tree.insert(-12);
    tree.insert(52);
    tree.insert(93);
    tree.insert(94);
    tree.insert(190);
    tree.insert(900);

    Trees secondTree = new Trees();
    secondTree.insert(90);
    secondTree.insert(100);
    secondTree.insert(70);
    secondTree.insert(40);
    secondTree.insert(230);
    secondTree.insert(-12);

    final int val = 70;
    System.out.println("Check if " + val + " is found");
    System.out.println("is found? " + tree.find(val));
    System.out.println("---------------------------");


    System.out.println("Pre-Order Tree Traversal...");
    tree.traversePreOrder();
    System.out.println("---------------------------");

    System.out.println("In-Order Tree Traversal...");
    tree.traverseInOrder();
    System.out.println("---------------------------");

    System.out.println("Post-Order Tree Traversal...");
    tree.traversePostOrder();
    System.out.println("---------------------------");

    System.out.println("The Height of the Tree");
    System.out.println(tree.height());
    System.out.println("---------------------------");

    //TODO check the difference btw Binary Tree and Binary Search
    // Tree and try to implement a Binary Tree.
    System.out.println("Minimum value in the Tree is?");
    System.out.println(tree.minValue());
    System.out.println("---------------------------");

    System.out.println("Maximum value in the tree is?");
    System.out.println(tree.maxValue());
    System.out.println("---------------------------");


    System.out.println("Checking the Equality of two trees...");
    final boolean status = tree.equals(secondTree);
    System.out.println(status);
    System.out.println("---------------------------");

    System.out.println("Validating a Binary search tree");
    System.out.println(tree.isBST());
    System.out.println("--------------------------------");

    final int distance = 1;
    System.out.println("The value of the node from distance " + distance);
    final ArrayList<Integer> nodes = tree.printNodeAtDistance(distance);
    nodes.forEach(System.out::println);
    System.out.println("--------------------------------");

    System.out.println("Level Order Traversal or Breadth first Traversal");
    tree.traverseLevelOrder();
    System.out.println("--------------------------------");

    System.out.println("The number of leaves in the tree");
    System.out.println(tree.countLeaves() + " leaves");
    System.out.println("--------------------------------");

    final int value = 52;
    System.out.println("Check if tree contains " + value);
    System.out.println(tree.contains(value));
    System.out.println("--------------------------------");

    System.out.println("Sum the value of all nodes in a tree");
    Trees sumTree = new Trees();
    sumTree.insert(1);
    sumTree.insert(2);
    sumTree.insert(4);
    sumTree.insert(5);
    sumTree.insert(6);
    System.out.println(sumTree.sumNodes());
    System.out.println("--------------------------------");

    System.out.println("Check if two values are siblings in a tree");
//    System.out.println(new Trees().areSiblings(0,1));
    System.out.println(tree.areSiblings(-12902, 290292));
    System.out.println("--------------------------------------------");

    System.out.println("Find the average of nodes at level.");
    Trees averageTree = new Trees();
    averageTree.insert(3);
    averageTree.insert(2);
    averageTree.insert(20);
    averageTree.insert(15);
    averageTree.insert(7);
    System.out.println(Arrays.toString(averageTree.averageOfLevel()));
    System.out.println("------------------------------------");

  }
}
