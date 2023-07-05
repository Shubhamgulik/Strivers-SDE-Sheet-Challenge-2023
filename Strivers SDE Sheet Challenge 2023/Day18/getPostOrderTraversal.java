import java.util.* ;
import java.io.*; 
/*
    
    Following is the Binary Tree node structure:

    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.data = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
           this.data = val;
            this.left = left;
            this.right = right;
        }
    }

*/

public class Solution {
    public static List < Integer > getPostOrderTraversal(TreeNode root) {
    	// Write your code here.
        Stack<TreeNode> st1=new Stack<>();
        Stack<TreeNode> st2=new Stack<>();
        List < Integer > list = new ArrayList < > ();
        if(root == null) return list;
        
        st1.push(root);

        while(!st1.isEmpty()){
                TreeNode node = st1.pop();
                st2.push(node);

                if(node.left != null) st1.push(node.left);
                if(node.right != null) st1.push(node.right);

        }

        while(!st2.isEmpty()){
            list.add(st2.pop().data);
        }

        return list;

    }
}