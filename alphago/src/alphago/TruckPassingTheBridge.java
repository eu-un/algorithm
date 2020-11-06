package alphago;

import java.util.LinkedList;
import java.util.Queue;

/*
	�׽�Ʈ 1 ��	��� (3.19ms, 52.4MB)
	�׽�Ʈ 2 ��	��� (11.57ms, 53.8MB)
	�׽�Ʈ 3 ��	��� (0.21ms, 52.5MB)
	�׽�Ʈ 4 ��	��� (8.68ms, 52.7MB)
	�׽�Ʈ 5 ��	��� (33.63ms, 61.6MB)
	�׽�Ʈ 6 ��	��� (16.13ms, 54.5MB)
	�׽�Ʈ 7 ��	��� (1.54ms, 53MB)
	�׽�Ʈ 8 ��	��� (0.64ms, 52.9MB)
	�׽�Ʈ 9 ��	��� (6.48ms, 52.4MB)
	�׽�Ʈ 10 ��	��� (0.65ms, 54.7MB)
	�׽�Ʈ 11 ��	��� (0.14ms, 52.8MB)
	�׽�Ʈ 12 ��	��� (0.93ms, 52.9MB)
	�׽�Ʈ 13 ��	��� (2.02ms, 51.8MB)
	�׽�Ʈ 14 ��	��� (1.50ms, 52.7MB)
 */

public class TruckPassingTheBridge {
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0, truck_one = 0;
        Queue<Integer> bridge = new LinkedList<>();
        
        for(int i = 0; i < bridge_length; i++) { bridge.offer(0); }
        
        while(!bridge.isEmpty()) {
        	int popped = bridge.poll();
        	sum -= popped; // Ʈ�� �ϳ��� �� �������� �ִ� ���Կ��� ����
        	
        	if(truck_one < truck_weights.length) {
        		if(sum + truck_weights[truck_one] <= weight) { // �ִ� ���Ը� ���� ���� ���
        			bridge.offer(truck_weights[truck_one]);
        			sum += truck_weights[truck_one];
        			truck_one++;
        		} else {
        			bridge.offer(0);
        		} // if ~ else end
        	} // if end
        	answer++;
        } // while end
        return answer;
    }
}
