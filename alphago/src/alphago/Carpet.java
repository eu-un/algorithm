package alphago;

/*
	�׽�Ʈ 1 ��	��� (0.02ms, 52.9MB)
	�׽�Ʈ 2 ��	��� (0.02ms, 52MB)
	�׽�Ʈ 3 ��	��� (0.05ms, 52.6MB)
	�׽�Ʈ 4 ��	��� (0.04ms, 53.5MB)
	�׽�Ʈ 5 ��	��� (0.02ms, 52.2MB)
	�׽�Ʈ 6 ��	��� (0.03ms, 52.9MB)
	�׽�Ʈ 7 ��	��� (0.04ms, 52MB)
	�׽�Ʈ 8 ��	��� (0.05ms, 52.4MB)
	�׽�Ʈ 9 ��	��� (0.04ms, 52.6MB)
	�׽�Ʈ 10 ��	��� (0.06ms, 52.1MB)
	�׽�Ʈ 11 ��	��� (0.02ms, 52MB)
	�׽�Ʈ 12 ��	��� (0.02ms, 51.8MB)
	�׽�Ʈ 13 ��	��� (0.03ms, 52.8MB) 
*/

public class Carpet {
	public int[] solution(int brown, int yellow) {
        int[] answer = {0, 0};
        int area = brown + yellow; // ����(row) * ����(col)
        int perimeter = (brown + 4) / 2; // ����(row) + ����(col)
        
        for(int col = 1; col < area; col++) {
        	int row = area / col;
        	
        	if(row * col == area) { // i*j�� area�̸� ��� �̹Ƿ�
        		if(row + col == perimeter) {
            		answer[0] = row;
            		answer[1] = col;
            		break;
            	}
        	}
        }
        return answer;
    }
}
