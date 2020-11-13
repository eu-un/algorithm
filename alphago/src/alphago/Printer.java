package alphago;

import java.util.Collections;
import java.util.PriorityQueue;

/*
	�׽�Ʈ 1 ��	��� (1.35ms, 52.7MB)
	�׽�Ʈ 2 ��	��� (2.21ms, 52.1MB)
	�׽�Ʈ 3 ��	��� (0.51ms, 52MB)
	�׽�Ʈ 4 ��	��� (0.29ms, 52.6MB)
	�׽�Ʈ 5 ��	��� (0.15ms, 52MB)
	�׽�Ʈ 6 ��	��� (0.67ms, 51.9MB)
	�׽�Ʈ 7 ��	��� (0.72ms, 53MB)
	�׽�Ʈ 8 ��	��� (4.13ms, 52.6MB)
	�׽�Ʈ 9 ��	��� (0.21ms, 52.9MB)
	�׽�Ʈ 10 ��	��� (0.70ms, 53MB)
	�׽�Ʈ 11 ��	��� (1.33ms, 52.8MB)
	�׽�Ʈ 12 ��	��� (0.29ms, 52.2MB)
	�׽�Ʈ 13 ��	��� (1.71ms, 53.4MB)
	�׽�Ʈ 14 ��	��� (0.14ms, 53.2MB)
	�׽�Ʈ 15 ��	��� (0.18ms, 53.3MB)
	�׽�Ʈ 16 ��	��� (0.33ms, 52.2MB)
	�׽�Ʈ 17 ��	��� (2.30ms, 51.6MB)
	�׽�Ʈ 18 ��	��� (0.31ms, 51.9MB)
	�׽�Ʈ 19 ��	��� (1.66ms, 52.2MB)
	�׽�Ʈ 20 ��	��� (0.64ms, 54MB)
*/

public class Printer {
	public int solution(int[] priorities, int location) {
        int answer = 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // �켱������ ���� ������ ����
        
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