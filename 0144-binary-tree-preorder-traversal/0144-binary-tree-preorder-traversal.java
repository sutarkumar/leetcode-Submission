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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderPosition(result,root);
        return result;
    }
    private void preorderPosition(List<Integer> result,TreeNode root){
        if(root == null){
            return;
        }
        result.add(root.val);
        preorderPosition(result,root.left);
        preorderPosition(result,root.right);
    }
}