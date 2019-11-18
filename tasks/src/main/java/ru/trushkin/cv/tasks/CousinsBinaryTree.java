package ru.trushkin.cv.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    TreeNode find(TreeNode node, int val) {
        if (node == null) {
            return null;
        }
        if (node.val == val) {
            return node;
        }
        if (node.val > val) {
            return find(node.left, val);
        } else {
            return find(node.right, val);
        }
    }

    void insert(TreeNode node, int val) {
        if (node.val == val) {
            return;
        }
        if (node.val > val) {
            if (node.left == null) {
                node.left = new TreeNode(val);
            } else {
                insert(node.left, val);
            }
        } else {
            if (node.right == null) {
                node.right = new TreeNode(val);
            }
            insert(node.right, val);
        }
    }

    public void display(TreeNode n) {
        if (n == null) return;
        display(n.left);
        System.out.println(n.val);
        display(n.right);
    }

    void printLeaves(TreeNode n) {
        if (n == null) return;
        printLeaves(n.left);
        if (n.left == null && n.right == null) {
            System.out.println(n.val);
        }
        printLeaves(n.right);
    }

    public void delete(TreeNode n, int i) {
        delete(n, null, i);
    }

    public void delete(TreeNode node, TreeNode parent, int val) {
        if (node == null) {
            return;
        }
        if (node.val == val) {
            if (node.left == null && node.right == null) {
                if (parent.val > val) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            } else if (node.left == null) {
                if (parent.val > val) {
                    parent.left = node.right;
                } else {
                    parent.right = node.right;
                }
            } else if (node.right == null) {
                if (parent.val > val) {
                    parent.left = node.left;
                } else {
                    parent.right = node.left;
                }
            } else {
                TreeNode successor = getSuccessor(node);
                if (parent.val > successor.val) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
                successor.left = node.left;
            }
        }
        if (node.val > val) {
            delete(node.left, node, val);
        } else {
            delete(node.right, node, val);
        }
    }

    private TreeNode getSuccessor(TreeNode node) {
        TreeNode successorParent = node;
        TreeNode successor = node;
        TreeNode cur = node.right;
        while (cur != null) {
            successorParent = successor;
            successor = cur;
            cur = cur.left;
        }
        if (successor != node.right) {
            successorParent.left = successor.right;
            successor.right = node.right;
        }
        return successor;
    }

    public List<String> heigth(TreeNode n) {
        List<String> result = new ArrayList<>();
        heigth(n, new ArrayList<>(), result);
        return result;
    }

    public void heigth(TreeNode n, List<String> cur, List<String> max) {
        if (n == null) return;
        cur.add(n.val + "");
        heigth(n.left, cur, max);
        heigth(n.right, cur, max);
        if(cur.size() > max.size()){
            max.clear();
            max.addAll(cur);
        }
        cur.remove(n.val + "");
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    '}';
        }
    }
}
