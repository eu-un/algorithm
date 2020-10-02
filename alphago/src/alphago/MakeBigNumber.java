package alphago;

/*
 *	�׽�Ʈ 1 ��	��� (0.04ms, 51.9MB)
	�׽�Ʈ 2 ��	��� (0.03ms, 51.8MB)
	�׽�Ʈ 3 ��	��� (0.08ms, 52.7MB)
	�׽�Ʈ 4 ��	��� (0.18ms, 52.6MB)
	�׽�Ʈ 5 ��	��� (0.61ms, 51.8MB)
	�׽�Ʈ 6 ��	��� (17.36ms, 52.6MB)
	�׽�Ʈ 7 ��	��� (43.46ms, 53.1MB)
	�׽�Ʈ 8 ��	��� (150.96ms, 53.2MB)
	�׽�Ʈ 9 ��	��� (25.31ms, 57.1MB)
	�׽�Ʈ 10 ��	��� (4841.41ms, 59.5MB)
	�׽�Ʈ 11 ��	��� (0.05ms, 52.3MB)
	�׽�Ʈ 12 ��	��� (0.05ms, 51.9MB)
 * */



public class MakeBigNumber {
	public static String solution(String number, int k) {
        
		StringBuilder sb = new StringBuilder();
		int n_len = number.length();
		
		// �����ϴ� ���� ���� ex) number = 1231234, k = 3 -> select_num = 7 - 3 = 4
		int select_num = n_len - k;
		char maxNum;
		int start = 0, end = 0;
		
		// ���õ� �� �ִ� ������ ���̸�ŭ for
		for(int i = 0; i < select_num; i++) {
			maxNum = number.charAt(start);
			
			// ���� index���� ū ���ڰ� ������ �ش� ���ڸ� maxNum�� �����ϰ�,
        	// �� index�� end�� ����
			for(int j = start; j <= (i + k); j++) {
				if(maxNum < number.charAt(j)) {
					maxNum = number.charAt(j);
					end = j;
				} // if end
			} // for end
			
			sb.append(maxNum);
			
			// maxNum�� �����ϰ� ���� ���� index�� ����
			start = end + 1;
			end = start; // end�� index�� start�� index��
		} // for end
		
        return sb.toString();
    }
}
