package ru.trushkin.cv.tasks;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/cousins-in-binary-tree/
 */
public class CousinsBinaryTree {

    Map<Integer, Integer> depth = new HashMap<>();
    Map<Integer, TreeNode> parents = new HashMap<>();

    public boolean isCousins(TreeNode root, int x, int y) {
        traverse(root, null, 0);
        return depth.get(x).equals(depth.get(y)) && !parents.get(x).equals(parents.get(y));
    }

    private void traverse(TreeNode node, TreeNode parent, int currentDepth) {
        if (node == null) {
            return;
        }
        depth.put(node.val, currentDepth);
        parents.put(node.val, parent);
        traverse(node.left, node, currentDepth + 1);
        traverse(node.right, node, currentDepth + 1);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }
}
