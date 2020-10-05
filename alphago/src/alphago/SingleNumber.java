package alphago;

// Runtime: 5 ms, Memory: 39.2 MB

import java.util.Arrays;

public class SingleNumber {
	public static int singleNumber(int[] nums) {
		int n_len = nums.length;
		
		// nums ����
		Arrays.sort(nums);
		
		// 2�� ���ؼ� ������ 2�� �ڷ� �Ѿ.
		// ex) nums[0]�̶� nums[1] ���� ���� nums[2]�� nums[3] ��
		for(int i = 0; i < n_len - 1; i+=2) {
			if(nums[i] != nums[i + 1]) {
				return nums[i];
			} // if end
		} // for end
		
		// �� ������ �� ��� ������ ������ ���� �ϳ��� ��
		return nums[n_len - 1];
	}
}
