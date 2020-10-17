package alphago;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Runtime: 20 ms, Memory: 42.7 MB */

public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums) {
		int nums_len = nums.length;
		List<List<Integer>> result = new ArrayList<>();
		
		if(nums_len == 0 || nums_len < 3) { return result; }
		
		Arrays.sort(nums);
		
		// 하나는 지정해두고 나머지를 비교하기 때문에 -2
		for(int i = 0; i < nums_len - 2; i++) {
			// 비교했던 숫자는 건너 뛰기
			if(i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				int low = i + 1;
				int high = nums_len - 1;
				
				// a + b + c = 0   ⇒   a + b = -c
				// 나 자신에서 -를 붙인 그 값을 찾으면 됨
				int sum = 0 - nums[i]; 
				
				while(low < high) {
					if(nums[low] + nums[high] == sum) {
						result.add(Arrays.asList(nums[i], nums[low], nums[high]));
						// 중복 제거!
						while(low < high && nums[low] == nums[low + 1]) { low++; } // nums[low]가 다음 값과 같으면 다를 때까지 low를 증가
						while(low < high && nums[high] == nums[high - 1]) { high--; } // nums[high]가 전 값과 같으면 다를 때까지 high를 감소
						low++;
						high--;
					} else if(nums[low] + nums[high] > sum) {
						high--;
					} else {
						low++;
					} // if ~ else if ~ else end
				} // while end
			} // if end
		} // for end
		return result;
    }
}
