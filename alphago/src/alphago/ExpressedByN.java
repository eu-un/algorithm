package alphago;

/*
	테스트 1 〉	통과 (7.95ms, 53.8MB)
	테스트 2 〉	통과 (4.17ms, 52.2MB)
	테스트 3 〉	통과 (5.54ms, 52.7MB)
	테스트 4 〉	통과 (8.45ms, 52.5MB)
	테스트 5 〉	통과 (5.49ms, 52.3MB)
	테스트 6 〉	통과 (4.56ms, 53MB)
	테스트 7 〉	통과 (5.70ms, 52.8MB)
	테스트 8 〉	통과 (8.06ms, 52.5MB)
	테스트 9 〉	통과 (5.21ms, 52.1MB) 
*/

public class ExpressedByN {
	static int answer = -1;
	
	public static int solution(int N, int number) {
		dfs(N, number, 0, 0);
		return answer;
	}
	
	// N의 갯수를 늘려가며 실행 ex) 5, 55, 555, 5555···
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