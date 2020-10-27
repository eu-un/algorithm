package alphago;

import java.util.LinkedList;
import java.util.Queue;

/*
	[정확성 테스트]
	테스트 1 〉	통과 (0.26ms, 52.2MB)
	테스트 2 〉	통과 (1.81ms, 52.2MB)
	테스트 3 〉	통과 (2.92ms, 52.7MB)
	테스트 4 〉	통과 (3.02ms, 53.6MB)
	테스트 5 〉	통과 (3.56ms, 52.4MB)
	테스트 6 〉	통과 (0.40ms, 51.9MB)
	테스트 7 〉	통과 (2.16ms, 52.9MB)
	테스트 8 〉	통과 (2.33ms, 53.1MB)
	테스트 9 〉	통과 (0.42ms, 54.1MB)
	테스트 10 〉	통과 (3.18ms, 52.9MB)
	
	[효율성 테스트]
	테스트 1 〉	통과 (59.91ms, 77.4MB)
	테스트 2 〉	통과 (43.22ms, 69.3MB)
	테스트 3 〉	통과 (83.45ms, 73.8MB)
	테스트 4 〉	통과 (58.92ms, 73.4MB)
	테스트 5 〉	통과 (54.33ms, 71.5MB)
*/

public class StockPrice {
	public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> queue = new LinkedList<Integer>();
        
        for(int i = 0; i < prices.length; i++) {
        	queue.add(prices[i]);
        } // for end
        
        for(int i = 0; i < prices.length; i++) {
        	// queue.peek() 하면 앞 데이터가 삭제가 안됨.
        	int pri = queue.poll();        	
        	int cnt = 0;
        	
        	for(int q : queue) {
        		if(pri <= q) { // 가격 안 떨어졌을 때
        			cnt++;
        		} else { // 가격 떨어졌을 때
        			cnt++;
        			break;
        		} // if ~ else end
        	} // for q : queue end
        	answer[i] = cnt;
        } // for(i) end
        return answer;
    }
}
