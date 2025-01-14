package org.example.challenges.bst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BSTClosestValueTest {

    BSTClosestValue bstClosestValue = new BSTClosestValue();

    @Test
    public void shouldReturnClosestValueInBST(){
        var root = new BSTClosestValue.BST(10);
        root.leftChild = new BSTClosestValue.BST(5);
        root.leftChild.leftChild = new BSTClosestValue.BST(2);
        root.leftChild.leftChild.leftChild = new BSTClosestValue.BST(1);
        root.leftChild.rightChild = new BSTClosestValue.BST(5);
        root.rightChild = new BSTClosestValue.BST(15);
        root.rightChild.leftChild = new BSTClosestValue.BST(13);
        root.rightChild.leftChild.rightChild = new BSTClosestValue.BST(14);
        root.rightChild.rightChild = new BSTClosestValue.BST(22);

        Assertions.assertEquals(13, bstClosestValue.getClosestBSTValue(root,12));


    }
}
