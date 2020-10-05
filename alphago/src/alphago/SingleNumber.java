package alphago;

// Runtime: 5 ms, Memory: 39.2 MB

import java.util.Arrays;

public class SingleNumber {
	public static int singleNumber(int[] nums) {
		int n_len = nums.length;
		
		// nums 정렬
		Arrays.sort(nums);
		
		// 2개 비교해서 같으면 2개 뒤로 넘어감.
		// ex) nums[0]이랑 nums[1] 비교한 다음 nums[2]랑 nums[3] 비교
		for(int i = 0; i < n_len - 1; i+=2) {
			if(nums[i] != nums[i + 1]) {
				return nums[i];
			} // if end
		} // for end
		
		// 다 비교했을 때 모두 같으면 마지막 값이 하나인 값
		return nums[n_len - 1];
	}
}
