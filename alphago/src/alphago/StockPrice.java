package alphago;

import java.util.LinkedList;
import java.util.Queue;

/*
	[��Ȯ�� �׽�Ʈ]
	�׽�Ʈ 1 ��	��� (0.26ms, 52.2MB)
	�׽�Ʈ 2 ��	��� (1.81ms, 52.2MB)
	�׽�Ʈ 3 ��	��� (2.92ms, 52.7MB)
	�׽�Ʈ 4 ��	��� (3.02ms, 53.6MB)
	�׽�Ʈ 5 ��	��� (3.56ms, 52.4MB)
	�׽�Ʈ 6 ��	��� (0.40ms, 51.9MB)
	�׽�Ʈ 7 ��	��� (2.16ms, 52.9MB)
	�׽�Ʈ 8 ��	��� (2.33ms, 53.1MB)
	�׽�Ʈ 9 ��	��� (0.42ms, 54.1MB)
	�׽�Ʈ 10 ��	��� (3.18ms, 52.9MB)
	
	[ȿ���� �׽�Ʈ]
	�׽�Ʈ 1 ��	��� (59.91ms, 77.4MB)
	�׽�Ʈ 2 ��	��� (43.22ms, 69.3MB)
	�׽�Ʈ 3 ��	��� (83.45ms, 73.8MB)
	�׽�Ʈ 4 ��	��� (58.92ms, 73.4MB)
	�׽�Ʈ 5 ��	��� (54.33ms, 71.5MB)
*/

public class StockPrice {
	public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> queue = new LinkedList<Integer>();
        
        for(int i = 0; i < prices.length; i++) {
        	queue.add(prices[i]);
        } // for end
        
        for(int i = 0; i < prices.length; i++) {
        	// queue.peek() �ϸ� �� �����Ͱ� ������ �ȵ�.
        	int pri = queue.poll();        	
        	int cnt = 0;
        	
        	for(int q : queue) {
        		if(pri <= q) { // ���� �� �������� ��
        			cnt++;
        		} else { // ���� �������� ��
        			cnt++;
        			break;
        		} // if ~ else end
        	} // for q : queue end
        	answer[i] = cnt;
        } // for(i) end
        return answer;
    }
}
