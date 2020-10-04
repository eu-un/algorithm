package alphago;

/*
	Runtime : 61 ms
	Memory : 39.1 MB
*/

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		int num_len = nums.length;
		
		for(int i = 0; i < num_len - 1; i++) { // 자기 자신 제외 비교
			for(int j = i + 1; j < num_len; j++) { // 앞에 비교한 것 비교X
				if(nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
				} // if end
			} // for end 
		} // for end
		return result;
	}
}