package io.github.sandeeplakka;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This problem was recently asked by Microsoft:
 * <p>
 * Given a binary tree, find the level in the tree where the sum of all nodes on that level is the greatest.
 * <p>
 * Here's an example and some starter code.
 *
 * <pre>
 * class Node:
 *   def __init__(self, value, left=None, right=None):
 *     self.value = value
 *     self.left = left
 *     self.right = right
 *
 *   def __repr__(self):
 *     return f"(Value: {self.value} Left: {self.left} Right: {self.right})"
 *
 *
 * def tree_level_max_sum(root):
 *   # Fill this in.
 *
 * n3 = Node(4, Node(3), Node(2))
 * n2 = Node(5, Node(4), Node(-1))
 * n1 = Node(1, n2, n3)
 *
 * """
 *     1          Level 0 - Sum: 1
 *    / \
 *   4   5        Level 1 - Sum: 9
 *  / \ / \
 * 3  2 4 -1      Level 2 - Sum: 8
 *
 * """
 * </pre>
 * print(tree_level_max_sum(n1))
 * # Should print 1 as level 1 has the highest level sum
 */
public class LevelOfTreeWithMaxSum {


    public int treeLevelMaxSum(Node root) {
        if (root == null) return -1;
        int high = 0;
        int level = 0;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int len = queue.size();
            int curLevel = 0;
            int curHigh = 0;
            for (int i = 0; i < len; i++) {
                Node node = queue.poll();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
                curHigh += node.value;
            }
            if (curHigh > high) {
                high = curHigh;
                level = curLevel;
            }
            curLevel++;
        }
        return level;
    }

    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
}
