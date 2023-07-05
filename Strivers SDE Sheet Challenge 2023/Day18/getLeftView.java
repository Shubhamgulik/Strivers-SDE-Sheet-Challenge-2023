import java.util.* ;

// import javax.swing.tree.TreeNode;

import java.io.*; 
/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T> 
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) 
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

public class Solution 
{
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) 
    {
        //    Write your code here.
        ArrayList<Integer> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();

        if(root==null) return list;

        q.offer(root);

        while(!q.isEmpty()){
            int n = q.size();

            TreeNode<Integer> temp = q.peek();
            list.add(temp.data);

            while(n>0){
                TreeNode<Integer> node = q.poll();
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
                n--;
            }
        }

        return list;

    }
}
