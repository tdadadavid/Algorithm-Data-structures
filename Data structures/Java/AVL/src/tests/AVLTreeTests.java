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

        AVLTree testAVLTree2 = new AVLTree();

        testAVLTree2.insert(10);
        testAVLTree2.insert(30);
        testAVLTree2.insert(20);

        assertEquals(2, testAVLTree2.root.height);
        assertEquals(1, testAVLTree2.root.rightChild.height);
        assertEquals(null, testAVLTree2.root.leftChild);
        assertEquals(1, testAVLTree2.root.rightChild.height);
    }

    @Test
    public void shouldGiveUsMaxDepth(){
        AVLTree testTree = new AVLTree();

        // act
//        testTree.insert(100);
//        testTree.insert(50);
//        testTree.insert(20);
//        testTree.insert(80);
//        testTree.insert(60);
//        testTree.insert(300);
//        testTree.insert(200);
//        testTree.insert(400);
//        testTree.insert(350);
//        testTree.insert(500);
//        testTree.insert(450);

        testTree.insert(1);
        testTree.insert(2);
        testTree.insert(3);
        testTree.insert(4);
        testTree.insert(5);



        assertEquals(5, testTree.maximumDepth());
    }
}
