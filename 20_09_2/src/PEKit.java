public class PEKit {
	public static int solution(int n, int lost[], int reserve[]) {
		int answer = 0;
		int[] student = new int[n+1];
		
		// �л� �� �ʱ�ȭ(������ �� �����Դٰ� ����)
		// student[i] = 0 �� ü���� ����
		// student[i] = 1 �� ü���� ����
		for(int i = 1; i <= n; i++) {
			student[i] = 1;
		}
		
		// ��������(lost) ��� = 0
		for(int l : lost) {
			student[l]--;
		}
		
		// ���� ������ ��� = 2
		for(int r : reserve) {
			student[r]++;
		}
	
		// �� ��ȣ�� ü���� ���� ������ �����ֱ�
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
		
		// ü������ �� �� �̻� ������ ������ ���� ����
		for(int i = 1; i <= n; i++) {
			if(student[i] >= 1) {
				answer++;
			}
		}
		
		return answer;
	}

}
