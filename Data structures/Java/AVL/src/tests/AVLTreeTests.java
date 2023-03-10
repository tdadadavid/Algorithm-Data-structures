package tests;


import com.king.AVLTree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AVLTreeTests {

    @Test
    private void shouldInsert(){
        AVLTree testAVLTree = new AVLTree();

        // act
        testAVLTree.insert(10);
        testAVLTree.insert(20);
        testAVLTree.insert(3);

        // assert
        assertEquals(10, testAVLTree.root.value);
        assertEquals(20, testAVLTree.root.rightChild.value);
        assertEquals(3, testAVLTree.root.leftChild.value);

    }

    @Test
    private void shouldHaveCorrectHeights(){
        AVLTree testAVLTree = new AVLTree();

        // act
        testAVLTree.insert(10);
        testAVLTree.insert(20);
        testAVLTree.insert(3);

        // assert
        assertEquals(1, testAVLTree.root.height);
        assertEquals(0, testAVLTree.root.rightChild.height);
        assertEquals(0, testAVLTree.root.leftChild.height);

        AVLTree testAVLTree2 = new AVLTree();

        testAVLTree2.insert(10);
        testAVLTree2.insert(20);
        testAVLTree2.insert(30);

        assertEquals(2, testAVLTree2.root.height);
        assertEquals(1, testAVLTree2.root.rightChild.height);
        assertEquals(null, testAVLTree2.root.leftChild);
        assertEquals(1, testAVLTree2.root.rightChild.height);
    }

//    @Test
//    private void shouldReBalance(){
//        AVLTree testTree = new AVLTree();
//    }
}
