package alphago;

/*
	테스트 1 〉	통과 (0.02ms, 52.9MB)
	테스트 2 〉	통과 (0.02ms, 52MB)
	테스트 3 〉	통과 (0.05ms, 52.6MB)
	테스트 4 〉	통과 (0.04ms, 53.5MB)
	테스트 5 〉	통과 (0.02ms, 52.2MB)
	테스트 6 〉	통과 (0.03ms, 52.9MB)
	테스트 7 〉	통과 (0.04ms, 52MB)
	테스트 8 〉	통과 (0.05ms, 52.4MB)
	테스트 9 〉	통과 (0.04ms, 52.6MB)
	테스트 10 〉	통과 (0.06ms, 52.1MB)
	테스트 11 〉	통과 (0.02ms, 52MB)
	테스트 12 〉	통과 (0.02ms, 51.8MB)
	테스트 13 〉	통과 (0.03ms, 52.8MB) 
*/

public class Carpet {
	public int[] solution(int brown, int yellow) {
        int[] answer = {0, 0};
        int area = brown + yellow; // 가로(row) * 세로(col)
        int perimeter = (brown + 4) / 2; // 가로(row) + 세로(col)
        
        for(int col = 1; col < area; col++) {
        	int row = area / col;
        	
        	if(row * col == area) { // i*j가 area이면 배수 이므로
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
