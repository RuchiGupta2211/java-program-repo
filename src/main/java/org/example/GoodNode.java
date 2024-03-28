package org.example;

public class GoodNode {

    public static void main(String[] args) {
        TreeNode t20 = new TreeNode(3);
        TreeNode t10 = new TreeNode(1, t20, null);

        TreeNode t21 = new TreeNode(1);
        TreeNode t22 = new TreeNode(5);
        TreeNode t11 = new TreeNode(4, t21, t22);

        TreeNode root = new TreeNode(3, t10, t11);
        System.out.println(countGoodNodes(root, root.val));
    }
    public static int countGoodNodes(TreeNode root, int val) {
        if (root == null ) { return 0;}
        int count = root.val >= val ? 1 : 0;
        System.out.println("root value: " + root.val  + " value: " + val + " Count : " + count);
        count += countGoodNodes(root.left, Math.max(val, root.val));
        count += countGoodNodes(root.right, Math.max(val, root.val));
       return count;
    }



}
