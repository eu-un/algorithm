package alphago;

/* Runtime : 0 ms, Memory : 39.1MB */

public class MergeTwoBinaryTrees {
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		TreeNode tn = new TreeNode();
		
		if(t1 == null && t2 == null) {
			return null;
		} else if(t1 != null && t2 == null) {
			return t1;
		} else if(t1 == null && t2 != null) {
			return t2;
		} else {
			tn.val = t1.val + t2.val;
		} // if ~ else if ~ else end
		
		tn.left = mergeTrees(t1.left, t2.left);
		tn.right = mergeTrees(t1.right, t2.right);
		
		return tn;
	}
}
