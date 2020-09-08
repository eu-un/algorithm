public class PEKit {
	public static int solution(int n, int lost[], int reserve[]) {
		int answer = 0;
		int[] student = new int[n + 1];
		
		// 학생 수 초기화(무조건 다 가져왔다고 생각)
		// student[i] = 0 ⇒ 체육복 없음
		// student[i] = 1 ⇒ 체육복 있음
		for(int i = 1; i <= n; i++) {
			student[i] = 1;
		}
		
		// 도난당한(lost) 사람 = 0
		for(int l : lost) {
			student[l]--;
		}
		
		// 여분 가져온 사람 = 2
		for(int r : reserve) {
			student[r]++;
		}
	
		// 옆 번호가 체육복 여분 있으면 나눠주기
		for(int i = 1; i <= n; i++) {
			
			if(student[i] == 0) {
				
				if(i >= 2 && student[i - 1] == 2) {
					student[i - 1]--;
					student[i]++;
				} else if(i + 1 <= n && student[i + 1] == 2) {
					student[i + 1]--;
					student[i]++;
				} 
			} 
		}
		
		// 체육복을 한 개 이상 가지고 있으면 수업 참여
		for(int i = 1; i <= n; i++) {
			if(student[i] >= 1) {
				answer++;
			}
		}
		return answer;
	}
}
