package Main;

public class Trees {
    Node root;

    public void insert(int value){
        // convert given value to a node object
        final Node newNode = new Node(value);

        // check if the tree is empty
       if (treeIsEmpty()) {
           root = newNode;
           return;
       }

       // initialise a pointer variable node
       Node currentNode = root;

       while(true){

           // check if the value is less than the parent node
           if (newNode.value < currentNode.value){
               if (currentNode.leftChild == null){
                   currentNode.leftChild = newNode;
                   return;
               }
               currentNode = currentNode.leftChild;
           }else {
               if (currentNode.rightChild == null){
                   currentNode.rightChild = newNode;
                   return;
               }
               currentNode = currentNode.rightChild;
           }

       }

    }

    public boolean find(int value){
        // Edge cases
        // The tree is null --> null
        // the value is not in the tree --> null
        // the value is in the tree --> return the pos

        if(treeIsEmpty()) return false;

        Node currentNode = root;

        while (currentNode != null) {

            if (currentNode.value == value) return true;

            else if (currentNode.value > value) currentNode = currentNode.leftChild;

            else currentNode = currentNode.rightChild;
        }

        return false;
    }

    public boolean treeIsEmpty(){
        return this.root == null;
    }

}
