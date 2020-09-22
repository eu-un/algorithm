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
			
			// �ڽĵ��� �������� �ʾƵ� ���� ������ �� ������ +1
			return resultDepth + 1;
		}
	}
}