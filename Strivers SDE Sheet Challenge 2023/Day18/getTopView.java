import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure:

    class BinaryTreeNode {
		int val;
		BinaryTreeNode left;
		BinaryTreeNode right;

		BinaryTreeNode(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

************************************************************/

public class Solution {
	static class Pair{
		 BinaryTreeNode node;
		 int hd;

		Pair(BinaryTreeNode node, int hd){
			this.node = node;
			this.hd = hd;
		}
	}
	public static ArrayList<Integer> getTopView(BinaryTreeNode root) {
		// Write your code here.
		
		ArrayList<Integer> list=new ArrayList<>();
		if(root == null) return list;
		
		TreeMap<Integer,Integer> map=new TreeMap<>();
		Queue<Pair> q=new LinkedList<>();

		q.offer(new Pair(root,0));

		while(!q.isEmpty()){
			Pair pair=q.remove();
			int hd = pair.hd;
			BinaryTreeNode node=pair.node;
			// System.out.println(node.val);
			if(map.get(hd) == null) map.put(hd,node.val);

			if(node.left != null) q.offer(new Pair(node.left, hd-1));
            if(node.right != null) q.offer(new Pair(node.right, hd+1));
		}

		// Collections.sort(map,(a,b)->a-b);

		for(Map.Entry<Integer,Integer> entry: map.entrySet()){
			list.add(entry.getValue());
		}

		return list;


	}
}



















