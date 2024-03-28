package org.example;

public class DistributeCoins {
    static int moves = 0;
    public static void main(String[] args) {
        TreeNode t21 = new TreeNode(0);
        TreeNode t22 = new TreeNode(0);
        TreeNode t11 = new TreeNode(0, t21, t22);

        TreeNode t12 = new TreeNode(0);

        TreeNode root = new TreeNode(5, t11, t12);

        System.out.println(countMoves(root));
    }
    public static int countMoves(TreeNode root) {
        distributeCoins(root);
        return moves;
    }
    public static int distributeCoins(TreeNode root) {
        if (root == null) return 0;
        int coinsLeft = distributeCoins(root.left);
        int coinsRight = distributeCoins(root.right);
        int coins = coinsLeft + coinsRight;
        coins += root.val - 1;
        System.out.println("coins are: " + coins);
        moves += Math.abs(coins);
        System.out.println("moves are: " + moves);
        return coins;
    }

}
