package tests;


import com.king.AVLTree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AVLTreeTests {

    @Test
    public void shouldInsert(){
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
    public void shouldHaveCorrectHeights(){
        AVLTree testAVLTree = new AVLTree();

        // act
        testAVLTree.insert(10);
        testAVLTree.insert(20);
        testAVLTree.insert(3);

        // assert
        assertEquals(1, testAVLTree.root.height);
        assertEquals(0, testAVLTree.root.rightChild.height);
        assertEquals(0, testAVLTree.root.leftChild.height);
    }
}
