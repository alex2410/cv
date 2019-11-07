package ru.trushkin.cv.tasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CousinsBinaryTreeTest {

    CousinsBinaryTree tree = new CousinsBinaryTree();

    @Test
    public void testIsCousins() {
        CousinsBinaryTree.TreeNode n1 = new CousinsBinaryTree.TreeNode(1);
        CousinsBinaryTree.TreeNode n2 = new CousinsBinaryTree.TreeNode(2);
        CousinsBinaryTree.TreeNode n3 = new CousinsBinaryTree.TreeNode(3);
        CousinsBinaryTree.TreeNode n4 = new CousinsBinaryTree.TreeNode(4);
        CousinsBinaryTree.TreeNode n5 = new CousinsBinaryTree.TreeNode(5);
        n1.left = n2;
        n1.right = n3;
        n2.right = n4;
        n3.right = n5;
        Assert.assertTrue(tree.isCousins(n1, 5, 4));
    }
}