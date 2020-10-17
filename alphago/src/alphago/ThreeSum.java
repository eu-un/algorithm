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
		
		// �ϳ��� �����صΰ� �������� ���ϱ� ������ -2
		for(int i = 0; i < nums_len - 2; i++) {
			// ���ߴ� ���ڴ� �ǳ� �ٱ�
			if(i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				int low = i + 1;
				int high = nums_len - 1;
				
				// a + b + c = 0   ��   a + b = -c
				// �� �ڽſ��� -�� ���� �� ���� ã���� ��
				int sum = 0 - nums[i]; 
				
				while(low < high) {
					if(nums[low] + nums[high] == sum) {
						result.add(Arrays.asList(nums[i], nums[low], nums[high]));
						// �ߺ� ����!
						while(low < high && nums[low] == nums[low + 1]) { low++; } // nums[low]�� ���� ���� ������ �ٸ� ������ low�� ����
						while(low < high && nums[high] == nums[high - 1]) { high--; } // nums[high]�� �� ���� ������ �ٸ� ������ high�� ����
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
