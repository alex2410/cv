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

        CousinsBinaryTree.TreeNode n22 = new CousinsBinaryTree.TreeNode(10);
        tree.insert(n22, 5);
        tree.insert(n22, 6);
        tree.insert(n22, 2);
        tree.insert(n22, 7);
        tree.insert(n22, 12);
        tree.insert(n22, 15);
        tree.insert(n22, 1);
        tree.insert(n22, 9);
        tree.insert(n22, 8);
        System.out.println(tree.heigth(n22));
        System.out.println(tree.find(n22, 6));
        System.out.println(tree.find(n22, 2));
        System.out.println(tree.find(n22, 51));
        System.out.println(tree.find(n22, -1));
        System.out.println(tree.find(n22, 15));
        tree.display(n22);
        tree.printLeaves(n22);
        tree.delete(n22, 5);
        tree.delete(n22, 2);
        tree.delete(n22, 6);
    }
}