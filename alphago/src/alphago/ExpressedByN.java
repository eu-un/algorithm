package alphago;

/*
	�׽�Ʈ 1 ��	��� (7.95ms, 53.8MB)
	�׽�Ʈ 2 ��	��� (4.17ms, 52.2MB)
	�׽�Ʈ 3 ��	��� (5.54ms, 52.7MB)
	�׽�Ʈ 4 ��	��� (8.45ms, 52.5MB)
	�׽�Ʈ 5 ��	��� (5.49ms, 52.3MB)
	�׽�Ʈ 6 ��	��� (4.56ms, 53MB)
	�׽�Ʈ 7 ��	��� (5.70ms, 52.8MB)
	�׽�Ʈ 8 ��	��� (8.06ms, 52.5MB)
	�׽�Ʈ 9 ��	��� (5.21ms, 52.1MB) 
*/

public class ExpressedByN {
	static int answer = -1;
	
	public static int solution(int N, int number) {
		dfs(N, number, 0, 0);
		return answer;
	}
	
	// N�� ������ �÷����� ���� ex) 5, 55, 555, 5555������
	public static void dfs(int N, int number, int idx, int res) {
		if(idx > 8) {
			answer = -1;
			return;
		}
		
		int tmp = N;
		
		if(number == res) {
			if(answer == -1 || answer > idx) { answer = idx; }
			return;
		}
		
		for(int i = 0; i < 8 - idx; i++) {
			dfs(N, number, idx + i + 1, res + tmp);
			dfs(N, number, idx + i + 1, res - tmp);
			dfs(N, number, idx + i + 1, res * tmp);
			dfs(N, number, idx + i + 1, res / tmp);
			
			tmp = tmp * 10 + N;
		} // for end
	}
}