/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> arr = new ArrayList<>();
        dfs(root,arr);
        // Array.sort(arr);
        return arr.get(k-1);
    }

    public static void dfs(TreeNode root, List arr){
        if(root == null){
            return;
        }
        dfs(root.left,arr);
        arr.add(root.val);
        dfs(root.right,arr);
    }
}