/*
 *	테스트 1 〉	통과 (0.04ms, 51.9MB)
	테스트 2 〉	통과 (0.03ms, 51.8MB)
	테스트 3 〉	통과 (0.08ms, 52.7MB)
	테스트 4 〉	통과 (0.18ms, 52.6MB)
	테스트 5 〉	통과 (0.61ms, 51.8MB)
	테스트 6 〉	통과 (17.36ms, 52.6MB)
	테스트 7 〉	통과 (43.46ms, 53.1MB)
	테스트 8 〉	통과 (150.96ms, 53.2MB)
	테스트 9 〉	통과 (25.31ms, 57.1MB)
	테스트 10 〉	통과 (4841.41ms, 59.5MB)
	테스트 11 〉	통과 (0.05ms, 52.3MB)
	테스트 12 〉	통과 (0.05ms, 51.9MB)
 * */



public class MakeBigNumber {
	public static String solution(String number, int k) {
        
		StringBuilder sb = new StringBuilder();
		int n_len = number.length();
		
		// 선택하는 수의 길이 ex) number = 1231234, k = 3 -> select_num = 7 - 3 = 4
		int select_num = n_len - k;
		char maxNum;
		int start = 0, end = 0;
		
		// 선택될 수 있는 숫자의 길이만큼 for
		for(int i = 0; i < select_num; i++) {
			maxNum = number.charAt(start);
			
		// 선택 index보다 큰 숫자가 나오면 해당 숫자를 maxNum에 저장하고,
        	// 그 index를 end에 저장
			for(int j = start; j <= (i + k); j++) {
				if(maxNum < number.charAt(j)) {
					maxNum = number.charAt(j);
					end = j;
				} // if end
			} // for end
			
			sb.append(maxNum);
			
			// maxNum에 저장하고 나면 다음 index로 가기
			start = end + 1;
			end = start; // end의 index를 start의 index로
		} // for end
		
        return sb.toString();
    }
}
