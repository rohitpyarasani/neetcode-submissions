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
    public int maxDepth(TreeNode root) {
        // if(root == null) return 0;
        // int leftHeight = maxDepth(root.left);
        // int rightHeight = maxDepth(root.right);

        // return Math.max(leftHeight,rightHeight)+1;

        Queue<TreeNode> node = new LinkedList<>();
        if(root !=null)
        {
            node.offer(root);
        }
        int level = 0;
        while(!node.isEmpty()){
            level++;
            int size = node.size();
            for(int i=0;i<size;i++){
                
                TreeNode treeNode = node.poll();
                if(treeNode.left !=null) node.offer(treeNode.left);
                if(treeNode.right !=null) node.offer(treeNode.right);
            }
            
        }return level;
    }
}
