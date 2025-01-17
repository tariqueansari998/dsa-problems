package org.example.challenges;

/**
 * Problem statement : Write a function to get the closest node value from a given target in a BST
 *         10
 *       /   \
 *      5     15
 *    /  \   /   \
 *   2   5  13   22
 *           \
 *           14
 *
 *   Target = 12. Result =13
 *
 */

public class BSTClosestValue {

    public int getClosestBSTValue(BST tree, int targetValue){
        int difference = Integer.MAX_VALUE;
        int closestValue = 0;

        while (tree != null) {
            int currentDifference = Math.abs(tree.value - targetValue);
            if(currentDifference < difference){
                difference = currentDifference;
                closestValue = tree.value;
            }

            if (targetValue > tree.value) {
                tree = tree.rightChild;
            } else if (targetValue < tree.value) {
                tree = tree.leftChild;
            } else {
                return tree.value;
            }


        }

        return closestValue;
    }

    static class BST{
        int value;
        BST leftChild;
        BST rightChild;

        public BST(int value){
            this.value = value;
        }
    }

}
