package Main;

import java.util.ArrayList;

/**
 * This a Binary Search Tree class.
 */

public class Trees {
  private Node root;

  public void insert(int value) {
    // convert given value to a node object
    final Node newNode = new Node(value);

    // check if the tree is empty
    if (treeIsEmpty()) {
      root = newNode;
      return;
    }

    // initialise a pointer variable node
    Node currentNode = root;

    while (true) {

      // check if the value is less than the parent node
      if (newNode.value < currentNode.value) {
        if (currentNode.leftChild == null) {
          currentNode.leftChild = newNode;
          return;
        }
        currentNode = currentNode.leftChild;
      } else {
        if (currentNode.rightChild == null) {
          currentNode.rightChild = newNode;
          return;
        }
        currentNode = currentNode.rightChild;
      }

    }
    // Check how to implement insert recursively...TODO
  }

  public boolean find(int value) {
    // Edge cases
    // The tree is null --> null
    // the value is not in the tree --> null
    // the value is in the tree --> return the pos

    if (treeIsEmpty()) return false;

    Node currentNode = root;

    while (currentNode != null) {

      if (currentNode.value == value) return true;

      else if (currentNode.value > value) currentNode = currentNode.leftChild;

      else currentNode = currentNode.rightChild;
    }

    return false;
  }

  public int sumNodes(){
    return this.sumNodes(this.root);
  }

  //TODO work on function "areSiblings"
  private int sumNodes(Node node){
    // Base case.
    if (node == null) return 0;

    return node.value + sumNodes(node.leftChild) + sumNodes(node.rightChild);
  }

  public boolean contains(int value){
    return this.contains(this.root, value);
  }

  private boolean contains(Node node, int value){
    if (node == null) return false;

    if (node.value == value) return true;

    return contains(node.leftChild, value) || contains(node.rightChild, value);
  }


  public void traverseLevelOrder(){
    this.traverseLevelOrder(this.root);
  }

  private void traverseLevelOrder(Node node){
    for (int i = 0; i <= height(node); i++)
      this.printNodeAtDistance(i).forEach(System.out::println);
  }


  public int countLeaves(){
    return this.countLeaves(this.root);
  }

  /**
   * @description The algorithm is basically anchored on the understanding of the
   * height of the tree
   * Height of tree == Height of the root == Number of Edges from the leaf node with the longest edges to the root
   *
   * Another question to ask is what is the simplest case for this problem?
   * Answer: when the root is empty (ie a tree with only root) then we return 1
   *
   * Understanding this basic concepts coupled with the fact that every node in a
   * Binary Search Tree is root (except leaves). We can iteratively traverse the
   * tree checking if every node we encounter is a leaf node, if true increment the number of
   * leaf nodes else continue till the whole tree is traversed.
   *
   * Time complexity: O(n)
   * Space complexity: O(1)
   * @param node
   * @return
   */
  private int countLeaves(Node node) {
    int numberOfLeafNodes = 0;

    final int height = height(node); // O(n) time complexity

    for (int i = 0; i <= height; i++) { // O(n) time complexity
      if (isLeafNode(node)) return numberOfLeafNodes + 1; // O(1) time complexity
      numberOfLeafNodes = countLeaves(node.leftChild) + countLeaves(node.rightChild); //O(n) time complexity.
    }

    return numberOfLeafNodes;
  }


  public ArrayList<Integer> printNodeAtDistance(int distance){
    if (distance < 0)
      throw new IllegalArgumentException("The distance cannot be a negative number.");

    ArrayList<Integer> list = new ArrayList<>();
    this.printNodeAtDistance(this.root, distance, list);

    return list;
  }

  /**
   * @description This method is to print the node(s) at a particular
   * distance from the root node but how? We are going to do this by
   * understanding this basic problem which is "When the distance is 0,
   * we are to print the value of the current node". So we keep decrementing
   * the value of distance as we move node the tree from the root and  when
   * we get to the desired distance we print the value.
   *
   * What if the distance given is larger than the height of the tree🤔?
   * This edge is handled by checking if the node is null
   *
   * For example:
   * 1) When distance is 0 -> Print the current node, the current node of
   * every tree is the root node, so the root is going to be printed.
   *
   * 2) When distance is 1 -> move to the right and left subtree and decrement
   * the value of distance and pass it down the recursive calls. This operation
   * makes the value of the distance to be 0 and the current node in each recursive
   * call(of each subtree) is printed to the console. Then the recursive calls on
   * the stack frame are popped out/removed without any value returned(Line 104 is responsible for this).
   *
   * Note: It is important for you to know that without Line 161, the algorithm will run/yield
   * correct results but will be less performant, because it will continue to recursively call itself
   * till it reaches a node with a null value, then it will use the edge case at Line 157. This will
   * make the value of distance to run into negative values after it reaches the desired distance.
   * Try debugging this function without the return statement on Line 104 to see it practically.
   *
   * @param node
   * @param distance
   */
  private void printNodeAtDistance(Node node, int distance, ArrayList<Integer> list){
    if (node == null) return;

    if (distance == 0) {
      list.add(node.value);
      return;
    }

    printNodeAtDistance(node.leftChild, distance - 1, list);
    printNodeAtDistance(node.rightChild, distance - 1, list);
  }

  public void swapRoot(){
    Node temp = this.root.leftChild;
    this.root.leftChild = this.root.rightChild;
    this.root.rightChild = temp;
  }

  public boolean isBST(){
    return validate(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  //TODO draw the data flow of this algorithm.
  private boolean validate(Node root, int minValue, int maxValue){
    if (root == null) return true;

    if(root.value < minValue|| root.value > maxValue)
      return false;

    return  validate(root.leftChild, Integer.MIN_VALUE, root.value) &&
            validate(root.rightChild, root.value, Integer.MAX_VALUE);
  }


  public boolean equals(Trees other){
    return equals(this.root, other.root);
  }

  /**
   * @Explanation Here we use the Pre-Order traversal algorithm (Root->Left->Right) to
   * check if two trees are the same.
   * What makes two trees equal?
   * Firstly they must have the same height. Trees with different height are not equal.
   * Now it is not only to have the same height but to also have the same value at every
   * node, so we have to traverse both tree comparing both tree nodes to see if they're equal
   * in value, Not just height.
   *
   * Time Complexity: O(n) we are looking at every node in the tree. The time complexity grows/shrinks
   * as both tree grow and shrink.
   * Space Complexity: O(1) we are using constant space for the algorithm.
   *
   * @param first
   * @param second
   * @return Boolean
   */

  private boolean equals(Node first, Node second){

    // if the first tree is null and the second tree is null
    // return true, null == null.
    if (first == null && second == null) return true;


    // if both trees are not null, then check if the value of the roots
    // of both trees are equal, go on to compare the left subtree and then
    // the right subtree. The Traversal algorithm for this is Pre-Order (Root->Left->Right)
    if (first != null && second != null)
      return first.value == second.value &&
              equals(first.leftChild, second.leftChild) &&
              equals(first.rightChild, second.rightChild);

    // if at some point one is null and the other is not null then return false.
    return false;
  }

  public int maxValue(){
    return this.max(this.root);
  }

  private int max(Node node){
    if (node == null) return -1;

    if (node.rightChild == null) return node.value;

    return max(node.rightChild);
  }

  public int minValue(){
    return min(this.root);
  }

  /**
   * @Explanation This algorithm is for Binary Search Tree
   * Time complexity for this is O(log n).
   * @param node
   * @return
   */

  private int min(Node node){
    if (node == null)
      throw new IllegalStateException("Cannot find minimum value in an empty tree");

    if (node.leftChild == null) return node.value;

    return min(node.leftChild);
  }

//  public int min(){
//    return min(this.root);
//  }


//  /**
//   * @descr This algorithm is for Binary Trees not Binary Search Trees.
//   * @param root
//   * @return
//   */
//  private int min(Node root){
//
//    if (isLeafNode(root)) return root.value;
//
//    int minLeftValue = min(root.leftChild);
//    int minRightValue = min(root.rightChild); //TODO
//
//    return Math.min(Math.min(minLeftValue, minRightValue), root.value);
//  }

  public int height(){
    return height(this.root);
  }


  /**
   * @descr The height of a tree is the maximum number of
   * edges from the leaf nodes of tree to the root.
   *
   * @note The traversal algorithm used for this function is
   * POST-ORDER, since we are going down the leaves the moving
   * up the tree. LEFT -> RIGHT -> ROOT
   * @param root
   * @return
   */
  private int height(Node root) {

    //This condition guards against null values ie
    // when the tree is empty and a user requests for its height.
    if (root == null) return -1;

    // Base condition to stop the recursive function.
    // When we reach the leaf node return 0.
    // The Height of a leaf node is 0.
    if (isLeafNode(root)) return 0;

    // Formula for calculating the height of a tree.
    // return the number of edges on the longest
    // path from a leaf node to the root of the tree.
    return 1 + Math.max(height(root.leftChild) , height(root.rightChild));
  }


  public void traversePreOrder() {
    traversePreOrder(this.root);
  }

  //pre-order: Root -> Left -> Right
  private void traversePreOrder(Node root) {
    if (root == null) return;

    System.out.println(root.value);
    traversePreOrder(root.leftChild);
    traversePreOrder(root.rightChild);
  } 

  public void traverseInOrder() {
    traverseInOrder(this.root);
  }

  // In-Order: Left -> Root -> Right
  private void traverseInOrder(Node root) {
    if (root == null) return;

    traverseInOrder(root.leftChild);
    System.out.println(root.value);
    traverseInOrder(root.rightChild);
  }

  public void traversePostOrder() {
    traversePostOrder(this.root);
  }

  // Post-Order: Left -> Right -> Root.
  private void traversePostOrder(Node root) {
    if (root == null) return;

    traversePostOrder(root.leftChild);
    traversePostOrder(root.rightChild);
    System.out.println(root.value);
  }

  private boolean isLeafNode(Node node){
    return node.leftChild == null && node.rightChild == null;
  }

  private boolean treeIsEmpty() {
    return this.root == null;
  }

  @Override
  public String toString() {
    return String.valueOf(this.root.value);
  }

}
