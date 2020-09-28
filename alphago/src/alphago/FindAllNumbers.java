package alphago;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbers {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result = new ArrayList<Integer>();
		boolean[] checkArray = new boolean[nums.length + 1]; 
		
		for(int i = 0; i < nums.length; i++) {
			checkArray[nums[i]] = true;
		} // for end
		
		for(int i = 1; i < nums.length; i++) {
			if(checkArray[i] == false) {
				result.add(i);
			} // if end
		} // for end
		 
		return result;
	}

}
