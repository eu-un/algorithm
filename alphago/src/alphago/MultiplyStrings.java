package alphago;

/* Runtime: 7 ms, Memory: 39 MB */

public class MultiplyStrings {
	public static String multiply(String num1, String num2) {
		int num1_len = num1.length();
		int num2_len = num2.length();
		int res_len = num1_len + num2_len; // ���� ����� ������ �ִ�� �� ���̸� ���� �Ͱ� ���� ex) 999*999=998001
		int[] res = new int[res_len];
		
		StringBuilder result = new StringBuilder();
		
		if(num1 == null || num2 == null || num1.equals("0") || num2.equals("0")) {
			return "0";
		} // if end
		
		
		// �� �� �ڸ����� ���� ����
		for(int i = num1_len - 1; i >= 0; i--) {
			for(int j = num2_len - 1; j >= 0; j--) {
				
				int num1_int = num1.charAt(i) - '0';
				int num2_int = num2.charAt(j) - '0';
				
				res[i + j] += num1_int * num2_int;
				
				// i + j = 0 �̸� �� �̻� ������ �ѱ� ���� ����
				if(res[i + j] >= 10 && i + j != 0) {
					res[i + j - 1] += res[i + j] / 10;
					res[i + j] = res[i + j] % 10;
				} // if end
			} // for end
		} // for end
		
		// 0 ���� �����̹Ƿ� res_len���� 1 ��
		for(int i = 0; i < res_len - 1; i++) {
			result.append(res[i]);
		} // for end
		
		return result.toString();
	}
}
