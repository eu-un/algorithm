package alphago;

import java.util.Collections;
import java.util.PriorityQueue;

/*
	테스트 1 〉	통과 (1.35ms, 52.7MB)
	테스트 2 〉	통과 (2.21ms, 52.1MB)
	테스트 3 〉	통과 (0.51ms, 52MB)
	테스트 4 〉	통과 (0.29ms, 52.6MB)
	테스트 5 〉	통과 (0.15ms, 52MB)
	테스트 6 〉	통과 (0.67ms, 51.9MB)
	테스트 7 〉	통과 (0.72ms, 53MB)
	테스트 8 〉	통과 (4.13ms, 52.6MB)
	테스트 9 〉	통과 (0.21ms, 52.9MB)
	테스트 10 〉	통과 (0.70ms, 53MB)
	테스트 11 〉	통과 (1.33ms, 52.8MB)
	테스트 12 〉	통과 (0.29ms, 52.2MB)
	테스트 13 〉	통과 (1.71ms, 53.4MB)
	테스트 14 〉	통과 (0.14ms, 53.2MB)
	테스트 15 〉	통과 (0.18ms, 53.3MB)
	테스트 16 〉	통과 (0.33ms, 52.2MB)
	테스트 17 〉	통과 (2.30ms, 51.6MB)
	테스트 18 〉	통과 (0.31ms, 51.9MB)
	테스트 19 〉	통과 (1.66ms, 52.2MB)
	테스트 20 〉	통과 (0.64ms, 54MB)
*/

public class Printer {
	public int solution(int[] priorities, int location) {
        int answer = 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 우선순위가 높은 순으로 정렬
        
        for(int p : priorities) { pq.add(p); }
        
        while(!pq.isEmpty()) {
        	for(int i = 0; i < priorities.length; i++) {
        		if(priorities[i] == pq.peek()) {
        			if(location == i) {
        				return answer;
        			} // if end
        			answer++;
        			pq.poll();
        		} // if end
        	} // for end
        } // while end
        return answer;
    }
}