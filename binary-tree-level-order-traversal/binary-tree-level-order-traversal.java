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
   List<List<Integer>> li;
    Solution()
    {
        li = new ArrayList<>();
    }
    void god(TreeNode root,int c)
    {
        if(root==null)return;
        if(li.size()<=c)
        {
            List<Integer> x = new ArrayList<>();
            li.add(x);
        }
        li.get(c).add(root.val);
        god(root.left,c+1);
        god(root.right,c+1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        god(root,0);
        return li;
    }
}