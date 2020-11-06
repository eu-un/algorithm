package alphago;

import java.util.LinkedList;
import java.util.Queue;

/*
	테스트 1 〉	통과 (3.19ms, 52.4MB)
	테스트 2 〉	통과 (11.57ms, 53.8MB)
	테스트 3 〉	통과 (0.21ms, 52.5MB)
	테스트 4 〉	통과 (8.68ms, 52.7MB)
	테스트 5 〉	통과 (33.63ms, 61.6MB)
	테스트 6 〉	통과 (16.13ms, 54.5MB)
	테스트 7 〉	통과 (1.54ms, 53MB)
	테스트 8 〉	통과 (0.64ms, 52.9MB)
	테스트 9 〉	통과 (6.48ms, 52.4MB)
	테스트 10 〉	통과 (0.65ms, 54.7MB)
	테스트 11 〉	통과 (0.14ms, 52.8MB)
	테스트 12 〉	통과 (0.93ms, 52.9MB)
	테스트 13 〉	통과 (2.02ms, 51.8MB)
	테스트 14 〉	통과 (1.50ms, 52.7MB)
 */

public class TruckPassingTheBridge {
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0, truck_one = 0;
        Queue<Integer> bridge = new LinkedList<>();
        
        for(int i = 0; i < bridge_length; i++) { bridge.offer(0); }
        
        while(!bridge.isEmpty()) {
        	int popped = bridge.poll();
        	sum -= popped; // 트럭 하나가 다 지났으면 최대 무게에서 빼줌
        	
        	if(truck_one < truck_weights.length) {
        		if(sum + truck_weights[truck_one] <= weight) { // 최대 무게를 넘지 않을 경우
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
