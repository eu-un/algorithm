package alphago;

public class MaximumDepthBinaryTree {
	int maxDepth(TreeNode root) {
		int leftDepth, rightDepth;
		
		if(root == null) {
			return 0;
		} else {
			leftDepth = maxDepth(root.left);
			rightDepth = maxDepth(root.right);
			
			int resultDepth = Math.max(leftDepth, rightDepth);
			
			// 자식들이 존재하지 않아도 나는 존재할 수 있으니 +1
			return resultDepth + 1;
		}
	}
}